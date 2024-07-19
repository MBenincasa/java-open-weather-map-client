package io.github.mbenincasa.javaopenweathermapclient.dto.airPollution;

public class Main {

    private Integer aqi;

    public Main() {
    }

    public Main(Integer aqi) {
        this.aqi = aqi;
    }

    public Integer getAqi() {
        return aqi;
    }

    public void setAqi(Integer aqi) {
        this.aqi = aqi;
    }

    @Override
    public String toString() {
        return "Main{" +
                "aqi=" + aqi +
                '}';
    }
}
