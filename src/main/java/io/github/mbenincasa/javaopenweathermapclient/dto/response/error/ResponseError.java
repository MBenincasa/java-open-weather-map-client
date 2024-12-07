package io.github.mbenincasa.javaopenweathermapclient.dto.response.error;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResponseError that)) return false;
        return Objects.equals(getCod(), that.getCod()) && Objects.equals(getMessage(), that.getMessage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCod(), getMessage());
    }
}
