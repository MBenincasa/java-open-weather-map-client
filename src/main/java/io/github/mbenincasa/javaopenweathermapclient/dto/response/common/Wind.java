package io.github.mbenincasa.javaopenweathermapclient.dto.response.common;

import java.util.Objects;

public class Wind {

    private Double speed;
    private Integer deg;
    private Double gust;

    public Wind() {
    }

    public Wind(Double speed, Integer deg, Double gust) {
        this.speed = speed;
        this.deg = deg;
        this.gust = gust;
    }

    public Double getSpeed() {
        return speed;
    }

    public Integer getDeg() {
        return deg;
    }

    public Double getGust() {
        return gust;
    }

    @Override
    public String toString() {
        return "Wind{" +
                "speed=" + speed +
                ", deg=" + deg +
                ", gust=" + gust +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wind wind)) return false;
        return Objects.equals(getSpeed(), wind.getSpeed()) && Objects.equals(getDeg(), wind.getDeg()) && Objects.equals(getGust(), wind.getGust());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSpeed(), getDeg(), getGust());
    }
}
