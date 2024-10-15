package io.github.mbenincasa.javaopenweathermapclient.dto.climaticWeatherForecast;

import io.github.mbenincasa.javaopenweathermapclient.dto.common.Coord;

public class City {

    private Integer id;
    private String name;
    private Coord coord;
    private String country;

    public City() {
    }

    public City(Integer id, String name, Coord coord, String country) {
        this.id = id;
        this.name = name;
        this.coord = coord;
        this.country = country;
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

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coord=" + coord +
                ", country='" + country + '\'' +
                '}';
    }
}
