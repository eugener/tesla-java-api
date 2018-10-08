package org.oxbow.tesla.domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

// See http://www.jsonschema2pojo.org/
public class ChargeState {

    @SerializedName("charging_state")
    @Expose
    private String chargingState;
    @SerializedName("fast_charger_type")
    @Expose
    private String fastChargerType;
    @SerializedName("fast_charger_brand")
    @Expose
    private String fastChargerBrand;
    @SerializedName("charge_limit_soc")
    @Expose
    private Integer chargeLimitSoc;
    @SerializedName("charge_limit_soc_std")
    @Expose
    private Integer chargeLimitSocStd;
    @SerializedName("charge_limit_soc_min")
    @Expose
    private Integer chargeLimitSocMin;
    @SerializedName("charge_limit_soc_max")
    @Expose
    private Integer chargeLimitSocMax;
    @SerializedName("charge_to_max_range")
    @Expose
    private Boolean chargeToMaxRange;
    @SerializedName("max_range_charge_counter")
    @Expose
    private Integer maxRangeChargeCounter;
    @SerializedName("fast_charger_present")
    @Expose
    private Object fastChargerPresent;
    @SerializedName("battery_range")
    @Expose
    private Double batteryRange;
    @SerializedName("est_battery_range")
    @Expose
    private Double estBatteryRange;
    @SerializedName("ideal_battery_range")
    @Expose
    private Double idealBatteryRange;
    @SerializedName("battery_level")
    @Expose
    private Integer batteryLevel;
    @SerializedName("usable_battery_level")
    @Expose
    private Integer usableBatteryLevel;
    @SerializedName("charge_energy_added")
    @Expose
    private Double chargeEnergyAdded;
    @SerializedName("charge_miles_added_rated")
    @Expose
    private Double chargeMilesAddedRated;
    @SerializedName("charge_miles_added_ideal")
    @Expose
    private Double chargeMilesAddedIdeal;
    @SerializedName("charger_voltage")
    @Expose
    private Object chargerVoltage;
    @SerializedName("charger_pilot_current")
    @Expose
    private Object chargerPilotCurrent;
    @SerializedName("charger_actual_current")
    @Expose
    private Object chargerActualCurrent;
    @SerializedName("charger_power")
    @Expose
    private Object chargerPower;
    @SerializedName("time_to_full_charge")
    @Expose
    private Double timeToFullCharge;
    @SerializedName("trip_charging")
    @Expose
    private Object tripCharging;
    @SerializedName("charge_rate")
    @Expose
    private Double chargeRate;
    @SerializedName("charge_port_door_open")
    @Expose
    private Object chargePortDoorOpen;
    @SerializedName("conn_charge_cable")
    @Expose
    private String connChargeCable;
    @SerializedName("scheduled_charging_start_time")
    @Expose
    private Object scheduledChargingStartTime;
    @SerializedName("scheduled_charging_pending")
    @Expose
    private Boolean scheduledChargingPending;
    @SerializedName("user_charge_enable_request")
    @Expose
    private Object userChargeEnableRequest;
    @SerializedName("charge_enable_request")
    @Expose
    private Boolean chargeEnableRequest;
    @SerializedName("charger_phases")
    @Expose
    private Object chargerPhases;
    @SerializedName("charge_port_latch")
    @Expose
    private String chargePortLatch;
    @SerializedName("charge_current_request")
    @Expose
    private Integer chargeCurrentRequest;
    @SerializedName("charge_current_request_max")
    @Expose
    private Integer chargeCurrentRequestMax;
    @SerializedName("managed_charging_active")
    @Expose
    private Boolean managedChargingActive;
    @SerializedName("managed_charging_user_canceled")
    @Expose
    private Boolean managedChargingUserCanceled;
    @SerializedName("managed_charging_start_time")
    @Expose
    private Object managedChargingStartTime;
    @SerializedName("battery_heater_on")
    @Expose
    private Boolean batteryHeaterOn;
    @SerializedName("not_enough_power_to_heat")
    @Expose
    private Object notEnoughPowerToHeat;
    @SerializedName("timestamp")
    @Expose
    private Long timestamp;

    public String getChargingState() {
        return chargingState;
    }

    public void setChargingState(String chargingState) {
        this.chargingState = chargingState;
    }

    public String getFastChargerType() {
        return fastChargerType;
    }

    public void setFastChargerType(String fastChargerType) {
        this.fastChargerType = fastChargerType;
    }

    public String getFastChargerBrand() {
        return fastChargerBrand;
    }

    public void setFastChargerBrand(String fastChargerBrand) {
        this.fastChargerBrand = fastChargerBrand;
    }

    public Integer getChargeLimitSoc() {
        return chargeLimitSoc;
    }

    public void setChargeLimitSoc(Integer chargeLimitSoc) {
        this.chargeLimitSoc = chargeLimitSoc;
    }

    public Integer getChargeLimitSocStd() {
        return chargeLimitSocStd;
    }

    public void setChargeLimitSocStd(Integer chargeLimitSocStd) {
        this.chargeLimitSocStd = chargeLimitSocStd;
    }

    public Integer getChargeLimitSocMin() {
        return chargeLimitSocMin;
    }

    public void setChargeLimitSocMin(Integer chargeLimitSocMin) {
        this.chargeLimitSocMin = chargeLimitSocMin;
    }

    public Integer getChargeLimitSocMax() {
        return chargeLimitSocMax;
    }

    public void setChargeLimitSocMax(Integer chargeLimitSocMax) {
        this.chargeLimitSocMax = chargeLimitSocMax;
    }

    public Boolean getChargeToMaxRange() {
        return chargeToMaxRange;
    }

    public void setChargeToMaxRange(Boolean chargeToMaxRange) {
        this.chargeToMaxRange = chargeToMaxRange;
    }

    public Integer getMaxRangeChargeCounter() {
        return maxRangeChargeCounter;
    }

    public void setMaxRangeChargeCounter(Integer maxRangeChargeCounter) {
        this.maxRangeChargeCounter = maxRangeChargeCounter;
    }

    public Object getFastChargerPresent() {
        return fastChargerPresent;
    }

    public void setFastChargerPresent(Object fastChargerPresent) {
        this.fastChargerPresent = fastChargerPresent;
    }

    public Double getBatteryRange() {
        return batteryRange;
    }

    public void setBatteryRange(Double batteryRange) {
        this.batteryRange = batteryRange;
    }

    public Double getEstBatteryRange() {
        return estBatteryRange;
    }

    public void setEstBatteryRange(Double estBatteryRange) {
        this.estBatteryRange = estBatteryRange;
    }

    public Double getIdealBatteryRange() {
        return idealBatteryRange;
    }

    public void setIdealBatteryRange(Double idealBatteryRange) {
        this.idealBatteryRange = idealBatteryRange;
    }

    public Integer getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(Integer batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public Integer getUsableBatteryLevel() {
        return usableBatteryLevel;
    }

    public void setUsableBatteryLevel(Integer usableBatteryLevel) {
        this.usableBatteryLevel = usableBatteryLevel;
    }

    public Double getChargeEnergyAdded() {
        return chargeEnergyAdded;
    }

    public void setChargeEnergyAdded(Double chargeEnergyAdded) {
        this.chargeEnergyAdded = chargeEnergyAdded;
    }

    public Double getChargeMilesAddedRated() {
        return chargeMilesAddedRated;
    }

    public void setChargeMilesAddedRated(Double chargeMilesAddedRated) {
        this.chargeMilesAddedRated = chargeMilesAddedRated;
    }

    public Double getChargeMilesAddedIdeal() {
        return chargeMilesAddedIdeal;
    }

    public void setChargeMilesAddedIdeal(Double chargeMilesAddedIdeal) {
        this.chargeMilesAddedIdeal = chargeMilesAddedIdeal;
    }

    public Object getChargerVoltage() {
        return chargerVoltage;
    }

    public void setChargerVoltage(Object chargerVoltage) {
        this.chargerVoltage = chargerVoltage;
    }

    public Object getChargerPilotCurrent() {
        return chargerPilotCurrent;
    }

    public void setChargerPilotCurrent(Object chargerPilotCurrent) {
        this.chargerPilotCurrent = chargerPilotCurrent;
    }

    public Object getChargerActualCurrent() {
        return chargerActualCurrent;
    }

    public void setChargerActualCurrent(Object chargerActualCurrent) {
        this.chargerActualCurrent = chargerActualCurrent;
    }

    public Object getChargerPower() {
        return chargerPower;
    }

    public void setChargerPower(Object chargerPower) {
        this.chargerPower = chargerPower;
    }

    public Double getTimeToFullCharge() {
        return timeToFullCharge;
    }

    public void setTimeToFullCharge(Double timeToFullCharge) {
        this.timeToFullCharge = timeToFullCharge;
    }

    public Object getTripCharging() {
        return tripCharging;
    }

    public void setTripCharging(Object tripCharging) {
        this.tripCharging = tripCharging;
    }

    public Double getChargeRate() {
        return chargeRate;
    }

    public void setChargeRate(Double chargeRate) {
        this.chargeRate = chargeRate;
    }

    public Object getChargePortDoorOpen() {
        return chargePortDoorOpen;
    }

    public void setChargePortDoorOpen(Object chargePortDoorOpen) {
        this.chargePortDoorOpen = chargePortDoorOpen;
    }

    public String getConnChargeCable() {
        return connChargeCable;
    }

    public void setConnChargeCable(String connChargeCable) {
        this.connChargeCable = connChargeCable;
    }

    public Object getScheduledChargingStartTime() {
        return scheduledChargingStartTime;
    }

    public void setScheduledChargingStartTime(Object scheduledChargingStartTime) {
        this.scheduledChargingStartTime = scheduledChargingStartTime;
    }

    public Boolean getScheduledChargingPending() {
        return scheduledChargingPending;
    }

    public void setScheduledChargingPending(Boolean scheduledChargingPending) {
        this.scheduledChargingPending = scheduledChargingPending;
    }

    public Object getUserChargeEnableRequest() {
        return userChargeEnableRequest;
    }

    public void setUserChargeEnableRequest(Object userChargeEnableRequest) {
        this.userChargeEnableRequest = userChargeEnableRequest;
    }

    public Boolean getChargeEnableRequest() {
        return chargeEnableRequest;
    }

    public void setChargeEnableRequest(Boolean chargeEnableRequest) {
        this.chargeEnableRequest = chargeEnableRequest;
    }

    public Object getChargerPhases() {
        return chargerPhases;
    }

    public void setChargerPhases(Object chargerPhases) {
        this.chargerPhases = chargerPhases;
    }

    public String getChargePortLatch() {
        return chargePortLatch;
    }

    public void setChargePortLatch(String chargePortLatch) {
        this.chargePortLatch = chargePortLatch;
    }

    public Integer getChargeCurrentRequest() {
        return chargeCurrentRequest;
    }

    public void setChargeCurrentRequest(Integer chargeCurrentRequest) {
        this.chargeCurrentRequest = chargeCurrentRequest;
    }

    public Integer getChargeCurrentRequestMax() {
        return chargeCurrentRequestMax;
    }

    public void setChargeCurrentRequestMax(Integer chargeCurrentRequestMax) {
        this.chargeCurrentRequestMax = chargeCurrentRequestMax;
    }

    public Boolean getManagedChargingActive() {
        return managedChargingActive;
    }

    public void setManagedChargingActive(Boolean managedChargingActive) {
        this.managedChargingActive = managedChargingActive;
    }

    public Boolean getManagedChargingUserCanceled() {
        return managedChargingUserCanceled;
    }

    public void setManagedChargingUserCanceled(Boolean managedChargingUserCanceled) {
        this.managedChargingUserCanceled = managedChargingUserCanceled;
    }

    public Object getManagedChargingStartTime() {
        return managedChargingStartTime;
    }

    public void setManagedChargingStartTime(Object managedChargingStartTime) {
        this.managedChargingStartTime = managedChargingStartTime;
    }

    public Boolean getBatteryHeaterOn() {
        return batteryHeaterOn;
    }

    public void setBatteryHeaterOn(Boolean batteryHeaterOn) {
        this.batteryHeaterOn = batteryHeaterOn;
    }

    public Object getNotEnoughPowerToHeat() {
        return notEnoughPowerToHeat;
    }

    public void setNotEnoughPowerToHeat(Object notEnoughPowerToHeat) {
        this.notEnoughPowerToHeat = notEnoughPowerToHeat;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

}