package org.oxbow.tesla;

import org.oxbow.tesla.domain.ChargeState;
import org.oxbow.tesla.domain.Vehicle;
import retrofit2.Call;

import java.util.List;

public final class TeslaClient extends BaseService {

    private final TeslaService service;
    private final Call<TokenResponse> tokenCall;

    TeslaClient(TeslaService service, Call<TokenResponse> tokenCall ) {
        this.service = service;
        this.tokenCall = tokenCall;
    }

    /**
     * Creates a builder, which is used to configure the client
     * @param email Tesla account email
     * @param password Tesla account password
     * @return TeslaClientBuilder
     */
    public static TeslaClientBuilder Builder( String email, String password ) {
        return new TeslaClientBuilder(email,password);
    }

    // TODO refresh token when expired
    private String getTokenHeaderValue() {
        TokenResponse tokenResponse = executeCall(
                tokenCall.clone(),
                AuthorizationException::new,
                AuthorizationException::new);
//        System.out.println(tokenResponse.getTokenType() + " " + tokenResponse.getAccessToken());
        return tokenResponse.getTokenType() + " " + tokenResponse.getAccessToken();
    }

    /**
     * Retrieve a list of your owned vehicles (includes vehicles not yet shipped!)
     * @return list of vehicles
     */
    public List<Vehicle> getVehicles() {
        return asResponse( service.getVehicles(getTokenHeaderValue()));
    }

    /**
     * Returns the state of the vehicle's various sub-systems.
     * @param id vehicle id
     * @return vehicle information
     */
    public Vehicle getVehicle( long id ) {
        return asResponse( service.getVehicle(getTokenHeaderValue(), id));
    }

    /**
     * Information on the battery state of charge and its various settings.
     * @param id vehicle id
     * @return charge state
     */
    public ChargeState getChargeState( long id ) {
        return asResponse( service.getChargeState(getTokenHeaderValue(), id));
    }


    // Commands

    /**
     * Attempts to wake the vehicle with given id up
     * @param id vehicle id
     * @return true on success
     */
    public boolean wakeUp(long id ) {
        return asResult( service.wakeUp(getTokenHeaderValue(),id));
    }

    /**
     * Attempts to hunk the horn for give vehicle
     * @param id vehicle id
     * @return true on success
     */
    public boolean honkHorn(long id ) {
        return asResult( service.honkHorn(getTokenHeaderValue(),id));
    }

}

