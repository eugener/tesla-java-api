package org.oxbow.tesla;

import org.oxbow.tesla.domain.ChargeState;
import org.oxbow.tesla.domain.Vehicle;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

interface TeslaService {

    String VERSION = "1";
    String BASE_URL = "/api/" + VERSION + "/vehicles/";
    String AUTHORIZATION_HEADER = "Authorization";

    @GET(BASE_URL)
    @Headers({"Accept: application/json"})
    Call<Response<List<Vehicle>>> getVehicles(@Header(AUTHORIZATION_HEADER) String authorization);

    @GET(BASE_URL + "{id}")
    @Headers({"Accept: application/json"})
    Call<Response<Vehicle>> getVehicle(@Header(AUTHORIZATION_HEADER) String authorization, @Path("id") long id);

    @GET(BASE_URL + "{id}/data_request/charge_state")
    @Headers({"Accept: application/json"})
    Call<Response<ChargeState>> getChargeState(@Header(AUTHORIZATION_HEADER) String authorization, @Path("id") long id);


    // Commands

    @POST(BASE_URL + "{id}/command/wake_up")
    @Headers({"Accept: application/json"})
    Call<Response<Result<Boolean>>> wakeUp(@Header(AUTHORIZATION_HEADER) String authorization, @Path("id") long id);

    @POST(BASE_URL + "{id}/command/honk_horn")
    @Headers({"Accept: application/json"})
    Call<Response<Result<Boolean>>> honkHorn(@Header(AUTHORIZATION_HEADER) String authorization, @Path("id") long id);

}
