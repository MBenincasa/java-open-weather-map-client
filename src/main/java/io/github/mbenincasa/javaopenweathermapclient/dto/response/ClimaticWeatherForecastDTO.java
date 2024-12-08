package io.github.mbenincasa.javaopenweathermapclient.dto.response;

import io.github.mbenincasa.javaopenweathermapclient.dto.response.climaticWeatherForecast.City;
import io.github.mbenincasa.javaopenweathermapclient.dto.response.climaticWeatherForecast.ForecastList;

import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClimaticWeatherForecastDTO that)) return false;
        return Objects.equals(getCode(), that.getCode()) && Objects.equals(getCity(), that.getCity()) && Objects.equals(getMessage(), that.getMessage()) && Objects.equals(getCnt(), that.getCnt()) && Objects.equals(getList(), that.getList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode(), getCity(), getMessage(), getCnt(), getList());
    }
}
