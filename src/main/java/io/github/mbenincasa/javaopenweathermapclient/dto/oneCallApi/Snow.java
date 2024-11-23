package io.github.mbenincasa.javaopenweathermapclient.dto.oneCallApi;

import com.fasterxml.jackson.annotation.JsonProperty;

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
}
