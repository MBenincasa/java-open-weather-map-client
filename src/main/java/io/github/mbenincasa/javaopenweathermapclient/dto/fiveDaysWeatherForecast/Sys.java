package io.github.mbenincasa.javaopenweathermapclient.dto.fiveDaysWeatherForecast;

public class Sys {

    private String pod;

    public Sys() {
    }

    public Sys(String pod) {
        this.pod = pod;
    }

    public String getPod() {
        return pod;
    }

    @Override
    public String toString() {
        return "Sys{" +
                "pod='" + pod + '\'' +
                '}';
    }
}
