package io.github.mbenincasa.javaopenweathermapclient.dto.oneCallApi.currentAndForecasts;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Rain {

    @JsonProperty("1h")
    private Double oneH;

    public Rain() {
    }

    public Rain(Double oneH) {
        this.oneH = oneH;
    }

    public Double getOneH() {
        return oneH;
    }

    @Override
    public String toString() {
        return "Rain{" +
                "oneH=" + oneH +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rain rain)) return false;
        return Objects.equals(getOneH(), rain.getOneH());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOneH());
    }
}
