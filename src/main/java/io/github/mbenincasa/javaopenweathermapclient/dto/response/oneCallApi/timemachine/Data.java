package io.github.mbenincasa.javaopenweathermapclient.dto.response.oneCallApi.timemachine;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.mbenincasa.javaopenweathermapclient.dto.response.common.Weather;
import io.github.mbenincasa.javaopenweathermapclient.dto.response.oneCallApi.currentAndForecasts.Rain;
import io.github.mbenincasa.javaopenweathermapclient.dto.response.oneCallApi.currentAndForecasts.Snow;

import java.util.List;
import java.util.Objects;

public class Data {

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
    private List<Weather> weather;
    private Rain rain;
    private Snow snow;

    public Data() {
    }

    public Data(Integer dt, Integer sunrise, Integer sunset, Double temp, Double feelsLike, Integer pressure, Integer humidity, Double dewPoint, Double uvi, Integer clouds, Integer visibility, Double windSpeed, Integer windDeg, List<Weather> weather, Rain rain, Snow snow) {
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
        return "Data{" +
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
                ", weather=" + weather +
                ", rain=" + rain +
                ", snow=" + snow +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Data data)) return false;
        return Objects.equals(getDt(), data.getDt()) && Objects.equals(getSunrise(), data.getSunrise()) && Objects.equals(getSunset(), data.getSunset()) && Objects.equals(getTemp(), data.getTemp()) && Objects.equals(getFeelsLike(), data.getFeelsLike()) && Objects.equals(getPressure(), data.getPressure()) && Objects.equals(getHumidity(), data.getHumidity()) && Objects.equals(getDewPoint(), data.getDewPoint()) && Objects.equals(getUvi(), data.getUvi()) && Objects.equals(getClouds(), data.getClouds()) && Objects.equals(getVisibility(), data.getVisibility()) && Objects.equals(getWindSpeed(), data.getWindSpeed()) && Objects.equals(getWindDeg(), data.getWindDeg()) && Objects.equals(getWeather(), data.getWeather()) && Objects.equals(getRain(), data.getRain()) && Objects.equals(getSnow(), data.getSnow());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDt(), getSunrise(), getSunset(), getTemp(), getFeelsLike(), getPressure(), getHumidity(), getDewPoint(), getUvi(), getClouds(), getVisibility(), getWindSpeed(), getWindDeg(), getWeather(), getRain(), getSnow());
    }
}
