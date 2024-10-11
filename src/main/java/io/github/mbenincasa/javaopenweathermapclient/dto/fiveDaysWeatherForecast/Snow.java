package io.github.mbenincasa.javaopenweathermapclient.dto.fiveDaysWeatherForecast;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Snow {

    @JsonProperty("3h")
    private Double threeH;

    public Snow() {
    }

    public Snow(Double threeH) {
        this.threeH = threeH;
    }

    public Double getThreeH() {
        return threeH;
    }

    @Override
    public String toString() {
        return "Snow{" +
                "threeH=" + threeH +
                '}';
    }
}
