package io.github.mbenincasa.javaopenweathermapclient.dto.response.fiveDaysWeatherForecast;

import io.github.mbenincasa.javaopenweathermapclient.dto.response.common.Coord;

import java.util.Objects;

public class City {

    private Integer id;
    private String name;
    private Coord coord;
    private String country;
    private Integer population;
    private Integer timezone;
    private Integer sunrise;
    private Integer sunset;

    public City() {
    }

    public City(Integer id, String name, Coord coord, String country, Integer population, Integer timezone, Integer sunrise, Integer sunset) {
        this.id = id;
        this.name = name;
        this.coord = coord;
        this.country = country;
        this.population = population;
        this.timezone = timezone;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Coord getCoord() {
        return coord;
    }

    public String getCountry() {
        return country;
    }

    public Integer getPopulation() {
        return population;
    }

    public Integer getTimezone() {
        return timezone;
    }

    public Integer getSunrise() {
        return sunrise;
    }

    public Integer getSunset() {
        return sunset;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coord=" + coord +
                ", country='" + country + '\'' +
                ", population=" + population +
                ", timezone=" + timezone +
                ", sunrise=" + sunrise +
                ", sunset=" + sunset +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City city)) return false;
        return Objects.equals(getId(), city.getId()) && Objects.equals(getName(), city.getName()) && Objects.equals(getCoord(), city.getCoord()) && Objects.equals(getCountry(), city.getCountry()) && Objects.equals(getPopulation(), city.getPopulation()) && Objects.equals(getTimezone(), city.getTimezone()) && Objects.equals(getSunrise(), city.getSunrise()) && Objects.equals(getSunset(), city.getSunset());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getCoord(), getCountry(), getPopulation(), getTimezone(), getSunrise(), getSunset());
    }
}
