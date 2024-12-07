package io.github.mbenincasa.javaopenweathermapclient.dto.response.dailyWeatherForecast;

import java.util.Objects;

public class FeelsLike {

    private Double day;
    private Double night;
    private Double eve;
    private Double morn;

    public FeelsLike() {
    }

    public FeelsLike(Double day, Double night, Double eve, Double morn) {
        this.day = day;
        this.night = night;
        this.eve = eve;
        this.morn = morn;
    }

    public Double getDay() {
        return day;
    }

    public Double getNight() {
        return night;
    }

    public Double getEve() {
        return eve;
    }

    public Double getMorn() {
        return morn;
    }

    @Override
    public String toString() {
        return "FeelsLike{" +
                "day=" + day +
                ", night=" + night +
                ", eve=" + eve +
                ", morn=" + morn +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FeelsLike feelsLike)) return false;
        return Objects.equals(getDay(), feelsLike.getDay()) && Objects.equals(getNight(), feelsLike.getNight()) && Objects.equals(getEve(), feelsLike.getEve()) && Objects.equals(getMorn(), feelsLike.getMorn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDay(), getNight(), getEve(), getMorn());
    }
}
