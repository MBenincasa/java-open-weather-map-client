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

    public void setDt(Integer dt) {
        this.dt = dt;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public Integer getPop() {
        return pop;
    }

    public void setPop(Integer pop) {
        this.pop = pop;
    }

    public Rain getRain() {
        return rain;
    }

    public void setRain(Rain rain) {
        this.rain = rain;
    }

    public Snow getSnow() {
        return snow;
    }

    public void setSnow(Snow snow) {
        this.snow = snow;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public String getDtTxt() {
        return dtTxt;
    }

    public void setDtTxt(String dtTxt) {
        this.dtTxt = dtTxt;
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
