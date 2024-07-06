package io.github.mbenincasa.javaopenweathermapclient.client;

import io.github.mbenincasa.javaopenweathermapclient.request.CurrentWeatherRequest;
import io.github.mbenincasa.javarestclient.exception.RestClientException;

public interface OpenWeatherMapClient {

    CurrentWeatherRequest currentWeather() throws RestClientException;
}
