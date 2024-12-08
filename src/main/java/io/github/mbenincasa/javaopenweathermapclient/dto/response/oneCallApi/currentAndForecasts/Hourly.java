package io.github.mbenincasa.javaopenweathermapclient.dto.response.oneCallApi.currentAndForecasts;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.mbenincasa.javaopenweathermapclient.dto.response.common.Weather;

import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hourly hourly)) return false;
        return Objects.equals(getDt(), hourly.getDt()) && Objects.equals(getTemp(), hourly.getTemp()) && Objects.equals(getFeelsLike(), hourly.getFeelsLike()) && Objects.equals(getPressure(), hourly.getPressure()) && Objects.equals(getHumidity(), hourly.getHumidity()) && Objects.equals(getDewPoint(), hourly.getDewPoint()) && Objects.equals(getUvi(), hourly.getUvi()) && Objects.equals(getClouds(), hourly.getClouds()) && Objects.equals(getVisibility(), hourly.getVisibility()) && Objects.equals(getWindSpeed(), hourly.getWindSpeed()) && Objects.equals(getWindDeg(), hourly.getWindDeg()) && Objects.equals(getWindGust(), hourly.getWindGust()) && Objects.equals(getWeather(), hourly.getWeather()) && Objects.equals(getRain(), hourly.getRain()) && Objects.equals(getSnow(), hourly.getSnow()) && Objects.equals(getPop(), hourly.getPop());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDt(), getTemp(), getFeelsLike(), getPressure(), getHumidity(), getDewPoint(), getUvi(), getClouds(), getVisibility(), getWindSpeed(), getWindDeg(), getWindGust(), getWeather(), getRain(), getSnow(), getPop());
    }
}
