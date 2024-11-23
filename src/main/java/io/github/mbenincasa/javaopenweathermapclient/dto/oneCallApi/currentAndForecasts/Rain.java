package io.github.mbenincasa.javaopenweathermapclient.dto.oneCallApi.currentAndForecasts;

import com.fasterxml.jackson.annotation.JsonProperty;

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
}
