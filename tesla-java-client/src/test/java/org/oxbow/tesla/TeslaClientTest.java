package org.oxbow.tesla;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.oxbow.tesla.domain.ChargeState;
import org.oxbow.tesla.domain.Vehicle;

import java.util.List;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;
import static org.oxbow.tesla.TestSupport.*;

class TeslaClientTest  {

    private String user = System.getProperty("tesla.user");
    private String pswd = System.getProperty("tesla.pswd");

    private TeslaClient client = TeslaClient.Builder(user, pswd).build();

    private Supplier<List<Vehicle>> vehicles = cached( client::getVehicles);
    private Supplier<Long>         vehicleId = cached( () -> vehicles.get().get(0).getId());


    @Test
    @DisplayName("Wake Command")
    void testWakeCommand() {
        assertTrue( client.wakeUp( vehicleId.get() ));
    }

    @Test
    @DisplayName("Vehicle API")
    void testVehicleAPI() {
        assertFalse( vehicles.get().isEmpty());
        Long id = vehicleId.get();
        System.out.println(id);
        Vehicle vehicle = client.getVehicle(id);
        assertEquals( id, vehicle.getId());
    }

    @Test
    @DisplayName("Charge State API")
    void testChargeStateAPI() {
        client.wakeUp(vehicleId.get());
        ChargeState chargeState = client.getChargeState(vehicleId.get());
        assertNotNull(chargeState);
    }

}

