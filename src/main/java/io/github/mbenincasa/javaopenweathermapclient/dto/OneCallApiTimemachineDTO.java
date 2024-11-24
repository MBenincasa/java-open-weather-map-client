package io.github.mbenincasa.javaopenweathermapclient.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.mbenincasa.javaopenweathermapclient.dto.oneCallApi.timemachine.Data;

import java.util.List;

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
}
