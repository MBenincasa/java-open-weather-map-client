package io.github.mbenincasa.javaopenweathermapclient.dto.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Snow {

    @JsonProperty("1h")
    private Double OneH;
    @JsonProperty("3h")
    private Double ThreeH;

    public Snow() {
    }

    public Snow(Double oneH, Double threeH) {
        OneH = oneH;
        ThreeH = threeH;
    }

    public Double getOneH() {
        return OneH;
    }

    public void setOneH(Double oneH) {
        OneH = oneH;
    }

    public Double getThreeH() {
        return ThreeH;
    }

    public void setThreeH(Double threeH) {
        ThreeH = threeH;
    }

    @Override
    public String toString() {
        return "Snow{" +
                "OneH=" + OneH +
                ", ThreeH=" + ThreeH +
                '}';
    }
}
