package io.github.mbenincasa.javaopenweathermapclient.dto.response.oneCallApi.currentAndForecasts;

import java.util.Objects;

public class Minutely {

    private Integer dt;
    private Double precipitation;

    public Minutely() {
    }

    public Minutely(Integer dt, Double precipitation) {
        this.dt = dt;
        this.precipitation = precipitation;
    }

    public Integer getDt() {
        return dt;
    }

    public Double getPrecipitation() {
        return precipitation;
    }

    @Override
    public String toString() {
        return "Minutely{" +
                "dt=" + dt +
                ", precipitation=" + precipitation +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Minutely minutely)) return false;
        return Objects.equals(getDt(), minutely.getDt()) && Objects.equals(getPrecipitation(), minutely.getPrecipitation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDt(), getPrecipitation());
    }
}
