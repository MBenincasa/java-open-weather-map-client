package io.github.mbenincasa.javaopenweathermapclient.dto.fiveDaysWeatherForecast;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Snow {

    @JsonProperty("3h")
    private Double ThreeH;

    public Snow() {
    }

    public Snow(Double threeH) {
        ThreeH = threeH;
    }

    public Double getThreeH() {
        return ThreeH;
    }

    @Override
    public String toString() {
        return "Snow{" +
                "ThreeH=" + ThreeH +
                '}';
    }
}
