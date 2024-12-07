package io.github.mbenincasa.javaopenweathermapclient.dto.response.airPollution;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Components {

    private Double co;
    private Double no;
    private Double no2;
    private Double o3;
    private Double so2;
    @JsonProperty("pm2_5")
    private Double pm25;
    private Double pm10;
    private Double nh3;

    public Components() {
    }

    public Components(Double co, Double no, Double no2, Double o3, Double so2, Double pm25, Double pm10, Double nh3) {
        this.co = co;
        this.no = no;
        this.no2 = no2;
        this.o3 = o3;
        this.so2 = so2;
        this.pm25 = pm25;
        this.pm10 = pm10;
        this.nh3 = nh3;
    }

    public Double getCo() {
        return co;
    }

    public Double getNo() {
        return no;
    }

    public Double getNo2() {
        return no2;
    }

    public Double getO3() {
        return o3;
    }

    public Double getSo2() {
        return so2;
    }

    public Double getPm25() {
        return pm25;
    }

    public Double getPm10() {
        return pm10;
    }

    public Double getNh3() {
        return nh3;
    }

    @Override
    public String toString() {
        return "Components{" +
                "co=" + co +
                ", no=" + no +
                ", no2=" + no2 +
                ", o3=" + o3 +
                ", so2=" + so2 +
                ", pm25=" + pm25 +
                ", pm10=" + pm10 +
                ", nh3=" + nh3 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Components that)) return false;
        return Objects.equals(getCo(), that.getCo()) && Objects.equals(getNo(), that.getNo()) && Objects.equals(getNo2(), that.getNo2()) && Objects.equals(getO3(), that.getO3()) && Objects.equals(getSo2(), that.getSo2()) && Objects.equals(getPm25(), that.getPm25()) && Objects.equals(getPm10(), that.getPm10()) && Objects.equals(getNh3(), that.getNh3());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCo(), getNo(), getNo2(), getO3(), getSo2(), getPm25(), getPm10(), getNh3());
    }
}
