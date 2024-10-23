package io.github.mbenincasa.javaopenweathermapclient.utils;

import io.github.mbenincasa.javarestclient.client.DefaultRestClient;
import io.github.mbenincasa.javarestclient.client.RestClient;
import io.github.mbenincasa.javarestclient.exception.RestClientException;
import io.github.mbenincasa.javarestclient.support.UriBuilder;

import java.util.List;
import java.util.Map;

public class HttpRequestExecutor {

    public static <T> T execute(String baseUrl, Map<String, Object> query, Class<T> responseType) throws RestClientException {
        RestClient restClient = new DefaultRestClient();
        UriBuilder uriBuilder = UriBuilder.create().uri(baseUrl);

        for (Map.Entry<String, Object> entry : query.entrySet()) {
            uriBuilder.queryParam(entry.getKey(), entry.getValue());
        }

        return restClient.get()
                .uri(uriBuilder.build())
                .retrieve()
                .getBody(responseType);
    }

    public static <T> List<T> executeList(String baseUrl, Map<String, Object> query, Class<T> responseType) throws RestClientException {
        RestClient restClient = new DefaultRestClient();
        UriBuilder uriBuilder = UriBuilder.create().uri(baseUrl);

        for (Map.Entry<String, Object> entry : query.entrySet()) {
            uriBuilder.queryParam(entry.getKey(), entry.getValue());
        }

        return restClient.get()
                .uri(uriBuilder.build())
                .retrieve()
                .getBodyAsList(responseType);
    }

    public static byte[] executeRaw(String baseUrl, Map<String, Object> query, Map<String, Object> pathVar) throws RestClientException {
        RestClient restClient = new DefaultRestClient();
        UriBuilder uriBuilder = UriBuilder.create().uri(baseUrl);

        for (Map.Entry<String, Object> entry : query.entrySet()) {
            uriBuilder.queryParam(entry.getKey(), entry.getValue());
        }

        for (Map.Entry<String, Object> entry : pathVar.entrySet()) {
            uriBuilder.pathVariable(entry.getKey(), entry.getValue());
        }

        return restClient.get()
                .uri(uriBuilder.build())
                .retrieve()
                .getBodyAsRaw();
    }
}
