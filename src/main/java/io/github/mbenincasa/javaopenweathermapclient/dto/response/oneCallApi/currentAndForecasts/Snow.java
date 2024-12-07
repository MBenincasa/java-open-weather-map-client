package io.github.mbenincasa.javaopenweathermapclient.dto.response.oneCallApi.currentAndForecasts;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Snow {

    @JsonProperty("1h")
    private Double oneH;

    public Snow() {
    }

    public Snow(Double oneH) {
        this.oneH = oneH;
    }

    public Double getOneH() {
        return oneH;
    }

    @Override
    public String toString() {
        return "Snow{" +
                "oneH=" + oneH +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Snow snow)) return false;
        return Objects.equals(getOneH(), snow.getOneH());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOneH());
    }
}
