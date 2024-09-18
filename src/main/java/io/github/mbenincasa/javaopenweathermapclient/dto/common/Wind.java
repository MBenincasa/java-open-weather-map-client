package io.github.mbenincasa.javaopenweathermapclient.dto.common;

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
}
