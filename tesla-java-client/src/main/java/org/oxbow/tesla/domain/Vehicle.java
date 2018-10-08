package org.oxbow.tesla.domain;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

// See http://www.jsonschema2pojo.org/
public class Vehicle {

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("vehicle_id")
    @Expose
    private Long vehicleId;
    @SerializedName("vin")
    @Expose
    private String vin;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("option_codes")
    @Expose
    private String optionCodes;
    @SerializedName("color")
    @Expose
    private Object color;
    @SerializedName("tokens")
    @Expose
    private List<String> tokens = null;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("in_service")
    @Expose
    private Boolean inService;
    @SerializedName("id_s")
    @Expose
    private String idS;
    @SerializedName("calendar_enabled")
    @Expose
    private Boolean calendarEnabled;
    @SerializedName("backseat_token")
    @Expose
    private Object backseatToken;
    @SerializedName("backseat_token_updated_at")
    @Expose
    private Object backseatTokenUpdatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getOptionCodes() {
        return optionCodes;
    }

    public void setOptionCodes(String optionCodes) {
        this.optionCodes = optionCodes;
    }

    public Object getColor() {
        return color;
    }

    public void setColor(Object color) {
        this.color = color;
    }

    public List<String> getTokens() {
        return tokens;
    }

    public void setTokens(List<String> tokens) {
        this.tokens = tokens;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Boolean getInService() {
        return inService;
    }

    public void setInService(Boolean inService) {
        this.inService = inService;
    }

    public String getIdS() {
        return idS;
    }

    public void setIdS(String idS) {
        this.idS = idS;
    }

    public Boolean getCalendarEnabled() {
        return calendarEnabled;
    }

    public void setCalendarEnabled(Boolean calendarEnabled) {
        this.calendarEnabled = calendarEnabled;
    }

    public Object getBackseatToken() {
        return backseatToken;
    }

    public void setBackseatToken(Object backseatToken) {
        this.backseatToken = backseatToken;
    }

    public Object getBackseatTokenUpdatedAt() {
        return backseatTokenUpdatedAt;
    }

    public void setBackseatTokenUpdatedAt(Object backseatTokenUpdatedAt) {
        this.backseatTokenUpdatedAt = backseatTokenUpdatedAt;
    }

}