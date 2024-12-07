package io.github.mbenincasa.javaopenweathermapclient.request.weatherMaps;

import io.github.mbenincasa.javaopenweathermapclient.utils.HttpRequestExecutor;
import io.github.mbenincasa.javarestclient.exception.RestClientException;

import java.util.HashMap;
import java.util.Map;

public class GlobalPrecipitationMapRequest {

    private final String apiKey;

    public GlobalPrecipitationMapRequest(String apiKey) {
        this.apiKey = apiKey;
    }

    public Builder radar(Integer tm, Integer x, Integer y, Integer z) {
        return new Builder(tm, x, y, z, this.apiKey);
    }

    public static class Builder {

        private final Map<String, Object> query;
        private final Map<String, Object> pathVar;

        private Builder(Integer tm, Integer x, Integer y, Integer z, String apiKey) {
            this.query = new HashMap<>();
            this.query.put("appid", apiKey);
            this.query.put("tm", tm);

            this.pathVar = new HashMap<>();
            this.pathVar.put("x", x);
            this.pathVar.put("y", y);
            this.pathVar.put("z", z);
        }

        public byte[] response() throws RestClientException {
            return HttpRequestExecutor.executeGetRaw(
                    "https://maps.openweathermap.org/maps/2.0/radar/{z}/{x}/{y}",
                    this.query,
                    this.pathVar
            );
        }
    }
}
