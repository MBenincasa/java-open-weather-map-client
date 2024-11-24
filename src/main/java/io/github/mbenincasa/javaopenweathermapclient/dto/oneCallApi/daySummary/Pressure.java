package io.github.mbenincasa.javaopenweathermapclient.dto.oneCallApi.daySummary;

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
}
