package io.github.mbenincasa.javaopenweathermapclient.request.weatherMaps;

public enum AdvancedMapLayer {

    CONVECTIVE_PRECIPITATION("PAC0"),
    PRECIPITATION_INTENSITY("PR0"),
    ACCUMULATED_PRECIPITATION("PA0"),
    ACCUMULATED_PRECIPITATION_RAIN("PAR0"),
    ACCUMULATED_PRECIPITATION_SNOW("PAS0"),
    DEPTH_OF_SNOW("SD0"),
    WIND_SPEED("WS10"),
    WIND_SPEED_AND_DIRECTION("WND"),
    ATMOSPHERIC_PRESSURE("APM"),
    AIR_TEMPERATURE("TA2"),
    TEMPERATURE_OF_A_DEW_POINT("TD2"),
    SOIL_TEMPERATURE_0_10_CM("TS0"),
    SOIL_TEMPERATURE_ABOVE_10_CM("TS10"),
    RELATIVE_HUMIDITY("HRD0"),
    CLOUDINESS("CL");

    private final String value;

    AdvancedMapLayer(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
