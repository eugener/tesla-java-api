package org.oxbow.tesla;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import retrofit2.Call;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.function.Function;

class BaseService {

    private static Gson GSON = new Gson();

    <T> T asResponse(Call<Response<T>> call ) {
        return executeCall(call).getContent();
    }

    <T> T asResult(Call<Response<Result<T>>> call ) {
        return asResponse(call).getResult();
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
                String errorJson = new String( response.errorBody().bytes(), StandardCharsets.UTF_8);
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
    private T content;

    T getContent() {
        return content;
    }
}

class Result<T> {

    @SerializedName("result")
    private T result;

    T getResult() {
        return result;
    }
}


class ErrorHolder {
    @SerializedName("error")
    String error;
}
