package io.github.mbenincasa.javaopenweathermapclient.dto;

import io.github.mbenincasa.javaopenweathermapclient.dto.common.*;
import io.github.mbenincasa.javaopenweathermapclient.dto.currentWeather.Rain;
import io.github.mbenincasa.javaopenweathermapclient.dto.currentWeather.Snow;
import io.github.mbenincasa.javaopenweathermapclient.dto.currentWeather.Sys;

import java.util.List;

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
}
