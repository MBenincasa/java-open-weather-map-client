package io.github.mbenincasa.javaopenweathermapclient.dto.common;

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
}
