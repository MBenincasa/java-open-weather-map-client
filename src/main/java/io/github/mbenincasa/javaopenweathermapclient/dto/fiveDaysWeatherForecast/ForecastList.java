package io.github.mbenincasa.javaopenweathermapclient.dto.fiveDaysWeatherForecast;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.mbenincasa.javaopenweathermapclient.dto.common.Clouds;
import io.github.mbenincasa.javaopenweathermapclient.dto.common.Main;
import io.github.mbenincasa.javaopenweathermapclient.dto.common.Weather;
import io.github.mbenincasa.javaopenweathermapclient.dto.common.Wind;

import java.util.List;

public class ForecastList {

    private Integer dt;
    private Main main;
    private List<Weather> weather;
    private Clouds clouds;
    private Wind wind;
    private Integer visibility;
    private Integer pop;
    private Rain rain;
    private Snow snow;
    private Sys sys;
    @JsonProperty("dt_txt")
    private String dtTxt;

    public ForecastList() {
    }

    public ForecastList(Integer dt, Main main, List<Weather> weather, Clouds clouds, Wind wind, Integer visibility, Integer pop, Rain rain, Snow snow, Sys sys, String dtTxt) {
        this.dt = dt;
        this.main = main;
        this.weather = weather;
        this.clouds = clouds;
        this.wind = wind;
        this.visibility = visibility;
        this.pop = pop;
        this.rain = rain;
        this.snow = snow;
        this.sys = sys;
        this.dtTxt = dtTxt;
    }

    public Integer getDt() {
        return dt;
    }

    public Main getMain() {
        return main;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public Wind getWind() {
        return wind;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public Integer getPop() {
        return pop;
    }

    public Rain getRain() {
        return rain;
    }

    public Snow getSnow() {
        return snow;
    }

    public Sys getSys() {
        return sys;
    }

    public String getDtTxt() {
        return dtTxt;
    }

    @Override
    public String toString() {
        return "ForecastList{" +
                "dt=" + dt +
                ", main=" + main +
                ", weather=" + weather +
                ", clouds=" + clouds +
                ", wind=" + wind +
                ", visibility=" + visibility +
                ", pop=" + pop +
                ", rain=" + rain +
                ", snow=" + snow +
                ", sys=" + sys +
                ", dtTxt='" + dtTxt + '\'' +
                '}';
    }
}
