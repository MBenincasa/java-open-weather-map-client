package io.github.mbenincasa.javaopenweathermapclient.dto;

import io.github.mbenincasa.javaopenweathermapclient.dto.common.*;
import io.github.mbenincasa.javaopenweathermapclient.dto.currentWeather.Rain;
import io.github.mbenincasa.javaopenweathermapclient.dto.currentWeather.Snow;
import io.github.mbenincasa.javaopenweathermapclient.dto.currentWeather.Sys;

import java.util.List;
import java.util.Objects;

public class CurrentWeatherDTO {

    private Coord coord;
    private List<Weather> weather;
    private String base;
    private Main main;
    private Integer visibility;
    private Wind wind;
    private Rain rain;
    private Snow snow;
    private Clouds clouds;
    private Integer dt;
    private Sys sys;
    private Integer timezone;
    private Integer id;
    private String name;
    private Integer cod;

    public CurrentWeatherDTO() {
    }

    public CurrentWeatherDTO(Coord coord, List<Weather> weather, String base, Main main, Integer visibility, Wind wind, Rain rain, Snow snow, Clouds clouds, Integer dt, Sys sys, Integer timezone, Integer id, String name, Integer cod) {
        this.coord = coord;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.visibility = visibility;
        this.wind = wind;
        this.rain = rain;
        this.snow = snow;
        this.clouds = clouds;
        this.dt = dt;
        this.sys = sys;
        this.timezone = timezone;
        this.id = id;
        this.name = name;
        this.cod = cod;
    }

    public Coord getCoord() {
        return coord;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public String getBase() {
        return base;
    }

    public Main getMain() {
        return main;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public Rain getRain() {
        return rain;
    }

    public Snow getSnow() {
        return snow;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public Integer getDt() {
        return dt;
    }

    public Sys getSys() {
        return sys;
    }

    public Integer getTimezone() {
        return timezone;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getCod() {
        return cod;
    }

    @Override
    public String toString() {
        return "CurrentWeatherDTO{" +
                "coord=" + coord +
                ", weather=" + weather +
                ", base='" + base + '\'' +
                ", main=" + main +
                ", visibility=" + visibility +
                ", wind=" + wind +
                ", rain=" + rain +
                ", snow=" + snow +
                ", clouds=" + clouds +
                ", dt=" + dt +
                ", sys=" + sys +
                ", timezone=" + timezone +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", cod=" + cod +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CurrentWeatherDTO that)) return false;
        return Objects.equals(getCoord(), that.getCoord()) && Objects.equals(getWeather(), that.getWeather()) && Objects.equals(getBase(), that.getBase()) && Objects.equals(getMain(), that.getMain()) && Objects.equals(getVisibility(), that.getVisibility()) && Objects.equals(getWind(), that.getWind()) && Objects.equals(getRain(), that.getRain()) && Objects.equals(getSnow(), that.getSnow()) && Objects.equals(getClouds(), that.getClouds()) && Objects.equals(getDt(), that.getDt()) && Objects.equals(getSys(), that.getSys()) && Objects.equals(getTimezone(), that.getTimezone()) && Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getCod(), that.getCod());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCoord(), getWeather(), getBase(), getMain(), getVisibility(), getWind(), getRain(), getSnow(), getClouds(), getDt(), getSys(), getTimezone(), getId(), getName(), getCod());
    }
}
