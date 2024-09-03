package io.github.mbenincasa.javaopenweathermapclient.dto.weatherForecast;

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

    public void setPod(String pod) {
        this.pod = pod;
    }

    @Override
    public String toString() {
        return "Sys{" +
                "pod='" + pod + '\'' +
                '}';
    }
}
