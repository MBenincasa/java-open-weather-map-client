package io.github.mbenincasa.javaopenweathermapclient.dto.response.airPollution;

import java.util.Objects;

public class AirPollutionList {

    private Integer dt;
    private Main main;
    private Components components;

    public AirPollutionList() {
    }

    public AirPollutionList(Integer dt, Main main, Components components) {
        this.dt = dt;
        this.main = main;
        this.components = components;
    }

    public Integer getDt() {
        return dt;
    }

    public Main getMain() {
        return main;
    }

    public Components getComponents() {
        return components;
    }

    @Override
    public String toString() {
        return "AirPollutionList{" +
                "dt=" + dt +
                ", main=" + main +
                ", components=" + components +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AirPollutionList that)) return false;
        return Objects.equals(getDt(), that.getDt()) && Objects.equals(getMain(), that.getMain()) && Objects.equals(getComponents(), that.getComponents());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDt(), getMain(), getComponents());
    }
}
