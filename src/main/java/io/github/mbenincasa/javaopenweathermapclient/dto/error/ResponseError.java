package io.github.mbenincasa.javaopenweathermapclient.dto.error;

public class ResponseError {

    private String cod;
    private String message;

    public ResponseError() {
    }

    public ResponseError(String cod, String message) {
        this.cod = cod;
        this.message = message;
    }

    public String getCod() {
        return cod;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ResponseError{" +
                "cod='" + cod + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
