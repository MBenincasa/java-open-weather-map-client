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

public interface OpenWeatherMapClient {

    CurrentWeatherRequest currentWeather();

    FiveDaysWeatherForecastRequest fiveDaysWeatherForecast();

    DailyWeatherForecastRequest dailyWeatherForecast();

    HourlyWeatherForecastRequest hourlyWeatherForecast();

    ClimaticWeatherForecastRequest climaticWeatherForecast();

    AirPollutionRequest airPollution();

    GeocodingRequest geocoding();

    BasicWeatherMapRequest basicWeatherMap();

    AdvancedWeatherMapRequest advancedWeatherMap();

    OneCallApiRequest oneCallApi();

    BulkDownloadRequest bulk();

    GlobalPrecipitationMapRequest globalPrecipitationMap();

    RoadRiskRequest roadRisk();
}
