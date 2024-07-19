package io.github.mbenincasa.javaopenweathermapclient.dto.airPollution;

import com.fasterxml.jackson.annotation.JsonProperty;

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

    public void setCo(Double co) {
        this.co = co;
    }

    public Double getNo() {
        return no;
    }

    public void setNo(Double no) {
        this.no = no;
    }

    public Double getNo2() {
        return no2;
    }

    public void setNo2(Double no2) {
        this.no2 = no2;
    }

    public Double getO3() {
        return o3;
    }

    public void setO3(Double o3) {
        this.o3 = o3;
    }

    public Double getSo2() {
        return so2;
    }

    public void setSo2(Double so2) {
        this.so2 = so2;
    }

    public Double getPm25() {
        return pm25;
    }

    public void setPm25(Double pm25) {
        this.pm25 = pm25;
    }

    public Double getPm10() {
        return pm10;
    }

    public void setPm10(Double pm10) {
        this.pm10 = pm10;
    }

    public Double getNh3() {
        return nh3;
    }

    public void setNh3(Double nh3) {
        this.nh3 = nh3;
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
}
