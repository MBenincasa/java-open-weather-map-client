package io.github.mbenincasa.javaopenweathermapclient.dto.response;

import java.util.Objects;

public class GeocodingZipDTO {

    private String zip;
    private String name;
    private Double lat;
    private Double lon;
    private String country;

    public GeocodingZipDTO() {
    }

    public GeocodingZipDTO(String zip, String name, Double lat, Double lon, String country) {
        this.zip = zip;
        this.name = name;
        this.lat = lat;
        this.lon = lon;
        this.country = country;
    }

    public String getZip() {
        return zip;
    }

    public String getName() {
        return name;
    }

    public Double getLat() {
        return lat;
    }

    public Double getLon() {
        return lon;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "GeocodingZipDTO{" +
                "zip='" + zip + '\'' +
                ", name='" + name + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GeocodingZipDTO that)) return false;
        return Objects.equals(getZip(), that.getZip()) && Objects.equals(getName(), that.getName()) && Objects.equals(getLat(), that.getLat()) && Objects.equals(getLon(), that.getLon()) && Objects.equals(getCountry(), that.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getZip(), getName(), getLat(), getLon(), getCountry());
    }
}
