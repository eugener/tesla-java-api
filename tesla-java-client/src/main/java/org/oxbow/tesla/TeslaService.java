package org.oxbow.tesla;

import org.oxbow.tesla.domain.ChargeState;
import org.oxbow.tesla.domain.Vehicle;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

import java.util.List;

interface TeslaService {

   String VERSION = "1";

   @GET("/api/" + VERSION + "/vehicles")
   Call<ContentHolder<List<Vehicle>>> getVehicles(@Header("Authorization") String authorization);

   @GET("/api/" + VERSION + "/vehicles/{id}")
   Call<ContentHolder<Vehicle>> getVehicle(@Header("Authorization") String authorization, @Path("id") long id);

    @GET("/api/" + VERSION + "/vehicles/{id}/data_request/charge_state")
    Call<ContentHolder<ChargeState>> getChargeState(@Header("Authorization") String authorization, @Path("id") long id);


}
