package io.github.mbenincasa.javaopenweathermapclient.dto.response.roadRisk;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Weather {

    private Double temp;
    @JsonProperty("wind_speed")
    private Double windSpeed;
    @JsonProperty("wind_deg")
    private Integer windDeg;
    @JsonProperty("precipitation_intensity")
    private Double precipitationIntensity;
    @JsonProperty("dew_point")
    private Double dewPoint;

    public Weather() {
    }

    public Weather(Double temp, Double windSpeed, Integer windDeg, Double precipitationIntensity, Double dewPoint) {
        this.temp = temp;
        this.windSpeed = windSpeed;
        this.windDeg = windDeg;
        this.precipitationIntensity = precipitationIntensity;
        this.dewPoint = dewPoint;
    }

    public Double getTemp() {
        return temp;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public Integer getWindDeg() {
        return windDeg;
    }

    public Double getPrecipitationIntensity() {
        return precipitationIntensity;
    }

    public Double getDewPoint() {
        return dewPoint;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "temp=" + temp +
                ", windSpeed=" + windSpeed +
                ", windDeg=" + windDeg +
                ", precipitationIntensity=" + precipitationIntensity +
                ", dewPoint=" + dewPoint +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Weather weather)) return false;
        return Objects.equals(getTemp(), weather.getTemp()) && Objects.equals(getWindSpeed(), weather.getWindSpeed()) && Objects.equals(getWindDeg(), weather.getWindDeg()) && Objects.equals(getPrecipitationIntensity(), weather.getPrecipitationIntensity()) && Objects.equals(getDewPoint(), weather.getDewPoint());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTemp(), getWindSpeed(), getWindDeg(), getPrecipitationIntensity(), getDewPoint());
    }
}
