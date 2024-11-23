package io.github.mbenincasa.javaopenweathermapclient.request.oneCallApi;

public enum OneCallApiExclude {

    CURRENT("current"),
    MINUTELY("minutely"),
    HOURLY("hourly"),
    DAILY("daily"),
    ALERTS("alerts");

    private final String value;

    OneCallApiExclude(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
