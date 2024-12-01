package io.github.mbenincasa.javaopenweathermapclient.dto;

import io.github.mbenincasa.javaopenweathermapclient.dto.airPollution.AirPollutionList;
import io.github.mbenincasa.javaopenweathermapclient.dto.common.Coord;

import java.util.List;
import java.util.Objects;

public class AirPollutionDTO {

    private Coord coord;
    private List<AirPollutionList> list;

    public AirPollutionDTO() {
    }

    public AirPollutionDTO(Coord coord, List<AirPollutionList> list) {
        this.coord = coord;
        this.list = list;
    }

    public Coord getCoord() {
        return coord;
    }

    public List<AirPollutionList> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "AirPollutionDTO{" +
                "coord=" + coord +
                ", list=" + list +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AirPollutionDTO that)) return false;
        return Objects.equals(getCoord(), that.getCoord()) && Objects.equals(getList(), that.getList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCoord(), getList());
    }
}
