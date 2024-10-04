package io.github.mbenincasa.javaopenweathermapclient.client;

import io.github.mbenincasa.javaopenweathermapclient.request.airPollution.AirPollutionRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.currentWeather.CurrentWeatherRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.geocoding.GeocodingRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.weatherForecast.DailyWeatherForecastRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.weatherForecast.FiveDaysWeatherForecastRequest;

public interface OpenWeatherMapClient {

    CurrentWeatherRequest currentWeather();

    FiveDaysWeatherForecastRequest fiveDaysWeatherForecast();

    DailyWeatherForecastRequest dailyWeatherForecast();

    AirPollutionRequest airPollution();

    GeocodingRequest geocoding();
}
