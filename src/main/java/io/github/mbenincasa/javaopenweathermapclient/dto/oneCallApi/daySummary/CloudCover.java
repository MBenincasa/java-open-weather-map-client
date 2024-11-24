package io.github.mbenincasa.javaopenweathermapclient.dto.oneCallApi.daySummary;

public class CloudCover {

    private Integer afternoon;

    public CloudCover() {
    }

    public CloudCover(Integer afternoon) {
        this.afternoon = afternoon;
    }

    public Integer getAfternoon() {
        return afternoon;
    }

    @Override
    public String toString() {
        return "CloudCover{" +
                "afternoon=" + afternoon +
                '}';
    }
}
