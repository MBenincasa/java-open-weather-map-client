package io.github.mbenincasa.javaopenweathermapclient.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.mbenincasa.javaopenweathermapclient.dto.response.oneCallApi.currentAndForecasts.*;

import java.util.List;
import java.util.Objects;

public class OneCallApiCurrentAndForecastsDataDTO {

    private Double lat;
    private Double lon;
    private String timezone;
    @JsonProperty("timezone_offset")
    private Integer timezoneOffset;
    private Current current;
    private List<Minutely> minutely;
    private List<Hourly> hourly;
    private List<Daily> daily;
    private List<Alerts> alerts;

    public OneCallApiCurrentAndForecastsDataDTO() {
    }

    public OneCallApiCurrentAndForecastsDataDTO(Double lat, Double lon, String timezone, Integer timezoneOffset, Current current, List<Minutely> minutely, List<Hourly> hourly, List<Daily> daily, List<Alerts> alerts) {
        this.lat = lat;
        this.lon = lon;
        this.timezone = timezone;
        this.timezoneOffset = timezoneOffset;
        this.current = current;
        this.minutely = minutely;
        this.hourly = hourly;
        this.daily = daily;
        this.alerts = alerts;
    }

    public Double getLat() {
        return lat;
    }

    public Double getLon() {
        return lon;
    }

    public String getTimezone() {
        return timezone;
    }

    public Integer getTimezoneOffset() {
        return timezoneOffset;
    }

    public Current getCurrent() {
        return current;
    }

    public List<Minutely> getMinutely() {
        return minutely;
    }

    public List<Hourly> getHourly() {
        return hourly;
    }

    public List<Daily> getDaily() {
        return daily;
    }

    public List<Alerts> getAlerts() {
        return alerts;
    }

    @Override
    public String toString() {
        return "OneCallApiCurrentAndForecastsDataDTO{" +
                "lat=" + lat +
                ", lon=" + lon +
                ", timezone='" + timezone + '\'' +
                ", timezoneOffset=" + timezoneOffset +
                ", current=" + current +
                ", minutely=" + minutely +
                ", hourly=" + hourly +
                ", daily=" + daily +
                ", alerts=" + alerts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OneCallApiCurrentAndForecastsDataDTO that)) return false;
        return Objects.equals(getLat(), that.getLat()) && Objects.equals(getLon(), that.getLon()) && Objects.equals(getTimezone(), that.getTimezone()) && Objects.equals(getTimezoneOffset(), that.getTimezoneOffset()) && Objects.equals(getCurrent(), that.getCurrent()) && Objects.equals(getMinutely(), that.getMinutely()) && Objects.equals(getHourly(), that.getHourly()) && Objects.equals(getDaily(), that.getDaily()) && Objects.equals(getAlerts(), that.getAlerts());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLat(), getLon(), getTimezone(), getTimezoneOffset(), getCurrent(), getMinutely(), getHourly(), getDaily(), getAlerts());
    }
}
