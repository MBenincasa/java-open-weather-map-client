package io.github.mbenincasa.javaopenweathermapclient.dto;

import io.github.mbenincasa.javaopenweathermapclient.dto.fiveDaysWeatherForecast.City;
import io.github.mbenincasa.javaopenweathermapclient.dto.fiveDaysWeatherForecast.ForecastList;

import java.util.List;

public class FiveDaysWeatherForecastDTO {

    private String cod;
    private Integer message;
    private Integer cnt;
    private List<ForecastList> list;
    private City city;

    public FiveDaysWeatherForecastDTO() {
    }

    public FiveDaysWeatherForecastDTO(String cod, Integer message, Integer cnt, List<ForecastList> list, City city) {
        this.cod = cod;
        this.message = message;
        this.cnt = cnt;
        this.list = list;
        this.city = city;
    }

    public String getCod() {
        return cod;
    }

    public Integer getMessage() {
        return message;
    }

    public Integer getCnt() {
        return cnt;
    }

    public List<ForecastList> getList() {
        return list;
    }

    public City getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "WeatherForecastDTO{" +
                "cod='" + cod + '\'' +
                ", message=" + message +
                ", cnt=" + cnt +
                ", list=" + list +
                ", city=" + city +
                '}';
    }
}
