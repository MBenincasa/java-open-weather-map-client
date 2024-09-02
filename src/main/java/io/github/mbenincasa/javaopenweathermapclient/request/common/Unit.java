package io.github.mbenincasa.javaopenweathermapclient.request.common;

public enum Unit {
    METRIC("metric"),
    IMPERIAL("imperial"),
    STANDARD("standard");

    private final String value;

    Unit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
