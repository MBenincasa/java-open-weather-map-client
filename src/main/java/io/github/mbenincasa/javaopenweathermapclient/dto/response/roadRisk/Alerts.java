package io.github.mbenincasa.javaopenweathermapclient.dto.response.roadRisk;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Alerts {

    @JsonProperty("sender_name")
    private String senderName;
    private String event;
    @JsonProperty("event_level")
    private Integer eventLevel;

    public Alerts() {
    }

    public Alerts(String senderName, String event, Integer eventLevel) {
        this.senderName = senderName;
        this.event = event;
        this.eventLevel = eventLevel;
    }

    public String getSenderName() {
        return senderName;
    }

    public String getEvent() {
        return event;
    }

    public Integer getEventLevel() {
        return eventLevel;
    }

    @Override
    public String toString() {
        return "Alerts{" +
                "senderName='" + senderName + '\'' +
                ", event='" + event + '\'' +
                ", eventLevel=" + eventLevel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alerts alerts)) return false;
        return Objects.equals(getSenderName(), alerts.getSenderName()) && Objects.equals(getEvent(), alerts.getEvent()) && Objects.equals(getEventLevel(), alerts.getEventLevel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSenderName(), getEvent(), getEventLevel());
    }
}
