package io.github.mbenincasa.javaopenweathermapclient.dto.response.airPollution;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Main{" +
                "aqi=" + aqi +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Main main)) return false;
        return Objects.equals(getAqi(), main.getAqi());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAqi());
    }
}
