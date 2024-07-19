package io.github.mbenincasa.javaopenweathermapclient.request.weatherForecast;

import io.github.mbenincasa.javaopenweathermapclient.dto.WeatherForecastDTO;
import io.github.mbenincasa.javaopenweathermapclient.utils.HttpRequestExecutor;
import io.github.mbenincasa.javarestclient.exception.RestClientException;

import java.util.HashMap;
import java.util.Map;

public class FiveDayWeatherForecastRequest {

    private final String apiKey;

    public FiveDayWeatherForecastRequest(String apiKey) {
        this.apiKey = apiKey;
    }

    public Builder coordinates(Double lat, Double lon) {
        return new Builder(lat, lon, this.apiKey);
    }

    public Builder cityName(String cityName, String stateCode, String countryCode) {
        return new Builder(cityName, stateCode, countryCode, this.apiKey);
    }

    public Builder cityId(Integer cityId) {
        return new Builder(cityId, this.apiKey);
    }

    public Builder zipCode(String zipCode, String countryName) {
        return new Builder(zipCode, countryName, this.apiKey);
    }

    public static class Builder {

        private final Map<String, Object> query;

        private Builder(Double lat, Double lon, String apiKey) {
            this.query = new HashMap<>();
            query.put("appid", apiKey);
            query.put("lat", lat);
            query.put("lon", lon);
        }

        private Builder(String cityName, String stateCode, String countryCode, String apiKey) {
            this.query = new HashMap<>();
            query.put("appid", apiKey);
            query.put("q",
                    (stateCode == null || stateCode.isEmpty())
                            ? ((countryCode == null || countryCode.isEmpty())
                            ? cityName
                            : cityName + "," + countryCode)
                            : cityName + "," + stateCode + "," + countryCode
            );
        }

        private Builder(Integer cityId, String apiKey) {
            this.query = new HashMap<>();
            query.put("appid", apiKey);
            query.put("id", cityId);
        }

        private Builder(String zipCode, String countryCode, String apiKey) {
            this.query = new HashMap<>();
            query.put("appid", apiKey);
            query.put("zip",
                    (countryCode == null || countryCode.isEmpty())
                            ? zipCode
                            : zipCode + "," + countryCode);
        }

        public Builder units(String unit) {
            query.put("units", unit);
            return this;
        }

        public Builder lang(String lang) {
            query.put("lang", lang);
            return this;
        }

        public Builder cnt(Integer cnt) {
            query.put("cnt", cnt);
            return this;
        }

        public WeatherForecastDTO response() throws RestClientException {
            return HttpRequestExecutor.execute(
                    "https://api.openweathermap.org/data/2.5/forecast",
                    this.query,
                    WeatherForecastDTO.class
            );
        }
    }
}
