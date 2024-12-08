package io.github.mbenincasa.javaopenweathermapclient.dto.response;

import io.github.mbenincasa.javaopenweathermapclient.dto.response.roadRisk.Alerts;
import io.github.mbenincasa.javaopenweathermapclient.dto.response.roadRisk.Road;
import io.github.mbenincasa.javaopenweathermapclient.dto.response.roadRisk.Weather;

import java.util.List;
import java.util.Objects;

public class RoadRiskDTO {

    private Integer dt;
    private List<Double> coord;
    private Weather weather;
    private Road road;
    private List<Alerts> alerts;

    public RoadRiskDTO() {
    }

    public RoadRiskDTO(Integer dt, List<Double> coord, Weather weather, Road road, List<Alerts> alerts) {
        this.dt = dt;
        this.coord = coord;
        this.weather = weather;
        this.road = road;
        this.alerts = alerts;
    }

    public Integer getDt() {
        return dt;
    }

    public List<Double> getCoord() {
        return coord;
    }

    public Weather getWeather() {
        return weather;
    }

    public Road getRoad() {
        return road;
    }

    public List<Alerts> getAlerts() {
        return alerts;
    }

    @Override
    public String toString() {
        return "RoadRiskDTO{" +
                "dt=" + dt +
                ", coord=" + coord +
                ", weather=" + weather +
                ", road=" + road +
                ", alerts=" + alerts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RoadRiskDTO that)) return false;
        return Objects.equals(getDt(), that.getDt()) && Objects.equals(getCoord(), that.getCoord()) && Objects.equals(getWeather(), that.getWeather()) && Objects.equals(getRoad(), that.getRoad()) && Objects.equals(getAlerts(), that.getAlerts());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDt(), getCoord(), getWeather(), getRoad(), getAlerts());
    }
}
