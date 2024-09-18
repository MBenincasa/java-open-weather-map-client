package io.github.mbenincasa.javaopenweathermapclient.dto.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Main {

    private Double temp;
    @JsonProperty("feels_like")
    private Double feelsLike;
    @JsonProperty("temp_min")
    private Double tempMin;
    @JsonProperty("temp_max")
    private Double tempMax;
    private Integer pressure;
    private Integer humidity;
    @JsonProperty("sea_level")
    private Integer seaLevel;
    @JsonProperty("grnd_level")
    private Integer grndLevel;
    @JsonProperty("temp_kf")
    private Double tempKf;

    public Main() {
    }

    public Main(Double temp, Double feelsLike, Double tempMin, Double tempMax, Integer pressure, Integer humidity, Integer seaLevel, Integer grndLevel, Double tempKf) {
        this.temp = temp;
        this.feelsLike = feelsLike;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.pressure = pressure;
        this.humidity = humidity;
        this.seaLevel = seaLevel;
        this.grndLevel = grndLevel;
        this.tempKf = tempKf;
    }

    public Double getTemp() {
        return temp;
    }

    public Double getFeelsLike() {
        return feelsLike;
    }

    public Double getTempMin() {
        return tempMin;
    }

    public Double getTempMax() {
        return tempMax;
    }

    public Integer getPressure() {
        return pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public Integer getSeaLevel() {
        return seaLevel;
    }

    public Integer getGrndLevel() {
        return grndLevel;
    }

    public Double getTempKf() {
        return tempKf;
    }

    @Override
    public String toString() {
        return "Main{" +
                "temp=" + temp +
                ", feelsLike=" + feelsLike +
                ", tempMin=" + tempMin +
                ", tempMax=" + tempMax +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                ", seaLevel=" + seaLevel +
                ", grndLevel=" + grndLevel +
                ", tempKf=" + tempKf +
                '}';
    }
}
