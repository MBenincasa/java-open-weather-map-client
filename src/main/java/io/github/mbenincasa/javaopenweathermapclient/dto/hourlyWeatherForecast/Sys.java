package io.github.mbenincasa.javaopenweathermapclient.dto.hourlyWeatherForecast;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sys sys)) return false;
        return Objects.equals(getPod(), sys.getPod());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPod());
    }
}
