package io.github.mbenincasa.javaopenweathermapclient.dto.oneCallApi.daySummary;

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
}
