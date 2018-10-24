package org.oxbow.tesla;

import org.oxbow.tesla.domain.ChargeState;
import org.oxbow.tesla.domain.Vehicle;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.List;

interface TeslaService {

    String VERSION = "1";
    String BASE_URL = "/api/" + VERSION + "/vehicles/";
    String AUTHORIZATION_HEADER = "Authorization";

    @GET(BASE_URL)
    Call<Response<List<Vehicle>>> getVehicles(@Header(AUTHORIZATION_HEADER) String authorization);

    @GET(BASE_URL + "{id}")
    Call<Response<Vehicle>> getVehicle(@Header(AUTHORIZATION_HEADER) String authorization, @Path("id") long id);

    @GET(BASE_URL + "{id}/data_request/charge_state")
    Call<Response<ChargeState>> getChargeState(@Header(AUTHORIZATION_HEADER) String authorization, @Path("id") long id);


    // Commands

    @POST(BASE_URL + "{id}/command/wake")
    Call<Result<Boolean>> wake(@Header(AUTHORIZATION_HEADER) String authorization, @Path("id") long id);


}
