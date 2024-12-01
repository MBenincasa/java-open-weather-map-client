package io.github.mbenincasa.javaopenweathermapclient.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.mbenincasa.javaopenweathermapclient.dto.oneCallApi.daySummary.*;

import java.util.Objects;

public class OneCallApiDaySummaryDTO {

    private Double lat;
    private Double lon;
    private String tz;
    private String date;
    private String units;
    @JsonProperty("cloud_cover")
    private CloudCover cloudCover;
    private Humidity humidity;
    private Precipitation precipitation;
    private Temperature temperature;
    private Pressure pressure;
    private Wind wind;

    public OneCallApiDaySummaryDTO() {
    }

    public OneCallApiDaySummaryDTO(Double lat, Double lon, String tz, String date, String units, CloudCover cloudCover, Humidity humidity, Precipitation precipitation, Temperature temperature, Pressure pressure, Wind wind) {
        this.lat = lat;
        this.lon = lon;
        this.tz = tz;
        this.date = date;
        this.units = units;
        this.cloudCover = cloudCover;
        this.humidity = humidity;
        this.precipitation = precipitation;
        this.temperature = temperature;
        this.pressure = pressure;
        this.wind = wind;
    }

    public Double getLat() {
        return lat;
    }

    public Double getLon() {
        return lon;
    }

    public String getTz() {
        return tz;
    }

    public String getDate() {
        return date;
    }

    public String getUnits() {
        return units;
    }

    public CloudCover getCloudCover() {
        return cloudCover;
    }

    public Humidity getHumidity() {
        return humidity;
    }

    public Precipitation getPrecipitation() {
        return precipitation;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public Pressure getPressure() {
        return pressure;
    }

    public Wind getWind() {
        return wind;
    }

    @Override
    public String toString() {
        return "OneCallApiDaySummaryDTO{" +
                "lat=" + lat +
                ", lon=" + lon +
                ", tz='" + tz + '\'' +
                ", date='" + date + '\'' +
                ", units='" + units + '\'' +
                ", cloudCover=" + cloudCover +
                ", humidity=" + humidity +
                ", precipitation=" + precipitation +
                ", temperature=" + temperature +
                ", pressure=" + pressure +
                ", wind=" + wind +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OneCallApiDaySummaryDTO that)) return false;
        return Objects.equals(getLat(), that.getLat()) && Objects.equals(getLon(), that.getLon()) && Objects.equals(getTz(), that.getTz()) && Objects.equals(getDate(), that.getDate()) && Objects.equals(getUnits(), that.getUnits()) && Objects.equals(getCloudCover(), that.getCloudCover()) && Objects.equals(getHumidity(), that.getHumidity()) && Objects.equals(getPrecipitation(), that.getPrecipitation()) && Objects.equals(getTemperature(), that.getTemperature()) && Objects.equals(getPressure(), that.getPressure()) && Objects.equals(getWind(), that.getWind());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLat(), getLon(), getTz(), getDate(), getUnits(), getCloudCover(), getHumidity(), getPrecipitation(), getTemperature(), getPressure(), getWind());
    }
}
