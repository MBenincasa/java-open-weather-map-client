package io.github.mbenincasa.javaopenweathermapclient.builder;

import io.github.mbenincasa.javaopenweathermapclient.request.OpenWeatherMapRequest;

import java.util.HashMap;
import java.util.Map;

public class CurrentWeatherRequestBuilder {

    private Map<String, Object> query;

    private CurrentWeatherRequestBuilder(Double lat, Double lon) {
        this.query = new HashMap<>();
        query.put("lat", lat);
        query.put("lon", lon);
    }

    public static CurrentWeatherRequestBuilder coordinates(Double lat, Double lon) {
        return new CurrentWeatherRequestBuilder(lat, lon);
    }

    public CurrentWeatherRequestBuilder units(String unit) {
        query.put("units", unit);
        return this;
    }

    public CurrentWeatherRequestBuilder lang(String lang) {
        query.put("lang", lang);
        return this;
    }

    public OpenWeatherMapRequest build() {
        return new OpenWeatherMapRequest(query);
    }
}
