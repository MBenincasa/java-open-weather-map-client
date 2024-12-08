package io.github.mbenincasa.javaopenweathermapclient.dto.response.currentWeather;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Rain {

    @JsonProperty("1h")
    private Double oneH;
    @JsonProperty("3h")
    private Double threeH;

    public Rain() {
    }

    public Rain(Double oneH, Double threeH) {
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
        return "Rain{" +
                "oneH=" + oneH +
                ", threeH=" + threeH +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rain rain)) return false;
        return Objects.equals(getOneH(), rain.getOneH()) && Objects.equals(getThreeH(), rain.getThreeH());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOneH(), getThreeH());
    }
}
