package io.github.mbenincasa.javaopenweathermapclient.client;

import io.github.mbenincasa.javaopenweathermapclient.request.CurrentWeatherRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.FiveDayWeatherForecastRequest;
import io.github.mbenincasa.javarestclient.exception.RestClientException;

public interface OpenWeatherMapClient {

    CurrentWeatherRequest currentWeather() throws RestClientException;

    FiveDayWeatherForecastRequest fiveDayWeatherForecast() throws RestClientException;
}
