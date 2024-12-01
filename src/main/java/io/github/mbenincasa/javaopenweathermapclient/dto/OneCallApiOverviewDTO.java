package io.github.mbenincasa.javaopenweathermapclient.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class OneCallApiOverviewDTO {

    private Double lat;
    private Double lon;
    private String tz;
    private String date;
    private String units;
    @JsonProperty("weather_overview")
    private String weatherOverview;

    public OneCallApiOverviewDTO() {
    }

    public OneCallApiOverviewDTO(Double lat, Double lon, String tz, String date, String units, String weatherOverview) {
        this.lat = lat;
        this.lon = lon;
        this.tz = tz;
        this.date = date;
        this.units = units;
        this.weatherOverview = weatherOverview;
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

    public String getWeatherOverview() {
        return weatherOverview;
    }

    @Override
    public String toString() {
        return "OneCallApiOverviewDTO{" +
                "lat=" + lat +
                ", lon=" + lon +
                ", tz='" + tz + '\'' +
                ", date='" + date + '\'' +
                ", units='" + units + '\'' +
                ", weatherOverview='" + weatherOverview + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OneCallApiOverviewDTO that)) return false;
        return Objects.equals(getLat(), that.getLat()) && Objects.equals(getLon(), that.getLon()) && Objects.equals(getTz(), that.getTz()) && Objects.equals(getDate(), that.getDate()) && Objects.equals(getUnits(), that.getUnits()) && Objects.equals(getWeatherOverview(), that.getWeatherOverview());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLat(), getLon(), getTz(), getDate(), getUnits(), getWeatherOverview());
    }
}
