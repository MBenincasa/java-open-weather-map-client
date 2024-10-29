package io.github.mbenincasa.javaopenweathermapclient.request.weatherMaps;

import io.github.mbenincasa.javaopenweathermapclient.utils.HttpRequestExecutor;
import io.github.mbenincasa.javarestclient.exception.RestClientException;

import java.util.HashMap;
import java.util.Map;

public class AdvancedWeatherMapRequest {

    private final String apiKey;

    public AdvancedWeatherMapRequest(String apiKey) {
        this.apiKey = apiKey;
    }

    public Builder layerAndCoords(AdvancedMapLayer layer, Integer x, Integer y, Integer z) {
        return new Builder(layer, x, y, z, this.apiKey);
    }

    public static class Builder {

        private final Map<String, Object> query;
        private final Map<String, Object> pathVar;

        private Builder(AdvancedMapLayer layer, Integer x, Integer y, Integer z, String apiKey) {
            this.query = new HashMap<>();
            this.query.put("appid", apiKey);

            this.pathVar = new HashMap<>();
            this.pathVar.put("layer", layer.getValue());
            this.pathVar.put("x", x);
            this.pathVar.put("y", y);
            this.pathVar.put("z", z);
        }

        public Builder date(Integer date) {
            this.query.put("date", date);
            return this;
        }

        public Builder opacity(Double opacity) {
            this.query.put("opacity", opacity);
            return this;
        }

        public Builder palette(String palette) {
            this.query.put("palette", palette);
            return this;
        }

        public Builder fillBound(boolean fillBound) {
            this.query.put("fill_bound", fillBound);
            return this;
        }

        public Builder arrowStep(Integer arrowStep) {
            this.query.put("arrow_step", arrowStep);
            return this;
        }

        public Builder useNorm(boolean useNorm) {
            this.query.put("use_norm", useNorm);
            return this;
        }

        public byte[] response() throws RestClientException {
            return HttpRequestExecutor.executeRaw(
                    "https://maps.openweathermap.org/maps/2.0/weather/{layer}/{z}/{x}/{y}",
                    this.query,
                    this.pathVar
            );
        }
    }
}
