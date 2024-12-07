package io.github.mbenincasa.javaopenweathermapclient.request.airPollution;

import io.github.mbenincasa.javaopenweathermapclient.dto.response.AirPollutionDTO;
import io.github.mbenincasa.javaopenweathermapclient.utils.HttpRequestExecutor;
import io.github.mbenincasa.javarestclient.exception.RestClientException;

import java.util.HashMap;
import java.util.Map;

public class AirPollutionRequest {

    private final String apiKey;

    public AirPollutionRequest(String apiKey) {
        this.apiKey = apiKey;
    }

    public CurrentBuilder current() {
        return new CurrentBuilder(this.apiKey);
    }

    public ForecastBuilder forecast() {
        return new ForecastBuilder(this.apiKey);
    }

    public HistoricalBuilder historical() {
        return new HistoricalBuilder(this.apiKey);
    }

    public static class CurrentBuilder {
        private final Map<String, Object> query;

        private CurrentBuilder(String apiKey) {
            this.query = new HashMap<>();
            this.query.put("appid", apiKey);
        }

        public CurrentResponseBuilder coordinates(Double lat, Double lon) {
            this.query.put("lat", lat);
            this.query.put("lon", lon);
            return new CurrentResponseBuilder(this.query);  // Ritorna un builder finale per esporre il metodo response()
        }
    }

    public static class CurrentResponseBuilder {
        private final Map<String, Object> query;

        private CurrentResponseBuilder(Map<String, Object> query) {
            this.query = query;
        }

        public AirPollutionDTO response() throws RestClientException {
            return HttpRequestExecutor.executeGetSingle(
                    "https://api.openweathermap.org/data/2.5/air_pollution",
                    this.query,
                    AirPollutionDTO.class
            );
        }
    }

    public static class ForecastBuilder {
        private final Map<String, Object> query;

        private ForecastBuilder(String apiKey) {
            this.query = new HashMap<>();
            this.query.put("appid", apiKey);
        }

        public ForecastResponseBuilder coordinates(Double lat, Double lon) {
            this.query.put("lat", lat);
            this.query.put("lon", lon);
            return new ForecastResponseBuilder(this.query);  // Ritorna un builder finale per esporre il metodo response()
        }
    }

    public static class ForecastResponseBuilder {
        private final Map<String, Object> query;

        private ForecastResponseBuilder(Map<String, Object> query) {
            this.query = query;
        }

        public AirPollutionDTO response() throws RestClientException {
            return HttpRequestExecutor.executeGetSingle(
                    "https://api.openweathermap.org/data/2.5/air_pollution/forecast",
                    this.query,
                    AirPollutionDTO.class
            );
        }
    }

    public static class HistoricalBuilder {
        private final Map<String, Object> query;

        private HistoricalBuilder(String apiKey) {
            this.query = new HashMap<>();
            this.query.put("appid", apiKey);
        }

        public HistoricalResponseBuilder coordinatesAndTime(Double lat, Double lon, Integer start, Integer end) {
            this.query.put("lat", lat);
            this.query.put("lon", lon);
            this.query.put("start", start);
            this.query.put("end", end);
            return new HistoricalResponseBuilder(this.query);  // Ritorna un builder finale per esporre il metodo response()
        }
    }

    public static class HistoricalResponseBuilder {
        private final Map<String, Object> query;

        private HistoricalResponseBuilder(Map<String, Object> query) {
            this.query = query;
        }

        public AirPollutionDTO response() throws RestClientException {
            return HttpRequestExecutor.executeGetSingle(
                    "https://api.openweathermap.org/data/2.5/air_pollution/history",
                    this.query,
                    AirPollutionDTO.class
            );
        }
    }
}
