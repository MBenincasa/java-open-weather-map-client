package io.github.mbenincasa.javaopenweathermapclient.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.mbenincasa.javaopenweathermapclient.dto.response.geocoding.LocalNames;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GeocodingLocationDTO that)) return false;
        return Objects.equals(getName(), that.getName()) && Objects.equals(getLocalNames(), that.getLocalNames()) && Objects.equals(getLat(), that.getLat()) && Objects.equals(getLon(), that.getLon()) && Objects.equals(getCountry(), that.getCountry()) && Objects.equals(getState(), that.getState());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLocalNames(), getLat(), getLon(), getCountry(), getState());
    }
}
