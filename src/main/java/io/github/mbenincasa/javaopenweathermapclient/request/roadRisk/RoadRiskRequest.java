package io.github.mbenincasa.javaopenweathermapclient.request.roadRisk;

import io.github.mbenincasa.javaopenweathermapclient.dto.request.RoadRiskRequestDTO;
import io.github.mbenincasa.javaopenweathermapclient.dto.response.RoadRiskDTO;
import io.github.mbenincasa.javaopenweathermapclient.utils.HttpRequestExecutor;
import io.github.mbenincasa.javarestclient.exception.RestClientException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoadRiskRequest {

    private final String apiKey;

    public RoadRiskRequest(String apiKey) {
        this.apiKey = apiKey;
    }

    public Builder track(RoadRiskRequestDTO bodyRequest) {
        return new Builder(bodyRequest, this.apiKey);
    }

    public static class Builder {

        private final Map<String, Object> query;
        private final RoadRiskRequestDTO bodyRequest;

        private Builder(RoadRiskRequestDTO bodyRequest, String apiKey) {
            this.query = new HashMap<>();
            this.query.put("appid", apiKey);

            this.bodyRequest = bodyRequest;
        }

        public List<RoadRiskDTO> response() throws RestClientException {
            return HttpRequestExecutor.executePostList(
                    "https://api.openweathermap.org/data/2.5/roadrisk",
                    this.query,
                    this.bodyRequest,
                    RoadRiskDTO.class
            );
        }
    }
}
