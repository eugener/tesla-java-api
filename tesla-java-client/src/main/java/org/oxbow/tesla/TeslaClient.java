package org.oxbow.tesla;

import org.oxbow.tesla.domain.ChargeState;
import org.oxbow.tesla.domain.Vehicle;
import retrofit2.Call;

import java.io.IOException;
import java.util.List;

public final class TeslaClient extends BaseService {

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
    private String getTokenHeaderValue() {
        TokenResponse tokenResponse = getCallValue(
                tokenCall.clone(),
                AuthorizationException::new,
                AuthorizationException::new);
        return tokenResponse.getTokenType() + " " + tokenResponse.getAccessToken();
    }

    /**
     * Retrieve a list of your owned vehicles (includes vehicles not yet shipped!)
     * @return list of vehicles
     * @throws IOException
     */
    public List<Vehicle> getVehicles() {
        return getCallContent( service.getVehicles(getTokenHeaderValue()));
    }

    /**
     * Returns the state of the vehicle's various sub-systems.
     * @param id vehicle `id`
     * @return vehicle information
     * @throws IOException
     */
    public Vehicle getVehicle( long id ) {
        return getCallContent( service.getVehicle(getTokenHeaderValue(), id));
    }

    public ChargeState getChargeState( long id ) {
        return getCallContent( service.getChargeState(getTokenHeaderValue(), id));
    }

}

