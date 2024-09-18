package io.github.mbenincasa.javaopenweathermapclient.dto.currentWeather;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rain {

    @JsonProperty("1h")
    private Double OneH;
    @JsonProperty("3h")
    private Double ThreeH;

    public Rain() {
    }

    public Rain(Double oneH, Double threeH) {
        OneH = oneH;
        ThreeH = threeH;
    }

    public Double getOneH() {
        return OneH;
    }

    public Double getThreeH() {
        return ThreeH;
    }

    @Override
    public String toString() {
        return "Rain{" +
                "OneH=" + OneH +
                ", ThreeH=" + ThreeH +
                '}';
    }
}
