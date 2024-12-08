package io.github.mbenincasa.javaopenweathermapclient.request.weatherMaps;

import io.github.mbenincasa.javaopenweathermapclient.utils.HttpRequestExecutor;
import io.github.mbenincasa.javarestclient.exception.RestClientException;

import java.util.HashMap;
import java.util.Map;

public class BasicWeatherMapRequest {

    private final String apiKey;

    public BasicWeatherMapRequest(String apiKey) {
        this.apiKey = apiKey;
    }

    public Builder layerAndCoords(BasicMapLayer layer, Integer x, Integer y, Integer z) {
        return new Builder(layer, x, y, z, this.apiKey);
    }

    public static class Builder {

        private final Map<String, Object> query;
        private final Map<String, Object> pathVar;

        private Builder(BasicMapLayer layer, Integer x, Integer y, Integer z, String apiKey) {
            this.query = new HashMap<>();
            this.query.put("appid", apiKey);

            this.pathVar = new HashMap<>();
            this.pathVar.put("layer", layer.getValue());
            this.pathVar.put("x", x);
            this.pathVar.put("y", y);
            this.pathVar.put("z", z);
        }

        public byte[] response() throws RestClientException {
            return HttpRequestExecutor.executeGetRaw(
                    "https://tile.openweathermap.org/map/{layer}/{z}/{x}/{y}.png",
                    this.query,
                    this.pathVar
            );
        }
    }
}
