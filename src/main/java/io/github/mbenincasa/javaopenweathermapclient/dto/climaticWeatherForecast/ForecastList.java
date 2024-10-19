package io.github.mbenincasa.javaopenweathermapclient.dto.climaticWeatherForecast;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.mbenincasa.javaopenweathermapclient.dto.common.Weather;

import java.util.List;

public class ForecastList {

    private Integer dt;
    private Integer sunrise;
    private Integer sunset;
    private Temp temp;
    @JsonProperty("feels_like")
    private FeelsLike feelsLike;
    private Integer pressure;
    private Integer humidity;
    private List<Weather> weather;
    private Integer speed;
    private Integer deg;
    private Integer clouds;
    private Double rain;
    private Double snow;

    public ForecastList() {
    }

    public ForecastList(Integer dt, Integer sunrise, Integer sunset, Temp temp, FeelsLike feelsLike, Integer pressure, Integer humidity, List<Weather> weather, Integer speed, Integer deg, Integer clouds, Double rain, Double snow) {
        this.dt = dt;
        this.sunrise = sunrise;
        this.sunset = sunset;
        this.temp = temp;
        this.feelsLike = feelsLike;
        this.pressure = pressure;
        this.humidity = humidity;
        this.weather = weather;
        this.speed = speed;
        this.deg = deg;
        this.clouds = clouds;
        this.rain = rain;
        this.snow = snow;
    }

    public Integer getDt() {
        return dt;
    }

    public Integer getSunrise() {
        return sunrise;
    }

    public Integer getSunset() {
        return sunset;
    }

    public Temp getTemp() {
        return temp;
    }

    public FeelsLike getFeelsLike() {
        return feelsLike;
    }

    public Integer getPressure() {
        return pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Integer getDeg() {
        return deg;
    }

    public Integer getClouds() {
        return clouds;
    }

    public Double getRain() {
        return rain;
    }

    public Double getSnow() {
        return snow;
    }

    @Override
    public String toString() {
        return "ForecastList{" +
                "dt=" + dt +
                ", sunrise=" + sunrise +
                ", sunset=" + sunset +
                ", temp=" + temp +
                ", feelsLike=" + feelsLike +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                ", weather=" + weather +
                ", speed=" + speed +
                ", deg=" + deg +
                ", clouds=" + clouds +
                ", rain=" + rain +
                ", snow=" + snow +
                '}';
    }
}
