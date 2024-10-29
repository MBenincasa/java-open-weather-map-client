package io.github.mbenincasa.javaopenweathermapclient.dto.climaticWeatherForecast;

import io.github.mbenincasa.javaopenweathermapclient.dto.common.Coord;

public class City {

    private Integer id;
    private String name;
    private Coord coord;
    private String country;
    private Integer population;
    private Integer timezone;

    public City() {
    }

    public City(Integer id, String name, Coord coord, String country, Integer population, Integer timezone) {
        this.id = id;
        this.name = name;
        this.coord = coord;
        this.country = country;
        this.population = population;
        this.timezone = timezone;
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

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coord=" + coord +
                ", country='" + country + '\'' +
                ", population=" + population +
                ", timezone=" + timezone +
                '}';
    }
}
