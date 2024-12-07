package io.github.mbenincasa.javaopenweathermapclient.dto.response;

import io.github.mbenincasa.javaopenweathermapclient.dto.response.dailyWeatherForecast.City;
import io.github.mbenincasa.javaopenweathermapclient.dto.response.dailyWeatherForecast.ForecastList;

import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DailyWeatherForecastDTO that)) return false;
        return Objects.equals(getCod(), that.getCod()) && Objects.equals(getMessage(), that.getMessage()) && Objects.equals(getCnt(), that.getCnt()) && Objects.equals(getCity(), that.getCity()) && Objects.equals(getList(), that.getList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCod(), getMessage(), getCnt(), getCity(), getList());
    }
}
