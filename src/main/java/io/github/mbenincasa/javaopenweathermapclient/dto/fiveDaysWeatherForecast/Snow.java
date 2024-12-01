package io.github.mbenincasa.javaopenweathermapclient.dto.fiveDaysWeatherForecast;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Snow snow)) return false;
        return Objects.equals(getThreeH(), snow.getThreeH());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getThreeH());
    }
}
