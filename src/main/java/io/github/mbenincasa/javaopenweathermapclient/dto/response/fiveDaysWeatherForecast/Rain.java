package io.github.mbenincasa.javaopenweathermapclient.dto.response.fiveDaysWeatherForecast;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rain rain)) return false;
        return Objects.equals(getThreeH(), rain.getThreeH());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getThreeH());
    }
}
