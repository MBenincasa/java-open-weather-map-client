package io.github.mbenincasa.javaopenweathermapclient.request.oneCallApi;

import io.github.mbenincasa.javaopenweathermapclient.dto.OneCallApiCurrentAndForecastsDataDTO;
import io.github.mbenincasa.javaopenweathermapclient.request.common.Lang;
import io.github.mbenincasa.javaopenweathermapclient.request.common.Unit;
import io.github.mbenincasa.javaopenweathermapclient.utils.HttpRequestExecutor;
import io.github.mbenincasa.javarestclient.exception.RestClientException;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class OneCallApiRequest {

    private final String apiKey;

    public OneCallApiRequest(String apiKey) {
        this.apiKey = apiKey;
    }

    public BuilderCurrentAndForecast currentAndForecastsData(Double lat, Double lon) {
        return new BuilderCurrentAndForecast(lat, lon, this.apiKey);
    }

    public static class BuilderCurrentAndForecast {

        private final Map<String, Object> query;

        private BuilderCurrentAndForecast(Double lat, Double lon, String apiKey) {
            this.query = new HashMap<>();
            this.query.put("appid", apiKey);
            this.query.put("lat", lat);
            this.query.put("lon", lon);
        }

        public BuilderCurrentAndForecast exclude(OneCallApiExclude... excludes) {
            var excludesFormatted = Arrays.stream(excludes)
                    .map(OneCallApiExclude::getValue)
                    .collect(Collectors.joining(","));
            this.query.put("exclude", excludesFormatted);
            return this;
        }

        public BuilderCurrentAndForecast units(Unit unit) {
            this.query.put("units", unit.getValue());
            return this;
        }

        public BuilderCurrentAndForecast lang(Lang lang) {
            this.query.put("lang", lang.getValue());
            return this;
        }

        public OneCallApiCurrentAndForecastsDataDTO response() throws RestClientException {
            return HttpRequestExecutor.execute(
                    "https://api.openweathermap.org/data/3.0/onecall",
                    this.query,
                    OneCallApiCurrentAndForecastsDataDTO.class
            );
        }
    }
}
