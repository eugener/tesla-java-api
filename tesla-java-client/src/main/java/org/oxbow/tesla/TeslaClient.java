package org.oxbow.tesla;

import org.oxbow.tesla.domain.ChargeState;
import org.oxbow.tesla.domain.Vehicle;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

public final class TeslaClient {

    private final TeslaService service;
    private final Call<TokenResponse> tokenCall;

    TeslaClient(TeslaService service, Call<TokenResponse> tokenCall ) {
        this.service = service;
        this.tokenCall = tokenCall;
    }

    public static TeslaClientBuilder Builder( String email, String password ) {
        return new TeslaClientBuilder(email,password);
    }

    // TODO refresh token when expired
    private String getTokenHeaderValue() throws IOException {
        Response<TokenResponse> response = tokenCall.clone().execute();
        if (!response.isSuccessful()) {
            throw new AuthorizationException(response.message());
        }
        TokenResponse tokenResponse = response.body();
        return  tokenResponse.getTokenType() + " " + tokenResponse.getAccessToken();
    }


    /**
     * Retrieve a list of your owned vehicles (includes vehicles not yet shipped!)
     * @return list of vehicles
     * @throws IOException
     */
    public List<Vehicle> getVehicles() throws IOException {
        return service.getVehicles(getTokenHeaderValue()).execute().body().getContent();
    }

    /**
     * Returns the state of the vehicle's various sub-systems.
     * @param id vehicle `id`
     * @return vehicle information
     * @throws IOException
     */
    public Vehicle getVehicle( long id ) throws IOException {
        return service.getVehicle(getTokenHeaderValue(), id).execute().body().getContent();
    }

    public ChargeState getChargeState( long id ) throws IOException {
        return service.getChargeState(getTokenHeaderValue(), id).execute().body().getContent();
    }

}

