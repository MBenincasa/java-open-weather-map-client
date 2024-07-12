package io.github.mbenincasa.javaopenweathermapclient.request;

import io.github.mbenincasa.javaopenweathermapclient.dto.CurrentWeatherDTO;
import io.github.mbenincasa.javaopenweathermapclient.utils.HttpRequestExecutor;
import io.github.mbenincasa.javarestclient.exception.RestClientException;

import java.util.HashMap;
import java.util.Map;

public class CurrentWeatherRequest {

    private final String apiKey;

    public CurrentWeatherRequest(String apiKey) {
        this.apiKey = apiKey;
    }

    public Builder coordinates(Double lat, Double lon) {
        return new Builder(lat, lon, this.apiKey);
    }

    public Builder cityId(Integer cityId) {
        return new Builder(cityId, this.apiKey);
    }

    public static class Builder {

        private final Map<String, Object> query;

        private Builder(Double lat, Double lon, String apiKey) {
            this.query = new HashMap<>();
            query.put("appid", apiKey);
            query.put("lat", lat);
            query.put("lon", lon);
        }

        private Builder(Integer cityId, String apiKey) {
            this.query = new HashMap<>();
            query.put("appid", apiKey);
            query.put("id", cityId);
        }

        public Builder units(String unit) {
            query.put("units", unit);
            return this;
        }

        public Builder lang(String lang) {
            query.put("lang", lang);
            return this;
        }

        public CurrentWeatherDTO response() throws RestClientException {
            return HttpRequestExecutor.execute(
                    "https://api.openweathermap.org/data/2.5/weather",
                    this.query,
                    CurrentWeatherDTO.class
            );
        }
    }
}
