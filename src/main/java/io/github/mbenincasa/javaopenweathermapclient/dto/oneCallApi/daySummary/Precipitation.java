package io.github.mbenincasa.javaopenweathermapclient.dto.oneCallApi.daySummary;

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
}
