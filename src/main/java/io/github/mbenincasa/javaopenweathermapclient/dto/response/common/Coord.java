package io.github.mbenincasa.javaopenweathermapclient.dto.response.common;

import java.util.Objects;

public class Coord {

    private Double lat;
    private Double lon;

    public Coord() {
    }

    public Coord(Double lat, Double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public Double getLon() {
        return lon;
    }

    @Override
    public String toString() {
        return "Coord{" +
                "lat=" + lat +
                ", lon=" + lon +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coord coord)) return false;
        return Objects.equals(getLat(), coord.getLat()) && Objects.equals(getLon(), coord.getLon());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLat(), getLon());
    }
}
