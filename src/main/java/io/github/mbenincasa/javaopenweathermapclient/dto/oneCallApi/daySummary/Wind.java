package io.github.mbenincasa.javaopenweathermapclient.dto.oneCallApi.daySummary;

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
    }
}
