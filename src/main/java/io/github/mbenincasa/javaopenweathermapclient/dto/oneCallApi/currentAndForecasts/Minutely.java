package io.github.mbenincasa.javaopenweathermapclient.dto.oneCallApi.currentAndForecasts;

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
}
