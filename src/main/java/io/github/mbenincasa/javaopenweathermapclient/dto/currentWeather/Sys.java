package io.github.mbenincasa.javaopenweathermapclient.dto.currentWeather;

import java.util.Objects;

public class Sys {

    private Integer type;
    private Integer id;
    private String country;
    private Integer sunrise;
    private Integer sunset;

    public Sys() {
    }

    public Sys(Integer type, Integer id, String country, Integer sunrise, Integer sunset) {
        this.type = type;
        this.id = id;
        this.country = country;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }

    public Integer getType() {
        return type;
    }

    public Integer getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public Integer getSunrise() {
        return sunrise;
    }

    public Integer getSunset() {
        return sunset;
    }

    @Override
    public String toString() {
        return "Sys{" +
                "type=" + type +
                ", id=" + id +
                ", country='" + country + '\'' +
                ", sunrise=" + sunrise +
                ", sunset=" + sunset +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sys sys)) return false;
        return Objects.equals(getType(), sys.getType()) && Objects.equals(getId(), sys.getId()) && Objects.equals(getCountry(), sys.getCountry()) && Objects.equals(getSunrise(), sys.getSunrise()) && Objects.equals(getSunset(), sys.getSunset());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getId(), getCountry(), getSunrise(), getSunset());
    }
}
