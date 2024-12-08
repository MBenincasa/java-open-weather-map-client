package io.github.mbenincasa.javaopenweathermapclient.dto.response.oneCallApi.daySummary;

import java.util.Objects;

public class Humidity {

    private Integer afternoon;

    public Humidity() {
    }

    public Humidity(Integer afternoon) {
        this.afternoon = afternoon;
    }

    public Integer getAfternoon() {
        return afternoon;
    }

    @Override
    public String toString() {
        return "Humidity{" +
                "afternoon=" + afternoon +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Humidity humidity)) return false;
        return Objects.equals(getAfternoon(), humidity.getAfternoon());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAfternoon());
    }
}
