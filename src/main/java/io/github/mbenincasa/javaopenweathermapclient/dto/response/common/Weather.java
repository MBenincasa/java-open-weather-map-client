package io.github.mbenincasa.javaopenweathermapclient.dto.response.common;

import java.util.Objects;

public class Weather {

    private Integer id;
    private String main;
    private String description;
    private String icon;

    public Weather() {
    }

    public Weather(Integer id, String main, String description, String icon) {
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    }

    public Integer getId() {
        return id;
    }

    public String getMain() {
        return main;
    }

    public String getDescription() {
        return description;
    }

    public String getIcon() {
        return icon;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "id=" + id +
                ", main='" + main + '\'' +
                ", description='" + description + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Weather weather)) return false;
        return Objects.equals(getId(), weather.getId()) && Objects.equals(getMain(), weather.getMain()) && Objects.equals(getDescription(), weather.getDescription()) && Objects.equals(getIcon(), weather.getIcon());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMain(), getDescription(), getIcon());
    }
}
