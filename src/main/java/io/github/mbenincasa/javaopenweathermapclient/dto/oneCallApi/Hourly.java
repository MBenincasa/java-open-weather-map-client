package io.github.mbenincasa.javaopenweathermapclient.dto.oneCallApi;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.mbenincasa.javaopenweathermapclient.dto.common.Weather;

import java.util.List;

public class Hourly {

    private Integer dt;
    private Double temp;
    @JsonProperty("feels_like")
    private Double feelsLike;
    private Integer pressure;
    private Integer humidity;
    @JsonProperty("dew_point")
    private Double dewPoint;
    private Double uvi;
    private Integer clouds;
    private Integer visibility;
    @JsonProperty("wind_speed")
    private Double windSpeed;
    @JsonProperty("wind_deg")
    private Integer windDeg;
    @JsonProperty("wind_gust")
    private Double windGust;
    private List<Weather> weather;
    private Rain rain;
    private Snow snow;
    private Double pop;

    public Hourly() {
    }

    public Hourly(Integer dt, Double temp, Double feelsLike, Integer pressure, Integer humidity, Double dewPoint, Double uvi, Integer clouds, Integer visibility, Double windSpeed, Integer windDeg, Double windGust, List<Weather> weather, Rain rain, Snow snow, Double pop) {
        this.dt = dt;
        this.temp = temp;
        this.feelsLike = feelsLike;
        this.pressure = pressure;
        this.humidity = humidity;
        this.dewPoint = dewPoint;
        this.uvi = uvi;
        this.clouds = clouds;
        this.visibility = visibility;
        this.windSpeed = windSpeed;
        this.windDeg = windDeg;
        this.windGust = windGust;
        this.weather = weather;
        this.rain = rain;
        this.snow = snow;
        this.pop = pop;
    }

    public Integer getDt() {
        return dt;
    }

    public Double getTemp() {
        return temp;
    }

    public Double getFeelsLike() {
        return feelsLike;
    }

    public Integer getPressure() {
        return pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public Double getDewPoint() {
        return dewPoint;
    }

    public Double getUvi() {
        return uvi;
    }

    public Integer getClouds() {
        return clouds;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public Integer getWindDeg() {
        return windDeg;
    }

    public Double getWindGust() {
        return windGust;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public Rain getRain() {
        return rain;
    }

    public Snow getSnow() {
        return snow;
    }

    public Double getPop() {
        return pop;
    }

    @Override
    public String toString() {
        return "Hourly{" +
                "dt=" + dt +
                ", temp=" + temp +
                ", feelsLike=" + feelsLike +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                ", dewPoint=" + dewPoint +
                ", uvi=" + uvi +
                ", clouds=" + clouds +
                ", visibility=" + visibility +
                ", windSpeed=" + windSpeed +
                ", windDeg=" + windDeg +
                ", windGust=" + windGust +
                ", weather=" + weather +
                ", rain=" + rain +
                ", snow=" + snow +
                ", pop=" + pop +
                '}';
    }
}
