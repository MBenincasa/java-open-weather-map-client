package io.github.mbenincasa.javaopenweathermapclient.client;

import io.github.mbenincasa.javarestclient.exception.RestClientException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DefaultOpenWeatherMapClientTest {

    private OpenWeatherMapClient openWeatherMapClient;
    private final static String API_KEY = "API_KEY";

    @BeforeEach
    void setUp() {
        openWeatherMapClient = new DefaultOpenWeatherMapClient(API_KEY);
    }

    @Test
    public void testCurrentWeatherCoordinates() throws RestClientException {
        var response = openWeatherMapClient.currentWeather()
                .coordinates(45.5101617, 9.0894415)
                .units("metric")
                .lang("it")
                .response();

        assertNotNull(response);
        assertNotNull(response.getCoord());
        assertEquals(9.0894, response.getCoord().getLon());
        assertEquals(45.5102, response.getCoord().getLat());
        assertNotNull(response.getWeather());
        assertNotNull(response.getMain());
        assertEquals("Pero", response.getName());
    }

    @Test
    public void testCurrentWeatherCityName() throws RestClientException {
        var response = openWeatherMapClient.currentWeather()
                .cityName("London", null, "uk")
                .response();

        assertNotNull(response);
        assertNotNull(response.getCoord());
        assertEquals(-0.1257, response.getCoord().getLon());
        assertEquals(51.5085, response.getCoord().getLat());
        assertNotNull(response.getWeather());
        assertNotNull(response.getMain());
        assertEquals("London", response.getName());
    }

    @Test
    public void testCurrentWeatherCityId() throws RestClientException {
        var response = openWeatherMapClient.currentWeather()
                .cityId(2643743)
                .response();

        assertNotNull(response);
        assertNotNull(response.getCoord());
        assertEquals(-0.1257, response.getCoord().getLon());
        assertEquals(51.5085, response.getCoord().getLat());
        assertNotNull(response.getWeather());
        assertNotNull(response.getMain());
        assertEquals("London", response.getName());
    }

    @Test
    public void testCurrentWeatherZipCode() throws RestClientException {
        var response = openWeatherMapClient.currentWeather()
                .zipCode("20016", "it")
                .response();

        assertNotNull(response);
        assertNotNull(response.getCoord());
        assertEquals(9.087, response.getCoord().getLon());
        assertEquals(45.5102, response.getCoord().getLat());
        assertNotNull(response.getWeather());
        assertNotNull(response.getMain());
        assertEquals("Pero", response.getName());
    }

    @Test
    public void testFiveDayWeatherForecastCoordinates() throws RestClientException {
        var response = openWeatherMapClient.fiveDayWeatherForecast()
                .coordinates(45.5101617, 9.0894415)
                .cnt(4)
                .units("metric")
                .lang("it")
                .response();

        assertNotNull(response);
        assertNotNull(response.getCity());
        assertNotNull(response.getList());
        assertEquals(4, response.getCnt());
        assertEquals(4, response.getList().size());
        assertEquals("Pero", response.getCity().getName());
    }

    @Test
    public void testFiveDayWeatherForecastCityName() throws RestClientException {
        var response = openWeatherMapClient.fiveDayWeatherForecast()
                .cityName("London", null, "uk")
                .cnt(4)
                .units("metric")
                .response();

        assertNotNull(response);
        assertNotNull(response.getCity());
        assertNotNull(response.getList());
        assertEquals(4, response.getCnt());
        assertEquals(4, response.getList().size());
        assertEquals("London", response.getCity().getName());
    }

    @Test
    public void testFiveDayWeatherForecastCityId() throws RestClientException {
        var response = openWeatherMapClient.fiveDayWeatherForecast()
                .cityId(2643743)
                .cnt(2)
                .response();

        assertNotNull(response);
        assertNotNull(response.getCity());
        assertNotNull(response.getList());
        assertEquals(2, response.getCnt());
        assertEquals(2, response.getList().size());
        assertEquals("London", response.getCity().getName());
    }

    @Test
    public void testFiveDayWeatherForecastZipCode() throws RestClientException {
        var response = openWeatherMapClient.fiveDayWeatherForecast()
                .zipCode("20016", "it")
                .cnt(2)
                .response();

        assertNotNull(response);
        assertNotNull(response.getCity());
        assertNotNull(response.getList());
        assertEquals(2, response.getCnt());
        assertEquals(2, response.getList().size());
        assertEquals("Pero", response.getCity().getName());
    }
}
