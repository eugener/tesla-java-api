package org.oxbow.tesla;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.function.Function;

class BaseService {

    private static Gson GSON = new Gson();

    <T> T getCallContent(Call<ContentHolder<T>> call ) {
        return getCallValue(call).getContent();
    }

    <T> T getCallValue(Call<T> call ) {
        return getCallValue(call, RuntimeException::new, RuntimeException::new );
    }

    <T> T getCallValue(Call<T> call,
                       Function<Throwable,RuntimeException> fromCause,
                       Function<String,RuntimeException> fromText) {

        try {
            Response<T> response = Objects.requireNonNull( call ).execute();
            if ( response.isSuccessful() ) {
                return response.body();
            } else {
                String errorJson = new String( response.errorBody().bytes(), StandardCharsets.UTF_8);
                ErrorHolder errorHolder = GSON.fromJson(errorJson, ErrorHolder.class );
                throw fromText.apply( errorHolder.error );
            }
        } catch (IOException e) {
            throw fromCause.apply(e);
        }
    }

}

class ErrorHolder {
    @SerializedName("error")
    String error;
}
