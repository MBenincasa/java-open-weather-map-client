package io.github.mbenincasa.javaopenweathermapclient.client;

import io.github.mbenincasa.javaopenweathermapclient.request.common.Lang;
import io.github.mbenincasa.javaopenweathermapclient.request.common.Unit;
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
                .units(Unit.METRIC)
                .lang(Lang.ITALIAN)
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
    public void testFiveDaysWeatherForecastCoordinates() throws RestClientException {
        var response = openWeatherMapClient.fiveDaysWeatherForecast()
                .coordinates(45.5101617, 9.0894415)
                .cnt(4)
                .units(Unit.METRIC)
                .lang(Lang.ITALIAN)
                .response();

        assertNotNull(response);
        assertNotNull(response.getCity());
        assertNotNull(response.getList());
        assertEquals(4, response.getCnt());
        assertEquals(4, response.getList().size());
        assertEquals("Pero", response.getCity().getName());
    }

    @Test
    public void testFiveDaysWeatherForecastCityName() throws RestClientException {
        var response = openWeatherMapClient.fiveDaysWeatherForecast()
                .cityName("London", null, "uk")
                .cnt(4)
                .units(Unit.METRIC)
                .response();

        assertNotNull(response);
        assertNotNull(response.getCity());
        assertNotNull(response.getList());
        assertEquals(4, response.getCnt());
        assertEquals(4, response.getList().size());
        assertEquals("London", response.getCity().getName());
    }

    @Test
    public void testFiveDaysWeatherForecastCityId() throws RestClientException {
        var response = openWeatherMapClient.fiveDaysWeatherForecast()
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
    public void testFiveDaysWeatherForecastZipCode() throws RestClientException {
        var response = openWeatherMapClient.fiveDaysWeatherForecast()
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

    @Test
    public void testDailyWeatherForecastCoordinates() throws RestClientException {
        var response = openWeatherMapClient.dailyWeatherForecast()
                .coordinates(45.5101617, 9.0894415)
                .cnt(4)
                .units(Unit.METRIC)
                .lang(Lang.ITALIAN)
                .response();

        assertNotNull(response);
        assertNotNull(response.getCity());
        assertNotNull(response.getList());
        assertEquals(4, response.getCnt());
        assertEquals(4, response.getList().size());
        assertEquals("Pero", response.getCity().getName());
    }

    @Test
    public void testDailyWeatherForecastCityName() throws RestClientException {
        var response = openWeatherMapClient.dailyWeatherForecast()
                .cityName("London", null, "uk")
                .cnt(4)
                .units(Unit.METRIC)
                .response();

        assertNotNull(response);
        assertNotNull(response.getCity());
        assertNotNull(response.getList());
        assertEquals(4, response.getCnt());
        assertEquals(4, response.getList().size());
        assertEquals("London", response.getCity().getName());
    }

    @Test
    public void testDailyWeatherForecastCityId() throws RestClientException {
        var response = openWeatherMapClient.dailyWeatherForecast()
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
    public void testDailyWeatherForecastZipCode() throws RestClientException {
        var response = openWeatherMapClient.dailyWeatherForecast()
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

    @Test
    public void testHourlyWeatherForecastCoordinates() throws RestClientException {
        var response = openWeatherMapClient.hourlyWeatherForecast()
                .coordinates(45.5101617, 9.0894415)
                .cnt(4)
                .units(Unit.METRIC)
                .lang(Lang.ITALIAN)
                .response();

        assertNotNull(response);
        assertNotNull(response.getCity());
        assertNotNull(response.getList());
        assertEquals(4, response.getCnt());
        assertEquals(4, response.getList().size());
        assertEquals("Zocca", response.getCity().getName());
    }

    @Test
    public void testHourlyWeatherForecastCityName() throws RestClientException {
        var response = openWeatherMapClient.hourlyWeatherForecast()
                .cityName("Zocca", null, "it")
                .cnt(4)
                .units(Unit.METRIC)
                .response();

        assertNotNull(response);
        assertNotNull(response.getCity());
        assertNotNull(response.getList());
        assertEquals(4, response.getCnt());
        assertEquals(4, response.getList().size());
        assertEquals("Zocca", response.getCity().getName());
    }

    @Test
    public void testHourlyWeatherForecastCityId() throws RestClientException {
        var response = openWeatherMapClient.hourlyWeatherForecast()
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
    public void testHourlyWeatherForecastZipCode() throws RestClientException {
        var response = openWeatherMapClient.hourlyWeatherForecast()
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

    @Test
    public void testCurrentAirPollution() throws RestClientException {
        var response = openWeatherMapClient.airPollution()
                .current()
                .coordinates(45.5101617, 9.0894415)
                .response();

        assertNotNull(response);
        assertNotNull(response.getCoord());
        assertNotNull(response.getList());
    }

    @Test
    public void testForecastAirPollution() throws RestClientException {
        var response = openWeatherMapClient.airPollution()
                .forecast()
                .coordinates(45.5101617, 9.0894415)
                .response();

        assertNotNull(response);
        assertNotNull(response.getCoord());
        assertNotNull(response.getList());
    }

    @Test
    public void testHistoricalAirPollution() throws RestClientException {
        var response = openWeatherMapClient.airPollution()
                .historical()
                .coordinatesAndTime(45.5101617, 9.0894415, 1606223802, 1606482999)
                .response();

        assertNotNull(response);
        assertNotNull(response.getCoord());
        assertNotNull(response.getList());
    }

    @Test
    public void testGeocodingByLocationName() throws RestClientException {
        var response = openWeatherMapClient.geocoding()
                .locationName("London", "England", "GB")
                .response();

        assertNotNull(response);
        assertEquals(1, response.size());
        var dto = response.get(0);
        assertNotNull(dto);
        assertEquals("London", dto.getName());
        assertEquals("GB", dto.getCountry());
        assertEquals("England", dto.getState());
        assertEquals("Londra", dto.getLocalNames().getIt());
    }

    @Test
    public void testGeocodingByZipCode() throws RestClientException {
        var response = openWeatherMapClient.geocoding()
                .zipCode("E14","GB")
                .response();

        assertNotNull(response);
        assertEquals("London", response.getName());
        assertEquals("GB", response.getCountry());
    }
}
