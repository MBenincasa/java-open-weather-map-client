package io.github.mbenincasa.javaopenweathermapclient.request;

import io.github.mbenincasa.javaopenweathermapclient.dto.FiveDayWeatherForecastDTO;
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

    public static class Builder {

        private final Map<String, Object> query;

        private Builder(Double lat, Double lon, String apiKey) {
            this.query = new HashMap<>();
            query.put("appid", apiKey);
            query.put("lat", lat);
            query.put("lon", lon);
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

        public FiveDayWeatherForecastDTO response() throws RestClientException {
            return HttpRequestExecutor.execute(
                    "https://api.openweathermap.org/data/2.5/forecast",
                    this.query,
                    FiveDayWeatherForecastDTO.class
            );
        }
    }
}
