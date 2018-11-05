package org.oxbow.tesla;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.adapter.java8.Java8CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.Optional;

public final class TeslaClientBuilder {

    private static final String BASE_URL      = "https://owner-api.teslamotors.com/";
    @SuppressWarnings("SpellCheckingInspection")
    private static final String CLIENT_ID     = "81527cff06843c8634fdc09e8ac0abefb46ac849f38fe1e431c2ef2106796384";
    @SuppressWarnings("SpellCheckingInspection")
    private static final String CLIENT_SECRET = "c7257eb71a564034f9419ee651c7d0e5f7aa6bfbd18bafb5c5c033b093bb2fa3";

    private final Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(Java8CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    private String clientId = null;
    private String clientSecret = null;

    private final String email;
    private final String password;

    /**
     * Creates a Tesla client builder based user credentials
     * @param email user email1
     * @param password user password
     */
    TeslaClientBuilder( String email, String password ) {
        this.email = email;
        this.password = password;
    }

    /**
     * Allows to customization of client ide and secret
     * Builtin ones are used by default
     * @param clientId client id
     * @param clientSecret client secret
     */
    public final void client(String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    /**
     * Builds TeslaClient using applied configuration
     * @return TeslaClient
     */
    public final TeslaClient build() {

        Call<TokenResponse> tokenCall = retrofit.create(TeslaAuthService.class).getToken(
                "password",
                Optional.ofNullable(clientId).orElse(CLIENT_ID),
                Optional.ofNullable(clientSecret).orElse(CLIENT_SECRET),
                email,
                password);

        return new TeslaClient( retrofit.create(TeslaService.class), tokenCall);
    }

}