package io.github.mbenincasa.javaopenweathermapclient.dto.response.common;

import java.util.Objects;

public class Clouds {

    private Integer all;

    public Clouds() {
    }

    public Clouds(Integer all) {
        this.all = all;
    }

    public Integer getAll() {
        return all;
    }

    @Override
    public String toString() {
        return "Clouds{" +
                "all=" + all +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clouds clouds)) return false;
        return Objects.equals(getAll(), clouds.getAll());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAll());
    }
}
