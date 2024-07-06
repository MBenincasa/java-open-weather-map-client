package io.github.mbenincasa.javaopenweathermapclient.request;

import java.util.Map;

public class OpenWeatherMapRequest {

    private Map<String, Object> query;

    public OpenWeatherMapRequest(Map<String, Object> query) {
        this.query = query;
    }

    public Map<String, Object> getQuery() {
        return query;
    }

    public void setQuery(Map<String, Object> query) {
        this.query = query;
    }
}
