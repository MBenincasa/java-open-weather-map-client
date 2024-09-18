package io.github.mbenincasa.javaopenweathermapclient.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.mbenincasa.javaopenweathermapclient.dto.geocoding.LocalNames;

public class GeocodingLocationDTO {

    private String name;
    @JsonProperty("local_names")
    private LocalNames localNames;
    private Double lat;
    private Double lon;
    private String country;
    private String state;

    public GeocodingLocationDTO() {
    }

    public GeocodingLocationDTO(String name, LocalNames localNames, Double lat, Double lon, String country, String state) {
        this.name = name;
        this.localNames = localNames;
        this.lat = lat;
        this.lon = lon;
        this.country = country;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public LocalNames getLocalNames() {
        return localNames;
    }

    public Double getLat() {
        return lat;
    }

    public Double getLon() {
        return lon;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "GeocodingLocationDTO{" +
                "name='" + name + '\'' +
                ", localNames=" + localNames +
                ", lat=" + lat +
                ", lon=" + lon +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
