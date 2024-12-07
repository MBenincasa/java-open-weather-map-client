package io.github.mbenincasa.javaopenweathermapclient.dto.response.oneCallApi.daySummary;

import java.util.Objects;

public class Temperature {

    private Double min;
    private Double max;
    private Double afternoon;
    private Double night;
    private Double evening;
    private Double morning;

    public Temperature() {
    }

    public Temperature(Double min, Double max, Double afternoon, Double night, Double evening, Double morning) {
        this.min = min;
        this.max = max;
        this.afternoon = afternoon;
        this.night = night;
        this.evening = evening;
        this.morning = morning;
    }

    public Double getMin() {
        return min;
    }

    public Double getMax() {
        return max;
    }

    public Double getAfternoon() {
        return afternoon;
    }

    public Double getNight() {
        return night;
    }

    public Double getEvening() {
        return evening;
    }

    public Double getMorning() {
        return morning;
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "min=" + min +
                ", max=" + max +
                ", afternoon=" + afternoon +
                ", night=" + night +
                ", evening=" + evening +
                ", morning=" + morning +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Temperature that)) return false;
        return Objects.equals(getMin(), that.getMin()) && Objects.equals(getMax(), that.getMax()) && Objects.equals(getAfternoon(), that.getAfternoon()) && Objects.equals(getNight(), that.getNight()) && Objects.equals(getEvening(), that.getEvening()) && Objects.equals(getMorning(), that.getMorning());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMin(), getMax(), getAfternoon(), getNight(), getEvening(), getMorning());
    }
}
