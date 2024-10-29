package io.github.mbenincasa.javaopenweathermapclient.exception;

import io.github.mbenincasa.javarestclient.exception.RestClientException;

public class OpenWeatherMapException extends RestClientException {

    public OpenWeatherMapException(String message) {
        super(message);
    }

    public OpenWeatherMapException(String message, Throwable cause) {
        super(message, cause);
    }
}
