package io.github.mbenincasa.javaopenweathermapclient.dto.fiveDayWeatherForecast;

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

    public void setThreeH(Double threeH) {
        ThreeH = threeH;
    }

    @Override
    public String toString() {
        return "Rain{" +
                "ThreeH=" + ThreeH +
                '}';
    }
}
