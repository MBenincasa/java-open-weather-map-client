package io.github.mbenincasa.javaopenweathermapclient.dto.oneCallApi.daySummary;

import java.util.Objects;

public class Wind {

    private Max max;

    public Wind() {
    }

    public Wind(Max max) {
        this.max = max;
    }

    public Max getMax() {
        return max;
    }

    @Override
    public String toString() {
        return "Wind{" +
                "max=" + max +
                '}';
    }

    public static class Max {

        private Double speed;
        private Integer direction;

        public Max() {
        }

        public Max(Double speed, Integer direction) {
            this.speed = speed;
            this.direction = direction;
        }

        public Double getSpeed() {
            return speed;
        }

        public Integer getDirection() {
            return direction;
        }

        @Override
        public String toString() {
            return "Max{" +
                    "speed=" + speed +
                    ", direction=" + direction +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Max max)) return false;
            return Objects.equals(getSpeed(), max.getSpeed()) && Objects.equals(getDirection(), max.getDirection());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getSpeed(), getDirection());
        }
    }
}
