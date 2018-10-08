package org.oxbow.tesla;

import org.junit.Assert;
import org.junit.Test;
import org.oxbow.tesla.domain.ChargeState;
import org.oxbow.tesla.domain.Vehicle;

import java.io.IOException;
import java.util.List;

public class TeslaClientTest {

    private String user = System.getProperty("tesla.user");
    private String pswd = System.getProperty("tesla.pswd");

    private TeslaClient client = TeslaClient.Builder(user, pswd).build();

    @Test
    public void testVehicleAPI() throws IOException {
        List<Vehicle> vehicles = client.getVehicles();
        Assert.assertTrue( vehicles.size() > 0);
        Long id = vehicles.get(0).getId();
        Vehicle vehicle = client.getVehicle(id);
        Assert.assertEquals( id, vehicle.getId());
    }

    @Test
    public void testChargeStateAPI() throws IOException {
        List<Vehicle> vehicles = client.getVehicles();
        Assert.assertTrue( vehicles.size() > 0);
        Long id = vehicles.get(0).getId();
        ChargeState chargeState = client.getChargeState(id);
        Assert.assertTrue( chargeState != null);
    }

}
