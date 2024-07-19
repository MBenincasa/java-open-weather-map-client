package io.github.mbenincasa.javaopenweathermapclient.client;

import io.github.mbenincasa.javaopenweathermapclient.request.airPollution.CurrentAirPollutionRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.currentWeather.CurrentWeatherRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.weatherForecast.FiveDayWeatherForecastRequest;

public class DefaultOpenWeatherMapClient implements OpenWeatherMapClient {

    private final String apiKey;

    public DefaultOpenWeatherMapClient(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public CurrentWeatherRequest currentWeather() {
        return new CurrentWeatherRequest(apiKey);
    }

    @Override
    public FiveDayWeatherForecastRequest fiveDayWeatherForecast() {
        return new FiveDayWeatherForecastRequest(apiKey);
    }

    @Override
    public CurrentAirPollutionRequest currentAirPollution() {
        return new CurrentAirPollutionRequest(apiKey);
    }
}
