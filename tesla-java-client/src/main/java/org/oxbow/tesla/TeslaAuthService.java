package org.oxbow.tesla;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

interface TeslaAuthService {

    @POST("/oauth/token")
    @FormUrlEncoded
    Call<TokenResponse> getToken(
            @Field("grant_type")    String grant_type,
            @Field("client_id")     String client_id,
            @Field("client_secret") String client_secret,
            @Field("email")         String email,
            @Field("password")      String password
    );
}