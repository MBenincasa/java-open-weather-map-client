package io.github.mbenincasa.javaopenweathermapclient.dto.currentWeather;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Snow {

    @JsonProperty("1h")
    private Double oneH;
    @JsonProperty("3h")
    private Double threeH;

    public Snow() {
    }

    public Snow(Double oneH, Double threeH) {
        this.oneH = oneH;
        this.threeH = threeH;
    }

    public Double getOneH() {
        return oneH;
    }

    public Double getThreeH() {
        return threeH;
    }

    @Override
    public String toString() {
        return "Snow{" +
                "oneH=" + oneH +
                ", threeH=" + threeH +
                '}';
    }
}
