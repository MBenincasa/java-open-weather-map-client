package io.github.mbenincasa.javaopenweathermapclient.dto.oneCallApi.daySummary;

import java.util.Objects;

public class Pressure {

    private Integer afternoon;

    public Pressure() {
    }

    public Pressure(Integer afternoon) {
        this.afternoon = afternoon;
    }

    public Integer getAfternoon() {
        return afternoon;
    }

    @Override
    public String toString() {
        return "Pressure{" +
                "afternoon=" + afternoon +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pressure pressure)) return false;
        return Objects.equals(getAfternoon(), pressure.getAfternoon());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAfternoon());
    }
}
