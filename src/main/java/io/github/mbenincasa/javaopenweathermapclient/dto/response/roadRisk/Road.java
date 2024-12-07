package io.github.mbenincasa.javaopenweathermapclient.dto.response.roadRisk;

import java.util.Objects;

public class Road {

    private Integer state;
    private Double temp;

    public Road() {
    }

    public Road(Integer state, Double temp) {
        this.state = state;
        this.temp = temp;
    }

    public Integer getState() {
        return state;
    }

    public Double getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return "Road{" +
                "state=" + state +
                ", temp=" + temp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Road road)) return false;
        return Objects.equals(getState(), road.getState()) && Objects.equals(getTemp(), road.getTemp());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getState(), getTemp());
    }
}
