package io.github.mbenincasa.javaopenweathermapclient.request.weatherMaps;

public enum BasicMapLayer {

    CLOUDS("clouds_new"),
    PRECIPITATION("precipitation_new"),
    SEA_LEVEL_PRESSURE("pressure_new"),
    WIND_SPEED("wind_new"),
    TEMPERATURE("temp_new");

    private final String value;

    BasicMapLayer(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
