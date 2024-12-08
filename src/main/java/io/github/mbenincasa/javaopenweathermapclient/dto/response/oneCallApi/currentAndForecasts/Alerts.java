package io.github.mbenincasa.javaopenweathermapclient.dto.response.oneCallApi.currentAndForecasts;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

public class Alerts {

    @JsonProperty("sender_name")
    private String senderName;
    private String event;
    private Integer start;
    private Integer end;
    private String description;
    private List<String> tags;

    public Alerts() {
    }

    public Alerts(String senderName, String event, Integer start, Integer end, String description, List<String> tags) {
        this.senderName = senderName;
        this.event = event;
        this.start = start;
        this.end = end;
        this.description = description;
        this.tags = tags;
    }

    public String getSenderName() {
        return senderName;
    }

    public String getEvent() {
        return event;
    }

    public Integer getStart() {
        return start;
    }

    public Integer getEnd() {
        return end;
    }

    public String getDescription() {
        return description;
    }

    public List<String> gettags() {
        return tags;
    }

    @Override
    public String toString() {
        return "Alerts{" +
                "senderName='" + senderName + '\'' +
                ", event='" + event + '\'' +
                ", start=" + start +
                ", end=" + end +
                ", description='" + description + '\'' +
                ", tags=" + tags +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alerts alerts)) return false;
        return Objects.equals(getSenderName(), alerts.getSenderName()) && Objects.equals(getEvent(), alerts.getEvent()) && Objects.equals(getStart(), alerts.getStart()) && Objects.equals(getEnd(), alerts.getEnd()) && Objects.equals(getDescription(), alerts.getDescription()) && Objects.equals(tags, alerts.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSenderName(), getEvent(), getStart(), getEnd(), getDescription(), tags);
    }
}
