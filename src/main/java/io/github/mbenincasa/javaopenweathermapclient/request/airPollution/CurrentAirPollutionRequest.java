package io.github.mbenincasa.javaopenweathermapclient.request.airPollution;

import io.github.mbenincasa.javaopenweathermapclient.dto.AirPollutionDTO;
import io.github.mbenincasa.javaopenweathermapclient.utils.HttpRequestExecutor;
import io.github.mbenincasa.javarestclient.exception.RestClientException;

import java.util.HashMap;
import java.util.Map;

public class CurrentAirPollutionRequest {

    private final String apiKey;

    public CurrentAirPollutionRequest(String apiKey) {
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

        public AirPollutionDTO response() throws RestClientException {
            return HttpRequestExecutor.execute(
                    "https://api.openweathermap.org/data/2.5/air_pollution",
                    this.query,
                    AirPollutionDTO.class
            );
        }
    }
}
