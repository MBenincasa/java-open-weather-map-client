package io.github.mbenincasa.javaopenweathermapclient.dto;

import io.github.mbenincasa.javaopenweathermapclient.dto.climaticWeatherForecast.City;
import io.github.mbenincasa.javaopenweathermapclient.dto.climaticWeatherForecast.ForecastList;

import java.util.List;

public class ClimaticWeatherForecastDTO {

    private String cod;
    private City city;
    private String message;
    private List<ForecastList> list;

    public ClimaticWeatherForecastDTO() {
    }

    public ClimaticWeatherForecastDTO(String cod, City city, String message, List<ForecastList> list) {
        this.cod = cod;
        this.city = city;
        this.message = message;
        this.list = list;
    }

    public String getCod() {
        return cod;
    }

    public City getCity() {
        return city;
    }

    public String getMessage() {
        return message;
    }

    public List<ForecastList> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "ClimaticWeatherForecastDTO{" +
                "cod='" + cod + '\'' +
                ", city=" + city +
                ", message='" + message + '\'' +
                ", list=" + list +
                '}';
    }
}
