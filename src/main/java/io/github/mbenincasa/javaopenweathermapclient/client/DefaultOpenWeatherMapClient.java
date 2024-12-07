package io.github.mbenincasa.javaopenweathermapclient.client;

import io.github.mbenincasa.javaopenweathermapclient.request.airPollution.AirPollutionRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.bulkDownload.BulkDownloadRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.currentWeather.CurrentWeatherRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.geocoding.GeocodingRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.oneCallApi.OneCallApiRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.roadRisk.RoadRiskRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.weatherForecast.ClimaticWeatherForecastRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.weatherForecast.DailyWeatherForecastRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.weatherForecast.FiveDaysWeatherForecastRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.weatherForecast.HourlyWeatherForecastRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.weatherMaps.AdvancedWeatherMapRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.weatherMaps.BasicWeatherMapRequest;
import io.github.mbenincasa.javaopenweathermapclient.request.weatherMaps.GlobalPrecipitationMapRequest;

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
    public HourlyWeatherForecastRequest hourlyWeatherForecast() {
        return new HourlyWeatherForecastRequest(this.apiKey);
    }

    @Override
    public ClimaticWeatherForecastRequest climaticWeatherForecast() {
        return new ClimaticWeatherForecastRequest(this.apiKey);
    }

    @Override
    public AirPollutionRequest airPollution() {
        return new AirPollutionRequest(this.apiKey);
    }

    @Override
    public GeocodingRequest geocoding() {
        return new GeocodingRequest(this.apiKey);
    }

    @Override
    public BasicWeatherMapRequest basicWeatherMap() {
        return new BasicWeatherMapRequest(this.apiKey);
    }

    @Override
    public AdvancedWeatherMapRequest advancedWeatherMap() {
        return new AdvancedWeatherMapRequest(this.apiKey);
    }

    @Override
    public OneCallApiRequest oneCallApi() {
        return new OneCallApiRequest(this.apiKey);
    }

    @Override
    public BulkDownloadRequest bulk() {
        return new BulkDownloadRequest(this.apiKey);
    }

    @Override
    public GlobalPrecipitationMapRequest globalPrecipitationMap() {
        return new GlobalPrecipitationMapRequest(this.apiKey);
    }

    @Override
    public RoadRiskRequest roadRisk() {
        return new RoadRiskRequest(this.apiKey);
    }
}
