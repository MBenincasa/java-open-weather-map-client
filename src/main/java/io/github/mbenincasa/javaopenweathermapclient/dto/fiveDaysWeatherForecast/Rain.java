package io.github.mbenincasa.javaopenweathermapclient.dto.fiveDaysWeatherForecast;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rain {

    @JsonProperty("3h")
    private Double threeH;

    public Rain() {
    }

    public Rain(Double threeH) {
        this.threeH = threeH;
    }

    public Double getThreeH() {
        return threeH;
    }

    @Override
    public String toString() {
        return "Rain{" +
                "threeH=" + threeH +
                '}';
    }
}
