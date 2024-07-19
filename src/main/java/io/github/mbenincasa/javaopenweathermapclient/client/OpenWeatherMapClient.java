package io.github.mbenincasa.javaopenweathermapclient.client;

import io.github.mbenincasa.javaopenweathermapclient.request.airPollution.CurrentAirPollutionRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.currentWeather.CurrentWeatherRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.weatherForecast.FiveDayWeatherForecastRequest;

public interface OpenWeatherMapClient {

    CurrentWeatherRequest currentWeather();

    FiveDayWeatherForecastRequest fiveDayWeatherForecast();

    CurrentAirPollutionRequest currentAirPollution();
}
