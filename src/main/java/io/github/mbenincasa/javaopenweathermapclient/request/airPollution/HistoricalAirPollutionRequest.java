package io.github.mbenincasa.javaopenweathermapclient.request.airPollution;

import io.github.mbenincasa.javaopenweathermapclient.dto.AirPollutionDTO;
import io.github.mbenincasa.javaopenweathermapclient.utils.HttpRequestExecutor;
import io.github.mbenincasa.javarestclient.exception.RestClientException;

import java.util.HashMap;
import java.util.Map;

public class HistoricalAirPollutionRequest {

    private final String apiKey;

    public HistoricalAirPollutionRequest(String apiKey) {
        this.apiKey = apiKey;
    }

    public Builder coordinatesAndTime(Double lat, Double lon, Integer start, Integer end) {
        return new Builder(lat, lon, start, end, this.apiKey);
    }

    public static class Builder {

        private final Map<String, Object> query;

        private Builder(Double lat, Double lon, Integer start, Integer end, String apiKey) {
            this.query = new HashMap<>();
            this.query.put("appid", apiKey);
            this.query.put("lat", lat);
            this.query.put("lon", lon);
            this.query.put("start", start);
            this.query.put("end", end);
        }

        public AirPollutionDTO response() throws RestClientException {
            return HttpRequestExecutor.execute(
                    "https://api.openweathermap.org/data/2.5/air_pollution/history",
                    this.query,
                    AirPollutionDTO.class
            );
        }
    }
}
