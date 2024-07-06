package io.github.mbenincasa.javaopenweathermapclient.client;

import io.github.mbenincasa.javaopenweathermapclient.dto.CurrentWeatherDTO;
import io.github.mbenincasa.javaopenweathermapclient.request.OpenWeatherMapRequest;
import io.github.mbenincasa.javarestclient.exception.RestClientException;

public interface OpenWeatherMapClient {

    CurrentWeatherDTO currentWeather(OpenWeatherMapRequest request) throws RestClientException;
}
