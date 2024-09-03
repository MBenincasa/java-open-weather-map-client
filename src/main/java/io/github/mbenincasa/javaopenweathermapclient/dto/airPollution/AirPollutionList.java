package io.github.mbenincasa.javaopenweathermapclient.dto.airPollution;

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

    public void setDt(Integer dt) {
        this.dt = dt;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Components getComponents() {
        return components;
    }

    public void setComponents(Components components) {
        this.components = components;
    }

    @Override
    public String toString() {
        return "AirPollutionList{" +
                "dt=" + dt +
                ", main=" + main +
                ", components=" + components +
                '}';
    }
}
