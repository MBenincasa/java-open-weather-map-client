package io.github.mbenincasa.javaopenweathermapclient.dto.oneCallApi.daySummary;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CloudCover that)) return false;
        return Objects.equals(getAfternoon(), that.getAfternoon());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAfternoon());
    }
}
