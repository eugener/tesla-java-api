package org.oxbow.tesla;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import retrofit2.Call;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.function.Function;

class BaseService {

    private static final Gson GSON = new Gson();

    <T> T asResponse(Call<Response<T>> call ) {
        return executeCall(call).content;
    }

    <T> T asResult(Call<Response<Result<T>>> call ) {
        return asResponse(call).result;
    }

    <T> T executeCall(Call<T> call ) {
        return executeCall(call, RuntimeException::new, RuntimeException::new );
    }

    <T> T executeCall(Call<T> call,
                      Function<Throwable,RuntimeException> fromCause,
                      Function<String,RuntimeException> fromText) {

        try {
            retrofit2.Response<T> response = Objects.requireNonNull( call ).execute();
            if ( response.isSuccessful() ) {
                return response.body();
            } else {
                String errorJson = new String( Objects.requireNonNull(response.errorBody()).bytes(), StandardCharsets.UTF_8);
                ErrorHolder errorHolder = GSON.fromJson(errorJson, ErrorHolder.class );
                throw produceException( fromText, errorHolder.error);
            }
        } catch (IOException e) {
            throw produceException( fromCause, e);
        }
    }

    private <T> RuntimeException produceException(Function<T,RuntimeException> producer, T value ) {
        return producer != null ? producer.apply(value) : new RuntimeException("Exception producer is null");
    }

}

class Response<T> {
    @SerializedName("response")
    final T content = null;
}

class Result<T> {
    @SerializedName("result")
    final T result = null;
}


class ErrorHolder {
    @SerializedName("error")
    final String error = null;
}
