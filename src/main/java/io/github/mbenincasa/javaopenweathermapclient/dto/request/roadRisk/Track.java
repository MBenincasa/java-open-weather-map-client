package io.github.mbenincasa.javaopenweathermapclient.dto.request.roadRisk;

import java.util.Objects;

public class Track {

    private Double lat;
    private Double lon;
    private Integer dt;

    public Track() {
    }

    public Track(Double lat, Double lon, Integer dt) {
        this.lat = lat;
        this.lon = lon;
        this.dt = dt;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Integer getDt() {
        return dt;
    }

    public void setDt(Integer dt) {
        this.dt = dt;
    }

    public static TrackBuilder builder() {
        return new TrackBuilder();
    }

    @Override
    public String toString() {
        return "Track{" +
                "lat=" + lat +
                ", lon=" + lon +
                ", dt=" + dt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Track track)) return false;
        return Objects.equals(getLat(), track.getLat()) && Objects.equals(getLon(), track.getLon()) && Objects.equals(getDt(), track.getDt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLat(), getLon(), getDt());
    }

    public static class TrackBuilder {
        private Double lat;
        private Double lon;
        private Integer dt;

        public TrackBuilder() {
        }

        public TrackBuilder lat(Double lat) {
            this.lat = lat;
            return this;
        }

        public TrackBuilder lon(Double lon) {
            this.lon = lon;
            return this;
        }

        public TrackBuilder dt(Integer dt) {
            this.dt = dt;
            return this;
        }

        public Track build() {
            return new Track(lat, lon, dt);
        }
    }
}
