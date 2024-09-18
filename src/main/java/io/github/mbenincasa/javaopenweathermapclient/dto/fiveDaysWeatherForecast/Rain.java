package io.github.mbenincasa.javaopenweathermapclient.dto.fiveDaysWeatherForecast;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rain {

    @JsonProperty("3h")
    private Double ThreeH;

    public Rain() {
    }

    public Rain(Double threeH) {
        ThreeH = threeH;
    }

    public Double getThreeH() {
        return ThreeH;
    }

    @Override
    public String toString() {
        return "Rain{" +
                "ThreeH=" + ThreeH +
                '}';
    }
}
