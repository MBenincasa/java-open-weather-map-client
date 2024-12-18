package io.github.mbenincasa.javaopenweathermapclient.dto.response.hourlyWeatherForecast;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.mbenincasa.javaopenweathermapclient.dto.response.common.Clouds;
import io.github.mbenincasa.javaopenweathermapclient.dto.response.common.Main;
import io.github.mbenincasa.javaopenweathermapclient.dto.response.common.Weather;
import io.github.mbenincasa.javaopenweathermapclient.dto.response.common.Wind;
import io.github.mbenincasa.javaopenweathermapclient.dto.response.fiveDaysWeatherForecast.Sys;

import java.util.List;
import java.util.Objects;

public class ForecastList {

    private Integer dt;
    private Main main;
    private List<Weather> weather;
    private Clouds clouds;
    private Wind wind;
    private Integer visibility;
    private Double pop;
    private Rain rain;
    private Snow snow;
    private Sys sys;
    @JsonProperty("dt_txt")
    private String dtTxt;

    public ForecastList() {
    }

    public ForecastList(Integer dt, Main main, List<Weather> weather, Clouds clouds, Wind wind, Integer visibility, Double pop, Rain rain, Snow snow, Sys sys, String dtTxt) {
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

    public Double getPop() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForecastList that)) return false;
        return Objects.equals(getDt(), that.getDt()) && Objects.equals(getMain(), that.getMain()) && Objects.equals(getWeather(), that.getWeather()) && Objects.equals(getClouds(), that.getClouds()) && Objects.equals(getWind(), that.getWind()) && Objects.equals(getVisibility(), that.getVisibility()) && Objects.equals(getPop(), that.getPop()) && Objects.equals(getRain(), that.getRain()) && Objects.equals(getSnow(), that.getSnow()) && Objects.equals(getSys(), that.getSys()) && Objects.equals(getDtTxt(), that.getDtTxt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDt(), getMain(), getWeather(), getClouds(), getWind(), getVisibility(), getPop(), getRain(), getSnow(), getSys(), getDtTxt());
    }
}
