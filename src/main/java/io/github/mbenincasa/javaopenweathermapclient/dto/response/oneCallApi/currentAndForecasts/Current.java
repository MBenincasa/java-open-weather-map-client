package io.github.mbenincasa.javaopenweathermapclient.dto.response.oneCallApi.currentAndForecasts;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.mbenincasa.javaopenweathermapclient.dto.response.common.Weather;

import java.util.List;
import java.util.Objects;

public class Current {

    private Integer dt;
    private Integer sunrise;
    private Integer sunset;
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

    public Current() {
    }

    public Current(Integer dt, Integer sunrise, Integer sunset, Double temp, Double feelsLike, Integer pressure, Integer humidity, Double dewPoint, Double uvi, Integer clouds, Integer visibility, Double windSpeed, Integer windDeg, Double windGust, List<Weather> weather, Rain rain, Snow snow) {
        this.dt = dt;
        this.sunrise = sunrise;
        this.sunset = sunset;
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

    @Override
    public String toString() {
        return "Current{" +
                "dt=" + dt +
                ", sunrise=" + sunrise +
                ", sunset=" + sunset +
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
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Current current)) return false;
        return Objects.equals(getDt(), current.getDt()) && Objects.equals(getSunrise(), current.getSunrise()) && Objects.equals(getSunset(), current.getSunset()) && Objects.equals(getTemp(), current.getTemp()) && Objects.equals(getFeelsLike(), current.getFeelsLike()) && Objects.equals(getPressure(), current.getPressure()) && Objects.equals(getHumidity(), current.getHumidity()) && Objects.equals(getDewPoint(), current.getDewPoint()) && Objects.equals(getUvi(), current.getUvi()) && Objects.equals(getClouds(), current.getClouds()) && Objects.equals(getVisibility(), current.getVisibility()) && Objects.equals(getWindSpeed(), current.getWindSpeed()) && Objects.equals(getWindDeg(), current.getWindDeg()) && Objects.equals(getWindGust(), current.getWindGust()) && Objects.equals(getWeather(), current.getWeather()) && Objects.equals(getRain(), current.getRain()) && Objects.equals(getSnow(), current.getSnow());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDt(), getSunrise(), getSunset(), getTemp(), getFeelsLike(), getPressure(), getHumidity(), getDewPoint(), getUvi(), getClouds(), getVisibility(), getWindSpeed(), getWindDeg(), getWindGust(), getWeather(), getRain(), getSnow());
    }
}
