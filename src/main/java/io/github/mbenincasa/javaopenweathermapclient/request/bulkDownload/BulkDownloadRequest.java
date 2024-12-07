package io.github.mbenincasa.javaopenweathermapclient.request.bulkDownload;

import io.github.mbenincasa.javaopenweathermapclient.utils.HttpRequestExecutor;
import io.github.mbenincasa.javarestclient.exception.RestClientException;

import java.util.HashMap;
import java.util.Map;

public class BulkDownloadRequest {

    private final String apiKey;

    public BulkDownloadRequest(String apiKey) {
        this.apiKey = apiKey;
    }

    public Builder download(String bulkFileName) {
        return new Builder(bulkFileName, this.apiKey);
    }

    public static class Builder {

        private final Map<String, Object> query;
        private final Map<String, Object> pathVar;

        private Builder(String bulkFileName, String apiKey) {
            this.query = new HashMap<>();
            this.query.put("appid", apiKey);

            this.pathVar = new HashMap<>();
            this.pathVar.put("bulk_file_name", bulkFileName);
        }

        public byte[] response() throws RestClientException {
            return HttpRequestExecutor.executeGetRaw(
                    "https://bulk.openweathermap.org/snapshot/{bulk_file_name}",
                    this.query,
                    this.pathVar
            );
        }
    }
}
