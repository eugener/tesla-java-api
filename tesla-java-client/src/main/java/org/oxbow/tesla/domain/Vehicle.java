package org.oxbow.tesla.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Vehicle {

    @SerializedName("id")
    private String id;

    @SerializedName("vehicle_id")
    private String vehicleId;

    @SerializedName("vin")
    private String vin;

    @SerializedName("display_name")
    private String displayName;

    @SerializedName("option_codes")
    private String optionCodes;

    @SerializedName("color")
    private String color;

    @SerializedName("tokens")
    private List<String> tokens;

    @SerializedName("state")
    private String state;

    @SerializedName("in_service")
    private boolean inService;

    @SerializedName("id_s")
    private String ids;

    @SerializedName("calendar_enabled")
    private boolean calendarEnabled;

    @SerializedName("backseat_token")
    private String backseatToken;

    @SerializedName("backseat_token_updated_at")
    private String backseatTokenUpdatedAt;


    public String getId() {
        return id;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getVin() {
        return vin;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getOptionCodes() {
        return optionCodes;
    }

    public String getColor() {
        return color;
    }

    public List<String> getTokens() {
        return tokens;
    }

    public String getState() {
        return state;
    }

    public boolean isInService() {
        return inService;
    }

    public String getIds() {
        return ids;
    }

    public boolean isCalendarEnabled() {
        return calendarEnabled;
    }

    public String getBackseatToken() {
        return backseatToken;
    }

    public String getBackseatTokenUpdatedAt() {
        return backseatTokenUpdatedAt;
    }

    @Override
    public String toString() {
        return "Vehicle{\n" +
                "id='" + id + '\'' +
                ", \n\tvehicleId='" + vehicleId + '\'' +
                ", \n\tvin='" + vin + '\'' +
                ", \n\tdisplayName='" + displayName + '\'' +
                ", \n\toptionCodes='" + optionCodes + '\'' +
                ", \n\tcolor='" + color + '\'' +
                ", \n\ttokens=" + tokens +
                ", \n\tstate='" + state + '\'' +
                ", \n\tinService=" + inService +
                ", \n\tids='" + ids + '\'' +
                ", \n\tcalendarEnabled=" + calendarEnabled +
                ", \n\tbackseatToken='" + backseatToken + '\'' +
                ", \n\tbackseatTokenUpdatedAt='" + backseatTokenUpdatedAt + '\'' +
                "\n}";
    }
}
