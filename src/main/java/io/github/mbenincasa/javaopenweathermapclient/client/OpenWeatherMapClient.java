package io.github.mbenincasa.javaopenweathermapclient.client;

import io.github.mbenincasa.javaopenweathermapclient.request.airPollution.CurrentAirPollutionRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.airPollution.ForecastAirPollutionRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.airPollution.HistoricalAirPollutionRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.currentWeather.CurrentWeatherRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.geocoding.GeocodingRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.weatherForecast.FiveDayWeatherForecastRequest;

public interface OpenWeatherMapClient {

    CurrentWeatherRequest currentWeather();

    FiveDayWeatherForecastRequest fiveDayWeatherForecast();

    CurrentAirPollutionRequest currentAirPollution();

    ForecastAirPollutionRequest forecastAirPollution();

    HistoricalAirPollutionRequest historicalAirPollution();

    GeocodingRequest geocoding();
}
