package io.github.mbenincasa.javaopenweathermapclient.dto.dailyWeatherForecast;

import com.fasterxml.jackson.annotation.JsonProperty;

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
    private Double speed;
    private Integer deg;
    private Double gust;
    private Integer clouds;
    private Integer pop;
    private Double rain;

    public ForecastList() {
    }

    public ForecastList(Integer dt, Integer sunrise, Integer sunset, Temp temp, FeelsLike feelsLike, Integer pressure, Integer humidity, List<Weather> weather, Double speed, Integer deg, Double gust, Integer clouds, Integer pop, Double rain) {
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
        this.gust = gust;
        this.clouds = clouds;
        this.pop = pop;
        this.rain = rain;
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

    public Double getSpeed() {
        return speed;
    }

    public Integer getDeg() {
        return deg;
    }

    public Double getGust() {
        return gust;
    }

    public Integer getClouds() {
        return clouds;
    }

    public Integer getPop() {
        return pop;
    }

    public Double getRain() {
        return rain;
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
                ", gust=" + gust +
                ", clouds=" + clouds +
                ", pop=" + pop +
                ", rain=" + rain +
                '}';
    }
}
