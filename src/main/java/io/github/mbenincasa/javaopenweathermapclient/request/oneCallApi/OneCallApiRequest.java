package io.github.mbenincasa.javaopenweathermapclient.request.oneCallApi;

import io.github.mbenincasa.javaopenweathermapclient.dto.OneCallApiCurrentAndForecastsDataDTO;
import io.github.mbenincasa.javaopenweathermapclient.dto.OneCallApiDaySummaryDTO;
import io.github.mbenincasa.javaopenweathermapclient.dto.OneCallApiOverviewDTO;
import io.github.mbenincasa.javaopenweathermapclient.dto.OneCallApiTimemachineDTO;
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

    public BuilderTimemachine timemachine(Double lat, Double lon, Integer dt) {
        return new BuilderTimemachine(lat, lon, dt, this.apiKey);
    }

    public BuilderDailyAggregation daySummary(Double lat, Double lon, Integer dt) {
        return new BuilderDailyAggregation(lat, lon, dt, this.apiKey);
    }

    public BuilderOverview overview(Double lat, Double lon) {
        return new BuilderOverview(lat, lon, this.apiKey);
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
            return HttpRequestExecutor.executeGetSingle(
                    "https://api.openweathermap.org/data/3.0/onecall",
                    this.query,
                    OneCallApiCurrentAndForecastsDataDTO.class
            );
        }
    }

    public static class BuilderTimemachine {

        private final Map<String, Object> query;

        private BuilderTimemachine(Double lat, Double lon, Integer dt, String apiKey) {
            this.query = new HashMap<>();
            this.query.put("appid", apiKey);
            this.query.put("lat", lat);
            this.query.put("lon", lon);
            this.query.put("dt", dt);
        }

        public BuilderTimemachine units(Unit unit) {
            this.query.put("units", unit.getValue());
            return this;
        }

        public BuilderTimemachine lang(Lang lang) {
            this.query.put("lang", lang.getValue());
            return this;
        }

        public OneCallApiTimemachineDTO response() throws RestClientException {
            return HttpRequestExecutor.executeGetSingle(
                    "https://api.openweathermap.org/data/3.0/onecall/timemachine",
                    this.query,
                    OneCallApiTimemachineDTO.class
            );
        }
    }

    public static class BuilderDailyAggregation {

        private final Map<String, Object> query;

        private BuilderDailyAggregation(Double lat, Double lon, Integer dt, String apiKey) {
            this.query = new HashMap<>();
            this.query.put("appid", apiKey);
            this.query.put("lat", lat);
            this.query.put("lon", lon);
            this.query.put("dt", dt);
        }

        public BuilderDailyAggregation units(Unit unit) {
            this.query.put("units", unit.getValue());
            return this;
        }

        public BuilderDailyAggregation lang(Lang lang) {
            this.query.put("lang", lang.getValue());
            return this;
        }

        public BuilderDailyAggregation tz(String tz) {
            this.query.put("tz", tz);
            return this;
        }

        public OneCallApiDaySummaryDTO response() throws RestClientException {
            return HttpRequestExecutor.executeGetSingle(
                    "https://api.openweathermap.org/data/3.0/onecall/day_summary",
                    this.query,
                    OneCallApiDaySummaryDTO.class
            );
        }
    }

    public static class BuilderOverview {

        private final Map<String, Object> query;

        private BuilderOverview(Double lat, Double lon, String apiKey) {
            this.query = new HashMap<>();
            this.query.put("appid", apiKey);
            this.query.put("lat", lat);
            this.query.put("lon", lon);
        }

        public BuilderOverview units(Unit unit) {
            this.query.put("units", unit.getValue());
            return this;
        }

        public BuilderOverview date(String date) {
            this.query.put("date", date);
            return this;
        }

        public OneCallApiOverviewDTO response() throws RestClientException {
            return HttpRequestExecutor.executeGetSingle(
                    "https://api.openweathermap.org/data/3.0/onecall/overview",
                    this.query,
                    OneCallApiOverviewDTO.class
            );
        }
    }
}
