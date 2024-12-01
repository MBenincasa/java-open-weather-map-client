package io.github.mbenincasa.javaopenweathermapclient.dto.oneCallApi.currentAndForecasts;

import java.util.Objects;

public class Temp {

    private Double day;
    private Double min;
    private Double max;
    private Double night;
    private Double eve;
    private Double morn;

    public Temp() {
    }

    public Temp(Double day, Double min, Double max, Double night, Double eve, Double morn) {
        this.day = day;
        this.min = min;
        this.max = max;
        this.night = night;
        this.eve = eve;
        this.morn = morn;
    }

    public Double getDay() {
        return day;
    }

    public Double getMin() {
        return min;
    }

    public Double getMax() {
        return max;
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
        return "Temp{" +
                "day=" + day +
                ", min=" + min +
                ", max=" + max +
                ", night=" + night +
                ", eve=" + eve +
                ", morn=" + morn +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Temp temp)) return false;
        return Objects.equals(getDay(), temp.getDay()) && Objects.equals(getMin(), temp.getMin()) && Objects.equals(getMax(), temp.getMax()) && Objects.equals(getNight(), temp.getNight()) && Objects.equals(getEve(), temp.getEve()) && Objects.equals(getMorn(), temp.getMorn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDay(), getMin(), getMax(), getNight(), getEve(), getMorn());
    }
}
