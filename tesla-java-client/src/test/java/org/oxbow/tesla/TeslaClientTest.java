package org.oxbow.tesla;

import org.junit.jupiter.api.Test;
import org.oxbow.tesla.domain.ChargeState;
import org.oxbow.tesla.domain.Vehicle;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class TeslaClientTest {

    private String user = System.getProperty("tesla.user");
    private String pswd = System.getProperty("tesla.pswd");

    private TeslaClient client = TeslaClient.Builder(user, pswd).build();

    private List<Vehicle> vehicles = null;
    private Long vehicleId = null;


    private List<Vehicle> getVehicles() {
        if ( vehicles == null ) {
            vehicles = client.getVehicles();
        }
        return vehicles;
    }

    private Long getVehicleId() {
        if ( vehicleId == null) {
            Long vehicleId = getVehicles().get(0).getId();
            System.out.println(vehicleId);
        }
        return vehicleId;
    }

    @Test
    public void wakeCommand() {
        assertTrue( client.wake(getVehicleId()) );
    }


        @Test
    public void vehicleAPI() {
        assertTrue( getVehicles().size() > 0);
        Long id = getVehicles().get(0).getId();
        Vehicle vehicle = client.getVehicle(id);
        assertEquals( id, vehicle.getId());
    }

    @Test
    public void chargeStateAPI() {
        client.wake(getVehicleId());
        ChargeState chargeState = client.getChargeState(getVehicleId());
        assertTrue( chargeState != null);
    }

}
