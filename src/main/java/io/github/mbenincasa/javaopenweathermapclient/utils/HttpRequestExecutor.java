package io.github.mbenincasa.javaopenweathermapclient.utils;

import io.github.mbenincasa.javaopenweathermapclient.exception.OpenWeatherMapException;
import io.github.mbenincasa.javarestclient.client.DefaultRestClient;
import io.github.mbenincasa.javarestclient.client.RestClient;
import io.github.mbenincasa.javarestclient.exception.RestClientException;
import io.github.mbenincasa.javarestclient.http.HttpStatus;
import io.github.mbenincasa.javarestclient.support.UriBuilder;

import java.util.List;
import java.util.Map;

public class HttpRequestExecutor {

    private static final RestClient restClient = new DefaultRestClient();

    public static <T> T executeGetSingle(String baseUrl, Map<String, Object> query, Class<T> responseType) throws RestClientException {
        var responseSpec = restClient.get()
                .uri(buildUri(baseUrl, query, Map.of()).build())
                .retrieve();

        handleErrorRequest(responseSpec);
        return responseSpec.getBody(responseType);
    }

    public static <T, R> List<T> executePostList(String baseUrl, Map<String, Object> query, R bodyRequest, Class<T> responseType) throws RestClientException {
        var responseSpec = restClient.post()
                .uri(buildUri(baseUrl, query, Map.of()).build())
                .body(bodyRequest)
                .retrieve();

        handleErrorRequest(responseSpec);
        return responseSpec.getBodyAsList(responseType);
    }

    public static <T> List<T> executeGetList(String baseUrl, Map<String, Object> query, Class<T> responseType) throws RestClientException {
        var responseSpec = restClient.get()
                .uri(buildUri(baseUrl, query, Map.of()).build())
                .retrieve();

        handleErrorRequest(responseSpec);
        return responseSpec.getBodyAsList(responseType);
    }

    public static byte[] executeGetRaw(String baseUrl, Map<String, Object> query, Map<String, Object> pathVar) throws RestClientException {
        var responseSpec = restClient.get()
                .uri(buildUri(baseUrl, query, pathVar).build())
                .retrieve();

        handleErrorRequest(responseSpec);
        return responseSpec.getBodyAsRaw();
    }

    private static UriBuilder buildUri(String baseUrl, Map<String, Object> query, Map<String, Object> pathVar) {
        UriBuilder uriBuilder = UriBuilder.create().uri(baseUrl);

        query.forEach(uriBuilder::queryParam);
        pathVar.forEach(uriBuilder::pathVariable);

        return uriBuilder;
    }

    private static void handleErrorRequest(RestClient.RestClientResponseSpec responseSpec) throws RestClientException {
        var responseStatus = responseSpec.getStatus();

        if (responseStatus.equals(HttpStatus.UNAUTHORIZED))
            throw new OpenWeatherMapException("Invalid API key");

        if (responseStatus.equals(HttpStatus.TOO_MANY_REQUESTS))
            throw new OpenWeatherMapException("Surpassing the limit of your subscription");

        if (responseStatus.equals(HttpStatus.BAD_REQUEST) || responseStatus.equals(HttpStatus.NOT_FOUND)) {
            var responseError = responseSpec.getBodyAsString();
            throw new OpenWeatherMapException(responseError);
        }

        if (responseStatus.getValue() >= 500)
            throw new OpenWeatherMapException("Contact OpenWeatherMap Support. Response status: " + responseStatus.getValue());
    }
}
