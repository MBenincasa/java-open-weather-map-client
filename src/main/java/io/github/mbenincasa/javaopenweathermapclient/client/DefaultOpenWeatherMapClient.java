package io.github.mbenincasa.javaopenweathermapclient.client;

import io.github.mbenincasa.javaopenweathermapclient.request.airPollution.AirPollutionRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.currentWeather.CurrentWeatherRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.geocoding.GeocodingRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.weatherForecast.DailyWeatherForecastRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.weatherForecast.FiveDaysWeatherForecastRequest;

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
    public FiveDaysWeatherForecastRequest fiveDaysWeatherForecast() {
        return new FiveDaysWeatherForecastRequest(this.apiKey);
    }

    @Override
    public DailyWeatherForecastRequest dailyWeatherForecast() {
        return new DailyWeatherForecastRequest(this.apiKey);
    }

    @Override
    public AirPollutionRequest airPollution() {
        return new AirPollutionRequest(this.apiKey);
    }

    @Override
    public GeocodingRequest geocoding() {
        return new GeocodingRequest(this.apiKey);
    }
}
