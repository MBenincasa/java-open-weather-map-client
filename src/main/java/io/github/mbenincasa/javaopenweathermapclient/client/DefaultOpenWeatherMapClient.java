package io.github.mbenincasa.javaopenweathermapclient.client;

import io.github.mbenincasa.javaopenweathermapclient.dto.CurrentWeatherDTO;
import io.github.mbenincasa.javaopenweathermapclient.request.OpenWeatherMapRequest;
import io.github.mbenincasa.javarestclient.client.DefaultRestClient;
import io.github.mbenincasa.javarestclient.client.RestClient;
import io.github.mbenincasa.javarestclient.exception.RestClientException;
import io.github.mbenincasa.javarestclient.support.UriBuilder;

import java.util.Map;

public class DefaultOpenWeatherMapClient implements OpenWeatherMapClient {

    private final String apiKey;
    private RestClient restClient;

    public DefaultOpenWeatherMapClient(String apiKey) {
        this.apiKey = apiKey;
        this.restClient = new DefaultRestClient();
    }

    @Override
    public CurrentWeatherDTO currentWeather(OpenWeatherMapRequest request) throws RestClientException {
        UriBuilder uriBuilder = UriBuilder.create()
                .uri("https://api.openweathermap.org/data/2.5/weather")
                .queryParam("appid", apiKey);

        for (Map.Entry<String, Object> entry : request.getQuery().entrySet()) {
            uriBuilder.queryParam(entry.getKey(), entry.getValue());
        }

        return restClient.get()
                .uri(uriBuilder.build())
                .retrieve()
                .getBody(CurrentWeatherDTO.class);
    }
}
