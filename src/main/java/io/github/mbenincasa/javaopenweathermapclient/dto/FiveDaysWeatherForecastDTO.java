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

    public void setCod(String cod) {
        this.cod = cod;
    }

    public Integer getMessage() {
        return message;
    }

    public void setMessage(Integer message) {
        this.message = message;
    }

    public Integer getCnt() {
        return cnt;
    }

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }

    public List<ForecastList> getList() {
        return list;
    }

    public void setList(List<ForecastList> list) {
        this.list = list;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
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
