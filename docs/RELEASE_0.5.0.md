# Release 0.5.0

## Table of Contents
1. [Overview](#1-overview)
2. [Features](#2-features)
3. [OpenWeatherMapClient](#3-openweathermapclient)
4. [Usage](#4-usage)
   1. [Setting Up the Client](#41-setting-up-the-client)
   2. [One Call API 3.0](#42-one-call-api-30)
   3. [Current Weather](#43-current-weather)
   4. [3-Hour 5-Day Weather Forecast](#44-3-hour-5-day-weather-forecast)
   5. [Hourly 4-Day Forecast](#45-hourly-4-day-weather-forecast)
   6. [Daily 16-Day Weather Forecast](#46-daily-16-day-weather-forecast)
   7. [Climatic 30-Day Weather Forecast](#47-climatic-30-day-weather-forecast)
   8. [Air Pollution](#48-air-pollution)
   9. [Geocoding](#49-geocoding)
   10. [Basic weather maps](#410-basic-weather-maps)

## 1. Overview
Version `0.5.0` introduces **One Call API 3.0**, a comprehensive solution for retrieving essential weather data. This update allows users to access both **short-term** and **long-term forecasts**, along with **aggregated weather data**. With this new addition, the library expands its capabilities to provide a more complete weather data experience.

## 2. Features
- **One Call API 3.0**
  - Current and forecasts weather data
  - Weather data for timestamp
  - Daily Aggregation
  - Weather overview
- **Current & Forecast weather data collection**
  - Current Weather
  - 3-hour Forecast (5 days)
  - Hourly Forecast (4 days)
  - Daily Forecast (16 days)
  - Climatic Forecast (30 days)
- **Maps collection**
  - Basic weather maps
  - Advanced weather maps
  - Historical maps
- **Other weather API's collection**
  - Air Pollution API
  - Geocoding API

## 3. OpenWeatherMapClient
The `OpenWeatherMapClient` interface provides methods to access various weather-related services through the OpenWeatherMap API. Each method returns a request builder for different types of data, such as current weather, forecasts, air pollution, and geocoding.

### 3.1. Methods
- **`currentWeather()`**: Returns an instance of `CurrentWeatherRequest` for retrieving real-time weather data for any location.
- **`fiveDaysWeatherForecast()`**: Returns an instance of `FiveDaysWeatherForecastRequest` for getting 3-hourly weather forecasts for the next 5 days.
- **`dailyWeatherForecast()`**: Returns an instance of `DailyWeatherForecastRequest` for retrieving daily weather forecasts for up to 16 days.
- **`hourlyWeatherForecast()`**: Returns an instance of `HourlyWeatherForecastRequest` for obtaining hourly weather forecasts.
- **`climaticWeatherForecast()`**: Returns an instance of `ClimaticWeatherForecastRequest` for accessing broader climatic forecasts.
- **`airPollution()`**: Returns an instance of `AirPollutionRequest` for obtaining current air quality data.
- **`geocoding()`**: Returns an instance of `GeocodingRequest` for converting location names or zip codes into geographic coordinates.
- **`basicWeatherMap()`**: Returns an instance of `BasicWeatherMapRequest` for accessing basic weather map data.
- **`advancedWeatherMap()`**: Returns an instance of `AdvancedWeatherMapRequest` for accessing advanced weather map data.

## 4. Usage
This section will guide you on how to use the `OpenWeatherMapClient` to access various services provided by the API. We will cover how to retrieve current weather, forecasts, air pollution data, and geocoding using coordinates, city names, and postal codes

### 4.1. Setting Up the Client
First, create an instance of `OpenWeatherMapClient` by passing your API key:

```java
var apiKey = "YOUR_API_KEY";
OpenWeatherMapClient openWeatherMapClient = new DefaultOpenWeatherMapClient(apiKey);
```

### 4.2. One Call API 3.0
Get essential weather data, short-term and long-term forecasts and aggregated weather data.

#### 4.2.1. Available Methods for Current and forecasts weather data
- `currentAndForecastsData(Double lat, Double lon)`: Retrieves current and forecast weather data for a given geographic location using latitude and longitude.
    - **Parameters**:
        - `lat`: The latitude of the desired location.
        - `lon`: The longitude of the desired location.
- `exclude(OneCallApiExclude... excludes)` (optional): Specifies which parts of the weather data to exclude in the response, such as hourly or daily forecasts.
    - **Parameters**:
        - `excludes`: One or more `OneCallApiExclude` values indicating the data to exclude.
- `units(Unit unit)` (optional): Specifies the unit of measurement for the temperature, e.g., Metric or Imperial.
    - **Parameters**:
        - `unit`: The unit of measurement (e.g., `Unit.METRIC` or `Unit.IMPERIAL`).
- `lang(Lang lang)` (optional): Specifies the language for weather descriptions in the response.
    - **Parameters**:
        - `lang`: The desired language (e.g., `Lang.ITALIAN` or `Lang.ENGLISH`).
- `response()`: Executes the HTTP request and retrieves current weather data along with forecasts. Returns a `OneCallApiCurrentAndForecastsDataDTO` object containing weather details.

#### 4.2.2. Available Methods for Weather data for timestamp
- `timemachine(Double lat, Double lon, Integer dt)`: Retrieves historical weather data for a specific date and time (UNIX timestamp) at the given geographic location.
    - **Parameters**:
        - `lat`: The latitude of the desired location.
        - `lon`: The longitude of the desired location.
        - `dt`: The UNIX timestamp for the date and time you want to retrieve weather data for.
- `units(Unit unit)` (optional): Specifies the unit of measurement for the temperature, e.g., Metric or Imperial.
    - **Parameters**:
        - `unit`: The unit of measurement (e.g., `Unit.METRIC` or `Unit.IMPERIAL`).
- `lang(Lang lang)` (optional): Specifies the language for weather descriptions in the response.
    - **Parameters**:
        - `lang`: The desired language (e.g., `Lang.ITALIAN` or `Lang.ENGLISH`).
- `response()`: Executes the HTTP request and retrieves historical weather data for the specified date and time. Returns a `OneCallApiTimemachineDTO` object containing the historical weather data.

#### 4.2.3. Available Methods for Daily Aggregation
- `daySummary(Double lat, Double lon, Integer dt)`: Retrieves daily aggregated weather summary data for a specific date and time (UNIX timestamp) at the given geographic location.
    - **Parameters**:
        - `lat`: The latitude of the desired location.
        - `lon`: The longitude of the desired location.
        - `dt`: The UNIX timestamp for the date and time of the weather data.
- `units(Unit unit)` (optional): Specifies the unit of measurement for the temperature, e.g., Metric or Imperial.
    - **Parameters**:
        - `unit`: The unit of measurement (e.g., `Unit.METRIC` or `Unit.IMPERIAL`).
- `lang(Lang lang)` (optional): Specifies the language for weather descriptions in the response.
    - **Parameters**:
        - `lang`: The desired language (e.g., `Lang.ITALIAN` or `Lang.ENGLISH`).
- `tz(String tz)` (optional): Specifies the timezone in which the returned time will be expressed.
    - **Parameters**:
        - `tz`: The timezone (e.g., "Europe/Rome" or "America/New_York").
- `response()`: Executes the HTTP request and retrieves daily aggregated weather summary data for the specified date and time. Returns a `OneCallApiDaySummaryDTO` object containing the summary weather data.

#### 4.2.4. Available Methods for Weather overview
- `overview(Double lat, Double lon)`: Retrieves an overview of the weather for a specific geographic location using latitude and longitude.
    - **Parameters**:
        - `lat`: The latitude of the desired location.
        - `lon`: The longitude of the desired location.
- `units(Unit unit)` (optional): Specifies the unit of measurement for the temperature, e.g., Metric or Imperial.
    - **Parameters**:
        - `unit`: The unit of measurement (e.g., `Unit.METRIC` or `Unit.IMPERIAL`).
- `date(String date)` (optional): Specifies a particular date to retrieve weather overview information for.
    - **Parameters**:
        - `date`: The desired date (e.g., "2024-11-25").
- `response()`: Executes the HTTP request and retrieves a weather overview for the specified geographic location. Returns a `OneCallApiOverviewDTO` object containing the overview weather data.

#### 4.2.5. Current and forecasts weather data
Get access to current weather, minute forecast for 1 hour, hourly forecast for 48 hours, daily forecast for 8 days and government weather alerts

```java
var response = openWeatherMapClient.oneCallApi()
        .currentAndForecastsData(45.5101617, 9.0894415)
        .exclude(OneCallApiExclude.CURRENT, OneCallApiExclude.MINUTELY)
        .lang(Lang.ITALIAN)
        .units(Unit.IMPERIAL)
        .response();

System.out.println("Current temperature: " + response.getCurrent().getTemp());
```

#### 4.2.6. Weather data for timestamp
Get access to weather data for any timestamp from 1st January 1979 till 4 days ahead forecast

```java
var response = openWeatherMapClient.oneCallApi()
        .timemachine(39.099724, -94.578331, 1643803200)
        .lang(Lang.ITALIAN)
        .units(Unit.IMPERIAL)
        .response();

System.out.println("Temperature: " + response.getData().get(0).getTemp());
```

#### 4.2.7. Daily Aggregation
Get access to aggregated weather data for a particular date from 2nd January 1979 till long-term forecast for 1,5 years ahead

```java
var response = openWeatherMapClient.oneCallApi()
        .daySummary(39.099724, -94.578331, 1643803200)
        .tz("+01:00")
        .lang(Lang.ITALIAN)
        .units(Unit.IMPERIAL)
        .response();

System.out.println("Morning temperature: " + response.getTemperature().getMorning());
```

#### 4.2.8. Weather overview
Weather overview with a human-readable weather summary for today and tomorrow's forecast, utilizing OpenWeather AI technologies

```java
var response = openWeatherMapClient.oneCallApi()
        .overview(39.099724, -94.578331)
        .date("2024-11-22")
        .units(Unit.IMPERIAL)
        .response();

System.out.println("Overview: " + response.getWeatherOverview());
```

### 4.3. Current Weather
Retrieve real-time weather data for any location using coordinates, city name, city ID, or zip code.

#### 4.3.1. Available Methods for Current Weather
- `coordinates(Double lat, Double lon)`: Retrieves current weather data using geographic coordinates (latitude and longitude).
    - **Parameters**:
        - `lat`: The latitude of the desired location.
        - `lon`: The longitude of the desired location.
- `cityName(String cityName, String stateCode, String countryCode)`: Retrieves weather data for a specific city by its name. Optionally, a state code and country code can be provided for higher accuracy.
    - **Parameters**:
        - `cityName`: The name of the desired city.
        - `stateCode` (optional): The state code, useful in countries with cities sharing the same name.
        - `countryCode` (optional): The country code in ISO 3166 format (e.g., "it" for Italy, "uk" for the United Kingdom).
- `cityId(Integer cityId)`: Fetches weather data using the unique city ID. Each city in the OpenWeather database has a unique ID.
    - **Parameters**:
        - `cityId`: The unique city ID.
- `zipCode(String zipCode, String countryCode)`: Retrieves weather data using a zip code. Optionally, a country code can be provided for higher accuracy.
    - **Parameters**:
        - `zipCode`: The zip code of the location.
        - `countryCode` (optional): The country code in ISO 3166 format (e.g., "it" for Italy, "uk" for the United Kingdom).
- `units(Unit unit)` (optional): Specifies the unit of measurement for the temperature.
- `lang(Lang lang)` (optional): Specifies the language for weather descriptions.
- `response()`: Executes the HTTP request and retrieves the current weather data. Returns a `CurrentWeatherDTO` object containing weather details.

#### 4.3.2. By Coordinates
Fetch current weather data using geographic coordinates (latitude and longitude).

```java
var response = openWeatherMapClient.currentWeather()
        .coordinates(45.5101617, 9.0894415)
        .units(Unit.METRIC)
        .lang(Lang.ITALIAN)
        .response();

System.out.println("Temperature: " + response.getMain().getTemp());
System.out.println("Weather: " + response.getWeather().get(0).getDescription());
```

#### 4.3.3. By City Name
Retrieve current weather data using a city name.

```java
var response = openWeatherMapClient.currentWeather()
        .cityName("London", null, "uk")
        .response();

System.out.println("Temperature: " + response.getMain().getTemp());
System.out.println("Weather: " + response.getWeather().get(0).getDescription());
```

#### 4.3.4. By City ID
Fetch current weather data using a city ID. City IDs are unique identifiers for cities.

```java
var response = openWeatherMapClient.currentWeather()
        .cityId(2643743)
        .response();

System.out.println("Temperature: " + response.getMain().getTemp());
System.out.println("Weather: " + response.getWeather().get(0).getDescription());
```

#### 4.3.5. By Zip Code
Retrieve current weather data using a zip code.

```java
var response = openWeatherMapClient.currentWeather()
        .zipCode("20016", "it")
        .response();

System.out.println("Temperature: " + response.getMain().getTemp());
System.out.println("Weather: " + response.getWeather().get(0).getDescription());
```

### 4.4. 3-Hour 5-Day Weather Forecast
Get detailed weather forecasts in 3-hour intervals for the next 5 days.

#### 4.4.1. Available Methods for 3-Hour 5-Day Weather Forecast
- `coordinates(Double lat, Double lon)`: Fetches the weather forecast using geographic coordinates (latitude and longitude).
    - **Parameters**:
        - `lat`: The latitude of the desired location.
        - `lon`: The longitude of the desired location.
- `cityName(String cityName, String stateCode, String countryCode)`: Retrieves the weather forecast for a specific city by its name. Optionally, a state code and country code can be provided for higher accuracy.
    - **Parameters**:
        - `cityName`: The name of the desired city.
        - `stateCode` (optional): The state code, useful in countries with cities sharing the same name.
        - `countryCode` (optional): The country code in ISO 3166 format (e.g., "it" for Italy, "uk" for the United Kingdom).
- `cityId(Integer cityId)`: Fetches the weather forecast using the unique city ID. Each city in the OpenWeather database has a unique ID.
    - **Parameters**:
        - `cityId`: The unique city ID.
- `zipCode(String zipCode, String countryCode)`: Retrieves the weather forecast using a zip code. Optionally, a country code can be provided for higher accuracy.
    - **Parameters**:
        - `zipCode`: The zip code of the location.
        - `countryCode` (optional): The country code in ISO 3166 format (e.g., "it" for Italy, "uk" for the United Kingdom).
- `units(Unit unit)` (optional): Specifies the unit of measurement for the temperature.
- `lang(Lang lang)` (optional): Specifies the language for weather descriptions.
- `cnt(Integer cnt)` (optional): Limits the number of forecast entries returned.
- `response()`: Executes the HTTP request and retrieves the weather forecast data. Returns a `FiveDaysWeatherForecastDTO` object containing the forecast details.

#### 4.4.2. By Coordinates
Fetch a 5-day weather forecast using geographic coordinates.

```java
var response = openWeatherMapClient.fiveDaysWeatherForecast()
        .coordinates(45.5101617, 9.0894415)
        .cnt(4)
        .units(Unit.METRIC)
        .lang(Lang.ITALIAN)
        .response();

System.out.println("City: " + response.getCity().getName());
System.out.println("Number of forecast entries: " + response.getCnt());
```

#### 4.4.3. By City Name
Retrieve a 5-day weather forecast using a city name.

```java
var response = openWeatherMapClient.fiveDaysWeatherForecast()
        .cityName("London", null, "uk")
        .cnt(4)
        .units(Unit.METRIC)
        .response();

System.out.println("City: " + response.getCity().getName());
System.out.println("Number of forecast entries: " + response.getCnt());
```

#### 4.4.4. By City ID
Fetch a 5-day weather forecast using a city ID.

```java
var response = openWeatherMapClient.fiveDaysWeatherForecast()
        .cityId(2643743)
        .cnt(2)
        .response();

System.out.println("City: " + response.getCity().getName());
System.out.println("Number of forecast entries: " + response.getCnt());
```

#### 4.4.5. By Zip Code
Retrieve a 5-day weather forecast using a zip code.

```java
var response = openWeatherMapClient.fiveDaysWeatherForecast()
        .zipCode("20016", "it")
        .cnt(2)
        .response();

System.out.println("City: " + response.getCity().getName());
System.out.println("Number of forecast entries: " + response.getCnt());
```

### 4.5. Hourly 4-Day Weather Forecast
Get detailed weather forecasts at hourly intervals for the next 4 days.

#### 4.5.1. Available Methods for Hourly Weather Forecast
- `coordinates(Double lat, Double lon)`: Fetches the hourly weather forecast using geographic coordinates (latitude and longitude).
    - **Parameters**:
        - `lat`: The latitude of the desired location.
        - `lon`: The longitude of the desired location.
- `cityName(String cityName, String stateCode, String countryCode)`: Retrieves the hourly weather forecast for a specific city by its name. Optionally, a state code and country code can be provided for higher accuracy.
    - **Parameters**:
        - `cityName`: The name of the desired city.
        - `stateCode` (optional): The state code, useful in countries with cities sharing the same name.
        - `countryCode` (optional): The country code in ISO 3166 format (e.g., "it" for Italy, "uk" for the United Kingdom).
- `cityId(Integer cityId)`: Fetches the hourly weather forecast using the unique city ID. Each city in the OpenWeather database has a unique ID.
    - **Parameters**:
        - `cityId`: The unique city ID.
- `zipCode(String zipCode, String countryCode)`: Retrieves the hourly weather forecast using a zip code. Optionally, a country code can be provided for higher accuracy.
    - **Parameters**:
        - `zipCode`: The zip code of the location.
        - `countryCode` (optional): The country code in ISO 3166 format (e.g., "it" for Italy, "uk" for the United Kingdom).
- `units(Unit unit)` (optional): Specifies the unit of measurement for the temperature.
- `lang(Lang lang)` (optional): Specifies the language for weather descriptions.
- `response()`: Executes the HTTP request and retrieves the hourly weather forecast data. Returns a `HourlyWeatherForecastDTO` object containing the forecast details.

#### 4.5.2. By Coordinates
Fetch a 4-day hourly weather forecast using geographic coordinates.

```java
var response = openWeatherMapClient.hourlyWeatherForecast()
        .coordinates(45.5101617, 9.0894415)
        .response();

System.out.println("City: " + response.getCity().getName());
System.out.println("Number of forecast entries: " + response.getList().size());
```

#### 4.5.3. By City Name
Retrieve a 4-day hourly weather forecast using a city name.

```java
var response = openWeatherMapClient.hourlyWeatherForecast()
        .cityName("London", null, "uk")
        .response();

System.out.println("City: " + response.getCity().getName());
System.out.println("Number of forecast entries: " + response.getList().size());
```

#### 4.5.4. By City ID
Fetch a 4-day hourly weather forecast using a city ID.

```java
var response = openWeatherMapClient.hourlyWeatherForecast()
        .cityId(2643743)
        .response();

System.out.println("City: " + response.getCity().getName());
System.out.println("Number of forecast entries: " + response.getList().size());
```

#### 4.5.5. By Zip Code
Retrieve a 4-day hourly weather forecast using a zip code.

```java
var response = openWeatherMapClient.hourlyWeatherForecast()
        .zipCode("20016", "it")
        .response();

System.out.println("City: " + response.getCity().getName());
System.out.println("Number of forecast entries: " + response.getList().size());
```

### 4.6. Daily 16-Day Weather Forecast
Get detailed weather forecasts at daily intervals for the next 16 days.

#### 4.6.1. Available Methods for Daily 16-Day Weather Forecast
- `coordinates(Double lat, Double lon)`: Fetches the daily weather forecast using geographic coordinates (latitude and longitude).
    - **Parameters**:
        - `lat`: The latitude of the desired location.
        - `lon`: The longitude of the desired location.
- `cityName(String cityName, String stateCode, String countryCode)`: Retrieves the daily weather forecast for a specific city by its name. Optionally, a state code and country code can be provided for higher accuracy.
    - **Parameters**:
        - `cityName`: The name of the desired city.
        - `stateCode` (optional): The state code, useful in countries with cities sharing the same name.
        - `countryCode` (optional): The country code in ISO 3166 format (e.g., "it" for Italy, "uk" for the United Kingdom).
- `cityId(Integer cityId)`: Fetches the daily weather forecast using the unique city ID. Each city in the OpenWeather database has a unique ID.
    - **Parameters**:
        - `cityId`: The unique city ID.
- `zipCode(String zipCode, String countryCode)`: Retrieves the daily weather forecast using a zip code. Optionally, a country code can be provided for higher accuracy.
    - **Parameters**:
        - `zipCode`: The zip code of the location.
        - `countryCode` (optional): The country code in ISO 3166 format (e.g., "it" for Italy, "uk" for the United Kingdom).
- `units(Unit unit)` (optional): Specifies the unit of measurement for the temperature.
- `lang(Lang lang)` (optional): Specifies the language for weather descriptions.
- `cnt(Integer cnt)` (optional): Limits the number of forecast entries returned.
- `response()`: Executes the HTTP request and retrieves the daily weather forecast data. Returns a `DailyWeatherForecastDTO` object containing the forecast details.

#### 4.6.2. By Coordinates
Fetch a 16-day weather forecast using geographic coordinates.

```java
var response = openWeatherMapClient.dailyWeatherForecast()
        .coordinates(45.5101617, 9.0894415)
        .cnt(4)
        .units(Unit.METRIC)
        .lang(Lang.ITALIAN)
        .response();

System.out.println("City: " + response.getCity().getName());
System.out.println("Number of forecast entries: " + response.getCnt());
```

#### 4.6.3. By City Name
Retrieve a 16-day weather forecast using a city name.

```java
var response = openWeatherMapClient.dailyWeatherForecast()
        .cityName("London", null, "uk")
        .cnt(4)
        .units(Unit.METRIC)
        .response();

System.out.println("City: " + response.getCity().getName());
System.out.println("Number of forecast entries: " + response.getCnt());
```

#### 4.6.4. By City ID
Fetch a 16-day weather forecast using a city ID.

```java
var response = openWeatherMapClient.dailyWeatherForecast()
        .cityId(2643743)
        .cnt(2)
        .response();

System.out.println("City: " + response.getCity().getName());
System.out.println("Number of forecast entries: " + response.getCnt());
```

#### 4.6.5. By Zip Code
Retrieve a 16-day weather forecast using a zip code.

```java
var response = openWeatherMapClient.dailyWeatherForecast()
        .zipCode("20016", "it")
        .cnt(2)
        .response();

System.out.println("City: " + response.getCity().getName());
System.out.println("Number of forecast entries: " + response.getCnt());
```

### 4.7. Climatic 30-Day Weather Forecast
Get detailed climatic forecasts, providing long-term weather predictions.

#### 4.7.1. Available Methods for Climatic Weather Forecast
- `coordinates(Double lat, Double lon)`: Fetches the climatic weather forecast using geographic coordinates (latitude and longitude).
    - **Parameters**:
        - `lat`: The latitude of the desired location.
        - `lon`: The longitude of the desired location.
- `cityName(String cityName, String stateCode, String countryCode)`: Retrieves the climatic weather forecast for a specific city by its name. Optionally, a state code and country code can be provided for higher accuracy.
    - **Parameters**:
        - `cityName`: The name of the desired city.
        - `stateCode` (optional): The state code, useful in countries with cities sharing the same name.
        - `countryCode` (optional): The country code in ISO 3166 format (e.g., "it" for Italy, "uk" for the United Kingdom).
- `cityId(Integer cityId)`: Fetches the climatic weather forecast using the unique city ID. Each city in the OpenWeather database has a unique ID.
    - **Parameters**:
        - `cityId`: The unique city ID.
- `zipCode(String zipCode, String countryCode)`: Retrieves the climatic weather forecast using a zip code. Optionally, a country code can be provided for higher accuracy.
    - **Parameters**:
        - `zipCode`: The zip code of the location.
        - `countryCode` (optional): The country code in ISO 3166 format (e.g., "it" for Italy, "uk" for the United Kingdom).
- `units(Unit unit)` (optional): Specifies the unit of measurement for the temperature.
- `lang(Lang lang)` (optional): Specifies the language for weather descriptions.
- `response()`: Executes the HTTP request and retrieves the climatic weather forecast data. Returns a `ClimaticWeatherForecastDTO` object containing the forecast details.

#### 4.7.2. By Coordinates
Fetch a climatic weather forecast using geographic coordinates.

```java
var response = openWeatherMapClient.climaticWeatherForecast()
        .coordinates(45.5101617, 9.0894415)
        .response();

System.out.println("City: " + response.getCity().getName());
```

#### 4.7.3. By City Name
Retrieve a climatic weather forecast using a city name.

```java
var response = openWeatherMapClient.climaticWeatherForecast()
        .cityName("London", null, "uk")
        .response();

System.out.println("City: " + response.getCity().getName());
```

#### 4.7.4. By City ID
Fetch a climatic weather forecast using a city ID.

```java
var response = openWeatherMapClient.climaticWeatherForecast()
        .cityId(2643743)
        .response();

System.out.println("City: " + response.getCity().getName());
```

#### 4.7.5. By Zip Code
Retrieve a climatic weather forecast using a zip code.

```java
var response = openWeatherMapClient.climaticWeatherForecast()
        .zipCode("20016", "it")
        .response();

System.out.println("City: " + response.getCity().getName());
```

### 4.8. Air Pollution
Obtain air quality data, including pollutant levels.

#### 4.8.1. Available Methods for Current Air Pollution
- `current()`: Initiates a request for current air pollution data.
- `coordinates(Double lat, Double lon)`: Sets the geographic coordinates (latitude and longitude) for the request.
    - **Parameters**:
        - `lat`: The latitude of the desired location.
        - `lon`: The longitude of the desired location.
- `response()`: Executes the HTTP request and retrieves the current air pollution data. Returns an `AirPollutionDTO` object containing air quality information.

#### 4.8.2. Available Methods for Forecast Air Pollution
- `forecast()`: Initiates a request for forecasted air pollution data.
- `coordinates(Double lat, Double lon)`: Sets the geographic coordinates (latitude and longitude) for the forecast request.
    - **Parameters**:
        - `lat`: The latitude of the desired location.
        - `lon`: The longitude of the desired location.
- `response()`: Executes the HTTP request and retrieves the forecast air pollution data. Returns an `AirPollutionDTO` object containing predicted air quality information.

#### 4.8.3. Available Methods for Historical Air Pollution
- `historical()`: Initiates a request for historical air pollution data.
- `coordinatesAndTime(Double lat, Double lon, Integer start, Integer end)`: Sets the geographic coordinates and time range (in UNIX timestamps) for the historical data request.
    - **Parameters**:
        - `lat`: The latitude of the desired location.
        - `lon`: The longitude of the desired location.
        - `start`: The start time in UNIX timestamp format.
        - `end`: The end time in UNIX timestamp format.
- `response()`: Executes the HTTP request and retrieves the historical air pollution data. Returns an `AirPollutionDTO` object containing air quality information for the given time range.

#### 4.8.4. Current Air Pollution
Fetch current air pollution data using coordinates.

```java
var response = openWeatherMapClient.airPollution()
        .current()
        .coordinates(45.5101617, 9.0894415)
        .response();

System.out.println("Air Quality Index: " + response.getList().get(0).getMain().getAqi());
```

#### 4.8.5. Forecast Air Pollution
Get forecasted air pollution data using coordinates.

```java
var response = openWeatherMapClient.airPollution()
        .forecast()
        .coordinates(45.5101617, 9.0894415)
        .response();

System.out.println("Air Quality Index: " + response.getList().get(0).getMain().getAqi());
```

#### 4.8.6. Historical Air Pollution
Retrieve historical air pollution data using coordinates and a time range.

```java
var response = openWeatherMapClient.airPollution()
        .historical()
        .coordinatesAndTime(45.5101617, 9.0894415, 1606223802, 1606482999)
        .response();

System.out.println("Air Quality Index: " + response.getList().get(0).getMain().getAqi());
```

### 4.9. Geocoding
Convert location names or zip codes into precise geographic data.

#### 4.9.1. Available Methods for Geocoding
- **By Location Name**
    - `locationName(String cityName, String stateCode, String countryCode)`: Converts a location name to geographic coordinates. Optionally, you can specify a state code and a country code for more accurate results.
        - **Parameters**:
            - `cityName`: The name of the city or location.
            - `stateCode` (optional): The state code for locations with common city names.
            - `countryCode` (optional): The country code in ISO 3166 format (e.g., "it" for Italy, "us" for the United States).
    - `limit(Integer limit)` (optional): Limits the number of results returned.
    - `response()`: Returns a list of `GeocodingLocationDTO` objects containing details like geographic coordinates and location names.
- **By Zip Code**
    - `zipCode(String zipCode, String countryCode)`: Converts a zip code to geographic coordinates. Optionally, a country code can be provided.
        - **Parameters**:
            - `zipCode`: The zip code for the location.
            - `countryCode` (optional): The country code in ISO 3166 format (e.g., "it" for Italy, "us" for the United States).
    - `response()`: Returns a `GeocodingZipDTO` object containing details such as geographic coordinates and location names.

#### 4.9.2. By Location Name
Convert a location name to geographic coordinates and other details.

```java
var response = openWeatherMapClient.geocoding()
        .locationName("London", "England", "GB")
        .response();

var dto = response.get(0);
System.out.println("City: " + dto.getName());
System.out.println("Country: " + dto.getCountry());
```

#### 4.9.3. By Zip Code
Convert a zip code to geographic coordinates and other details.

```java
var response = openWeatherMapClient.geocoding()
        .zipCode("E14", "GB")
        .response();

System.out.println("City: " + response.getName());
System.out.println("Country: " + response.getCountry());
```

### 4.10. Basic Weather Maps
Access various types of basic weather maps, including precipitation, clouds, pressure, temperature, and wind.

#### 4.10.1. Available Methods for Basic Weather Maps
- `layerAndCoords(BasicMapLayer layer, Integer x, Integer y, Integer z)`: Prepares a request for a specific weather map layer using tile coordinates (x, y) and zoom level (z).
    - **Parameters**:
        - `layer`: The type of weather map layer to retrieve (e.g., precipitation, temperature).
        - `x`: The x-coordinate of the tile.
        - `y`: The y-coordinate of the tile.
        - `z`: The zoom level for the map.
- `response()`: Returns the map image as a byte array for rendering or saving.

#### 4.10.2. Get Map Layer
Retrieve a specific weather map layer for given coordinates and zoom level.

```java
var response = openWeatherMapClient.basicWeatherMap()
        .layerAndCoords(BasicMapLayer.PRECIPITATION, 0, 0, 0)
        .response();
```

### 4.11. Advanced Weather Maps
Access a variety of advanced weather maps, including forecast, historical, and current weather visualizations with customizable options.

#### 4.11.1. Available Methods for Advanced Weather Maps
- `layerAndCoords(AdvancedMapLayer layer, Integer x, Integer y, Integer z)`: Prepares a request for a specific advanced weather map layer using tile coordinates (x, y) and zoom level (z).
    - **Parameters**:
        - `layer`: The type of advanced weather map layer to retrieve (e.g., wind, temperature).
        - `x`: The x-coordinate of the tile.
        - `y`: The y-coordinate of the tile.
        - `z`: The zoom level for the map.
- `date(Integer date)` (optional): Specifies the date for historical data retrieval.
- `opacity(Double opacity)` (optional): Sets the opacity level for the map layer.
- `palette(String palette)` (optional): Chooses a color palette for the map visualization.
- `fillBound(boolean fillBound)` (optional): Determines whether to fill the boundaries in the map.
- `arrowStep(Integer arrowStep)` (optional): Sets the step for arrow representation on wind maps.
- `useNorm(boolean useNorm)` (optional): Specifies whether to use normalized values for the visualization.
- `response()`: Returns the map image as a byte array for rendering or saving.

#### 4.11.2. Get Map Layer
Retrieve a specific advanced weather map layer for given coordinates and zoom level, with additional options for customization.

```java
var response = openWeatherMapClient.advancedWeatherMap()
        .layerAndCoords(AdvancedMapLayer.AIR_TEMPERATURE, 0, 0, 0)
        .date(1552861800)
        .opacity(0.6)
        .palette("0:FF8800;10:88FF88;20:0088FF")
        .fillBound(true)
        .response();
```