package io.github.mbenincasa.javaopenweathermapclient.dto;

import io.github.mbenincasa.javaopenweathermapclient.dto.climaticWeatherForecast.City;
import io.github.mbenincasa.javaopenweathermapclient.dto.climaticWeatherForecast.ForecastList;

import java.util.List;

public class ClimaticWeatherForecastDTO {

    private String code;
    private City city;
    private String message;
    private Integer cnt;
    private List<ForecastList> list;

    public ClimaticWeatherForecastDTO() {
    }

    public ClimaticWeatherForecastDTO(String code, City city, String message, Integer cnt, List<ForecastList> list) {
        this.code = code;
        this.city = city;
        this.message = message;
        this.cnt = cnt;
        this.list = list;
    }

    public String getCode() {
        return code;
    }

    public City getCity() {
        return city;
    }

    public String getMessage() {
        return message;
    }

    public Integer getCnt() {
        return cnt;
    }

    public List<ForecastList> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "ClimaticWeatherForecastDTO{" +
                "code='" + code + '\'' +
                ", city=" + city +
                ", message='" + message + '\'' +
                ", cnt=" + cnt +
                ", list=" + list +
                '}';
    }
}
