package io.github.mbenincasa.javaopenweathermapclient.client;

import io.github.mbenincasa.javaopenweathermapclient.request.airPollution.CurrentAirPollutionRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.airPollution.ForecastAirPollutionRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.airPollution.HistoricalAirPollutionRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.currentWeather.CurrentWeatherRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.geocoding.GeocodingRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.weatherForecast.FiveDayWeatherForecastRequest;

public class DefaultOpenWeatherMapClient implements OpenWeatherMapClient {

    private final String apiKey;

    public DefaultOpenWeatherMapClient(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public CurrentWeatherRequest currentWeather() {
        return new CurrentWeatherRequest(this.apiKey);
    }

    @Override
    public FiveDayWeatherForecastRequest fiveDayWeatherForecast() {
        return new FiveDayWeatherForecastRequest(this.apiKey);
    }

    @Override
    public CurrentAirPollutionRequest currentAirPollution() {
        return new CurrentAirPollutionRequest(this.apiKey);
    }

    @Override
    public ForecastAirPollutionRequest forecastAirPollution() {
        return new ForecastAirPollutionRequest(this.apiKey);
    }

    @Override
    public HistoricalAirPollutionRequest historicalAirPollution() {
        return new HistoricalAirPollutionRequest(this.apiKey);
    }

    @Override
    public GeocodingRequest geocoding() {
        return new GeocodingRequest(this.apiKey);
    }
}
