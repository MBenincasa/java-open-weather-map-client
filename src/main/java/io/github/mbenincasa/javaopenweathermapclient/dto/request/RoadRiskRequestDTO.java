package io.github.mbenincasa.javaopenweathermapclient.dto.request;

import io.github.mbenincasa.javaopenweathermapclient.dto.request.roadRisk.Track;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RoadRiskRequestDTO {

    private List<Track> track;

    public RoadRiskRequestDTO() {
    }

    public RoadRiskRequestDTO(List<Track> track) {
        this.track = track;
    }

    public List<Track> getTrack() {
        return track;
    }

    public void setTrack(List<Track> track) {
        this.track = track;
    }

    public static RoadRiskRequestDTOBuilder builder() {
        return new RoadRiskRequestDTOBuilder();
    }

    @Override
    public String toString() {
        return "RoadRiskRequestDTO{" +
                "track=" + track +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RoadRiskRequestDTO that)) return false;
        return Objects.equals(getTrack(), that.getTrack());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTrack());
    }

    public static class RoadRiskRequestDTOBuilder {

        private List<Track> track;

        public RoadRiskRequestDTOBuilder() {
            this.track = new ArrayList<>();
        }

        public RoadRiskRequestDTOBuilder addTrack(Track track) {
            this.track.add(track);
            return this;
        }

        public RoadRiskRequestDTOBuilder track(List<Track> track) {
            this.track = track;
            return this;
        }

        public RoadRiskRequestDTO build() {
            return new RoadRiskRequestDTO(track);
        }
    }
}
