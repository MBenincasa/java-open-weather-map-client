package io.github.mbenincasa.javaopenweathermapclient.dto;

import io.github.mbenincasa.javaopenweathermapclient.dto.dailyWeatherForecast.City;
import io.github.mbenincasa.javaopenweathermapclient.dto.dailyWeatherForecast.ForecastList;

import java.util.List;

public class DailyWeatherForecastDTO {

    private String cod;
    private Integer message;
    private Integer cnt;
    private City city;
    private List<ForecastList> list;

    public DailyWeatherForecastDTO() {
    }

    public DailyWeatherForecastDTO(String cod, Integer message, Integer cnt, City city, List<ForecastList> list) {
        this.cod = cod;
        this.message = message;
        this.cnt = cnt;
        this.city = city;
        this.list = list;
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

    public City getCity() {
        return city;
    }

    public List<ForecastList> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "DailyWeatherForecastDTO{" +
                "cod='" + cod + '\'' +
                ", message=" + message +
                ", cnt=" + cnt +
                ", city=" + city +
                ", list=" + list +
                '}';
    }
}
