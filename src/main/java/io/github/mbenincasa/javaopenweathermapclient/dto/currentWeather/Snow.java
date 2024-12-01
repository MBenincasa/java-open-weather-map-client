package io.github.mbenincasa.javaopenweathermapclient.dto.currentWeather;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Snow snow)) return false;
        return Objects.equals(getOneH(), snow.getOneH()) && Objects.equals(getThreeH(), snow.getThreeH());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOneH(), getThreeH());
    }
}
