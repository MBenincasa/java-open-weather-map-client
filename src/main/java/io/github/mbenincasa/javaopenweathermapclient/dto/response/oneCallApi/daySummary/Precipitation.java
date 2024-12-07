package io.github.mbenincasa.javaopenweathermapclient.dto.response.oneCallApi.daySummary;

import java.util.Objects;

public class Precipitation {

    private Double total;

    public Precipitation() {
    }

    public Precipitation(Double total) {
        this.total = total;
    }

    public Double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Precipitation{" +
                "total=" + total +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Precipitation that)) return false;
        return Objects.equals(getTotal(), that.getTotal());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTotal());
    }
}
