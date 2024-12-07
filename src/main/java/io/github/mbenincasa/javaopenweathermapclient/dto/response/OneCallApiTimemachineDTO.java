package io.github.mbenincasa.javaopenweathermapclient.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.mbenincasa.javaopenweathermapclient.dto.response.oneCallApi.timemachine.Data;

import java.util.List;
import java.util.Objects;

public class OneCallApiTimemachineDTO {

    private Double lat;
    private Double lon;
    private String timezone;
    @JsonProperty("timezone_offset")
    private Integer timezoneOffset;
    private List<Data> data;

    public OneCallApiTimemachineDTO() {
    }

    public OneCallApiTimemachineDTO(Double lat, Double lon, String timezone, Integer timezoneOffset, List<Data> data) {
        this.lat = lat;
        this.lon = lon;
        this.timezone = timezone;
        this.timezoneOffset = timezoneOffset;
        this.data = data;
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

    public List<Data> getData() {
        return data;
    }

    @Override
    public String toString() {
        return "OneCallApiTimemachineDTO{" +
                "lat=" + lat +
                ", lon=" + lon +
                ", timezone='" + timezone + '\'' +
                ", timezoneOffset=" + timezoneOffset +
                ", data=" + data +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OneCallApiTimemachineDTO that)) return false;
        return Objects.equals(getLat(), that.getLat()) && Objects.equals(getLon(), that.getLon()) && Objects.equals(getTimezone(), that.getTimezone()) && Objects.equals(getTimezoneOffset(), that.getTimezoneOffset()) && Objects.equals(getData(), that.getData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLat(), getLon(), getTimezone(), getTimezoneOffset(), getData());
    }
}
