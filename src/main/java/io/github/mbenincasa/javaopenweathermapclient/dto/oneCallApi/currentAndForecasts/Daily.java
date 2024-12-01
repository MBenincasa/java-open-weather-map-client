package io.github.mbenincasa.javaopenweathermapclient.dto.oneCallApi.currentAndForecasts;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.mbenincasa.javaopenweathermapclient.dto.common.Weather;

import java.util.List;
import java.util.Objects;

public class Daily {

    private Integer dt;
    private Integer sunrise;
    private Integer sunset;
    private Integer moonrise;
    private Integer moonset;
    @JsonProperty("moon_phase")
    private Double moonPhase;
    private String summary;
    private Temp temp;
    @JsonProperty("feels_like")
    private FeelsLike feelsLike;
    private Integer pressure;
    private Integer humidity;
    @JsonProperty("dew_point")
    private Double dewPoint;
    @JsonProperty("wind_speed")
    private Double windSpeed;
    @JsonProperty("wind_deg")
    private Integer windDeg;
    @JsonProperty("wind_gust")
    private Double windGust;
    private List<Weather> weather;
    private Integer clouds;
    private Double pop;
    private Double rain;
    private Double snow;
    private Double uvi;

    public Daily() {
    }

    public Daily(Integer dt, Integer sunrise, Integer sunset, Integer moonrise, Integer moonset, Double moonPhase, String summary, Temp temp, FeelsLike feelsLike, Integer pressure, Integer humidity, Double dewPoint, Double windSpeed, Integer windDeg, Double windGust, List<Weather> weather, Integer clouds, Double pop, Double rain, Double snow, Double uvi) {
        this.dt = dt;
        this.sunrise = sunrise;
        this.sunset = sunset;
        this.moonrise = moonrise;
        this.moonset = moonset;
        this.moonPhase = moonPhase;
        this.summary = summary;
        this.temp = temp;
        this.feelsLike = feelsLike;
        this.pressure = pressure;
        this.humidity = humidity;
        this.dewPoint = dewPoint;
        this.windSpeed = windSpeed;
        this.windDeg = windDeg;
        this.windGust = windGust;
        this.weather = weather;
        this.clouds = clouds;
        this.pop = pop;
        this.rain = rain;
        this.snow = snow;
        this.uvi = uvi;
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

    public Integer getMoonrise() {
        return moonrise;
    }

    public Integer getMoonset() {
        return moonset;
    }

    public Double getMoonPhase() {
        return moonPhase;
    }

    public String getSummary() {
        return summary;
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

    public Double getDewPoint() {
        return dewPoint;
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

    public Integer getClouds() {
        return clouds;
    }

    public Double getPop() {
        return pop;
    }

    public Double getRain() {
        return rain;
    }

    public Double getSnow() {
        return snow;
    }

    public Double getUvi() {
        return uvi;
    }

    @Override
    public String toString() {
        return "Daily{" +
                "dt=" + dt +
                ", sunrise=" + sunrise +
                ", sunset=" + sunset +
                ", moonrise=" + moonrise +
                ", moonset=" + moonset +
                ", moonPhase=" + moonPhase +
                ", summary='" + summary + '\'' +
                ", temp=" + temp +
                ", feelsLike=" + feelsLike +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                ", dewPoint=" + dewPoint +
                ", windSpeed=" + windSpeed +
                ", windDeg=" + windDeg +
                ", windGust=" + windGust +
                ", weather=" + weather +
                ", clouds=" + clouds +
                ", pop=" + pop +
                ", rain=" + rain +
                ", snow=" + snow +
                ", uvi=" + uvi +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Daily daily)) return false;
        return Objects.equals(getDt(), daily.getDt()) && Objects.equals(getSunrise(), daily.getSunrise()) && Objects.equals(getSunset(), daily.getSunset()) && Objects.equals(getMoonrise(), daily.getMoonrise()) && Objects.equals(getMoonset(), daily.getMoonset()) && Objects.equals(getMoonPhase(), daily.getMoonPhase()) && Objects.equals(getSummary(), daily.getSummary()) && Objects.equals(getTemp(), daily.getTemp()) && Objects.equals(getFeelsLike(), daily.getFeelsLike()) && Objects.equals(getPressure(), daily.getPressure()) && Objects.equals(getHumidity(), daily.getHumidity()) && Objects.equals(getDewPoint(), daily.getDewPoint()) && Objects.equals(getWindSpeed(), daily.getWindSpeed()) && Objects.equals(getWindDeg(), daily.getWindDeg()) && Objects.equals(getWindGust(), daily.getWindGust()) && Objects.equals(getWeather(), daily.getWeather()) && Objects.equals(getClouds(), daily.getClouds()) && Objects.equals(getPop(), daily.getPop()) && Objects.equals(getRain(), daily.getRain()) && Objects.equals(getSnow(), daily.getSnow()) && Objects.equals(getUvi(), daily.getUvi());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDt(), getSunrise(), getSunset(), getMoonrise(), getMoonset(), getMoonPhase(), getSummary(), getTemp(), getFeelsLike(), getPressure(), getHumidity(), getDewPoint(), getWindSpeed(), getWindDeg(), getWindGust(), getWeather(), getClouds(), getPop(), getRain(), getSnow(), getUvi());
    }
}
