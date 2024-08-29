package io.github.mbenincasa.javaopenweathermapclient.request.geocoding;

import io.github.mbenincasa.javaopenweathermapclient.dto.GeocodingLocationDTO;
import io.github.mbenincasa.javaopenweathermapclient.dto.GeocodingZipDTO;
import io.github.mbenincasa.javaopenweathermapclient.utils.HttpRequestExecutor;
import io.github.mbenincasa.javarestclient.exception.RestClientException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeocodingRequest {

    private final String apiKey;

    public GeocodingRequest(String apiKey) {
        this.apiKey = apiKey;
    }

    public BuilderLocation locationName(String cityName, String stateCode, String countryCode) {
        return new BuilderLocation(cityName, stateCode, countryCode, this.apiKey);
    }

    public BuilderZip zipCode(String zipCode, String countryName) {
        return new BuilderZip(zipCode, countryName, this.apiKey);
    }

    public static class BuilderLocation {

        private final Map<String, Object> query;

        private BuilderLocation(String cityName, String stateCode, String countryCode, String apiKey) {
            this.query = new HashMap<>();
            this.query.put("appid", apiKey);
            this.query.put("q",
                    (stateCode == null || stateCode.isEmpty())
                            ? ((countryCode == null || countryCode.isEmpty())
                            ? cityName
                            : cityName + "," + countryCode)
                            : cityName + "," + stateCode + "," + countryCode
            );
        }

        public BuilderLocation limit(Integer limit) {
            this.query.put("limit", limit);
            return this;
        }

        public List<GeocodingLocationDTO> response() throws RestClientException {
            return HttpRequestExecutor.executeList(
                    "http://api.openweathermap.org/geo/1.0/direct",
                    this.query,
                    GeocodingLocationDTO.class
            );
        }
    }

    public static class BuilderZip {

        private final Map<String, Object> query;

        private BuilderZip(String zipCode, String countryCode, String apiKey) {
            this.query = new HashMap<>();
            this.query.put("appid", apiKey);
            this.query.put("zip",
                    (countryCode == null || countryCode.isEmpty())
                            ? zipCode
                            : zipCode + "," + countryCode);
        }

        public GeocodingZipDTO response() throws RestClientException {
            return HttpRequestExecutor.execute(
                    "http://api.openweathermap.org/geo/1.0/zip",
                    this.query,
                    GeocodingZipDTO.class
            );
        }
    }
}
