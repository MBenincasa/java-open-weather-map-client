# Release 0.3.0

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [OpenWeatherMapClient](#openweathermapclient)
- [Usage](#usage)
    - [Setting Up the Client](#setting-up-the-client)
    - [Current Weather](#current-weather)
    - [3-Hour 5-Day Weather Forecast](#3-hour-5-day-weather-forecast)
    - [Hourly 4-Day Forecast](#hourly-4-day-weather-forecast)
    - [Daily 16-Day Weather Forecast](#daily-16-day-weather-forecast)
    - [Climatic 30-Day Weather Forecast](#climatic-30-day-weather-forecast)
    - [Air Pollution](#air-pollution)
    - [Geocoding](#geocoding)

## Overview
Version `0.3.0` add the **Hourly Forecast (4 days)** and the **Climatic Forecast (30 days)** services. Refactored methods for accessing air quality data.

## Features
- **Current Weather**
- **3-hour Forecast (5 days)**
- **Hourly Forecast (4 days)**
- **Daily Forecast (16 days)**
- **Climatic Forecast (30 days)**
- **Air Pollution API**
- **Geocoding API**

## OpenWeatherMapClient
The `OpenWeatherMapClient` interface provides methods to access various weather-related services through the OpenWeatherMap API. Each method returns a request builder for different types of data, such as current weather, forecasts, air pollution, and geocoding.

### Methods
- **`currentWeather()`**: Returns an instance of `CurrentWeatherRequest` for retrieving real-time weather data for any location.
- **`fiveDaysWeatherForecast()`**: Returns an instance of `FiveDaysWeatherForecastRequest` for getting 3-hourly weather forecasts for the next 5 days.
- **`dailyWeatherForecast()`**: Returns an instance of `DailyWeatherForecastRequest` for retrieving daily weather forecasts for up to 16 days.
- **`hourlyWeatherForecast()`**: Returns an instance of `HourlyWeatherForecastRequest` for obtaining hourly weather forecasts.
- **`climaticWeatherForecast()`**: Returns an instance of `ClimaticWeatherForecastRequest` for accessing broader climatic forecasts.
- **`airPollution()`**: Returns an instance of `AirPollutionRequest` for obtaining current air quality data.
- **`geocoding()`**: Returns an instance of `GeocodingRequest` for converting location names or zip codes into geographic coordinates.

## Usage
This section will guide you on how to use the `OpenWeatherMapClient` to access various services provided by the API. We will cover how to retrieve current weather, forecasts, air pollution data, and geocoding using coordinates, city names, and postal codes

### Setting Up the Client
First, create an instance of `OpenWeatherMapClient` by passing your API key:

```java
var apiKey = "YOUR_API_KEY";
OpenWeatherMapClient openWeatherMapClient = new DefaultOpenWeatherMapClient(apiKey);
```

### Current Weather
Retrieve real-time weather data for any location using coordinates, city name, city ID, or zip code.

#### Available Methods for Current Weather
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

#### By Coordinates
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

#### By City Name
Retrieve current weather data using a city name.

```java
var response = openWeatherMapClient.currentWeather()
        .cityName("London", null, "uk")
        .response();

System.out.println("Temperature: " + response.getMain().getTemp());
System.out.println("Weather: " + response.getWeather().get(0).getDescription());
```

#### By City ID
Fetch current weather data using a city ID. City IDs are unique identifiers for cities.

```java
var response = openWeatherMapClient.currentWeather()
        .cityId(2643743)
        .response();

System.out.println("Temperature: " + response.getMain().getTemp());
System.out.println("Weather: " + response.getWeather().get(0).getDescription());
```

#### By Zip Code
Retrieve current weather data using a zip code.

```java
var response = openWeatherMapClient.currentWeather()
        .zipCode("20016", "it")
        .response();

System.out.println("Temperature: " + response.getMain().getTemp());
System.out.println("Weather: " + response.getWeather().get(0).getDescription());
```

### 3-Hour 5-Day Weather Forecast
Get detailed weather forecasts in 3-hour intervals for the next 5 days.

#### Available Methods for 3-Hour 5-Day Weather Forecast
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

#### By Coordinates
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

#### By City Name
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

#### By City ID
Fetch a 5-day weather forecast using a city ID.

```java
var response = openWeatherMapClient.fiveDaysWeatherForecast()
        .cityId(2643743)
        .cnt(2)
        .response();

System.out.println("City: " + response.getCity().getName());
System.out.println("Number of forecast entries: " + response.getCnt());
```

#### By Zip Code
Retrieve a 5-day weather forecast using a zip code.

```java
var response = openWeatherMapClient.fiveDaysWeatherForecast()
        .zipCode("20016", "it")
        .cnt(2)
        .response();

System.out.println("City: " + response.getCity().getName());
System.out.println("Number of forecast entries: " + response.getCnt());
```

### Hourly 4-Day Weather Forecast
Get detailed weather forecasts at hourly intervals for the next 4 days.

#### Available Methods for Hourly Weather Forecast
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

#### By Coordinates
Fetch a 4-day hourly weather forecast using geographic coordinates.

```java
var response = openWeatherMapClient.hourlyWeatherForecast()
        .coordinates(45.5101617, 9.0894415)
        .response();

System.out.println("City: " + response.getCity().getName());
System.out.println("Number of forecast entries: " + response.getList().size());
```

#### By City Name
Retrieve a 4-day hourly weather forecast using a city name.

```java
var response = openWeatherMapClient.hourlyWeatherForecast()
        .cityName("London", null, "uk")
        .response();

System.out.println("City: " + response.getCity().getName());
System.out.println("Number of forecast entries: " + response.getList().size());
```

#### By City ID
Fetch a 4-day hourly weather forecast using a city ID.

```java
var response = openWeatherMapClient.hourlyWeatherForecast()
        .cityId(2643743)
        .response();

System.out.println("City: " + response.getCity().getName());
System.out.println("Number of forecast entries: " + response.getList().size());
```

#### By Zip Code
Retrieve a 4-day hourly weather forecast using a zip code.

```java
var response = openWeatherMapClient.hourlyWeatherForecast()
        .zipCode("20016", "it")
        .response();

System.out.println("City: " + response.getCity().getName());
System.out.println("Number of forecast entries: " + response.getList().size());
```

### Daily 16-Day Weather Forecast
Get detailed weather forecasts at daily intervals for the next 16 days.

#### Available Methods for Daily 16-Day Weather Forecast
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

#### By Coordinates
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

#### By City Name
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

#### By City ID
Fetch a 16-day weather forecast using a city ID.

```java
var response = openWeatherMapClient.dailyWeatherForecast()
        .cityId(2643743)
        .cnt(2)
        .response();

System.out.println("City: " + response.getCity().getName());
System.out.println("Number of forecast entries: " + response.getCnt());
```

#### By Zip Code
Retrieve a 16-day weather forecast using a zip code.

```java
var response = openWeatherMapClient.dailyWeatherForecast()
        .zipCode("20016", "it")
        .cnt(2)
        .response();

System.out.println("City: " + response.getCity().getName());
System.out.println("Number of forecast entries: " + response.getCnt());
```

### Climatic 30-Day Weather Forecast
Get detailed climatic forecasts, providing long-term weather predictions.

#### Available Methods for Climatic Weather Forecast
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

#### By Coordinates
Fetch a climatic weather forecast using geographic coordinates.

```java
var response = openWeatherMapClient.climaticWeatherForecast()
        .coordinates(45.5101617, 9.0894415)
        .response();

System.out.println("City: " + response.getCity().getName());
```

#### By City Name
Retrieve a climatic weather forecast using a city name.

```java
var response = openWeatherMapClient.climaticWeatherForecast()
        .cityName("London", null, "uk")
        .response();

System.out.println("City: " + response.getCity().getName());
```

#### By City ID
Fetch a climatic weather forecast using a city ID.

```java
var response = openWeatherMapClient.climaticWeatherForecast()
        .cityId(2643743)
        .response();

System.out.println("City: " + response.getCity().getName());
```

#### By Zip Code
Retrieve a climatic weather forecast using a zip code.

```java
var response = openWeatherMapClient.climaticWeatherForecast()
        .zipCode("20016", "it")
        .response();

System.out.println("City: " + response.getCity().getName());
```

### Air Pollution
Obtain air quality data, including pollutant levels.

#### Available Methods for Current Air Pollution
- `current()`: Initiates a request for current air pollution data.
- `coordinates(Double lat, Double lon)`: Sets the geographic coordinates (latitude and longitude) for the request.
    - **Parameters**:
        - `lat`: The latitude of the desired location.
        - `lon`: The longitude of the desired location.
- `response()`: Executes the HTTP request and retrieves the current air pollution data. Returns an `AirPollutionDTO` object containing air quality information.

#### Available Methods for Forecast Air Pollution
- `forecast()`: Initiates a request for forecasted air pollution data.
- `coordinates(Double lat, Double lon)`: Sets the geographic coordinates (latitude and longitude) for the forecast request.
    - **Parameters**:
        - `lat`: The latitude of the desired location.
        - `lon`: The longitude of the desired location.
- `response()`: Executes the HTTP request and retrieves the forecast air pollution data. Returns an `AirPollutionDTO` object containing predicted air quality information.

#### Available Methods for Historical Air Pollution
- `historical()`: Initiates a request for historical air pollution data.
- `coordinatesAndTime(Double lat, Double lon, Integer start, Integer end)`: Sets the geographic coordinates and time range (in UNIX timestamps) for the historical data request.
    - **Parameters**:
        - `lat`: The latitude of the desired location.
        - `lon`: The longitude of the desired location.
        - `start`: The start time in UNIX timestamp format.
        - `end`: The end time in UNIX timestamp format.
- `response()`: Executes the HTTP request and retrieves the historical air pollution data. Returns an `AirPollutionDTO` object containing air quality information for the given time range.

#### Current Air Pollution
Fetch current air pollution data using coordinates.

```java
var response = openWeatherMapClient.airPollution()
        .current()
        .coordinates(45.5101617, 9.0894415)
        .response();

System.out.println("Air Quality Index: " + response.getList().get(0).getMain().getAqi());
```

#### Forecast Air Pollution
Get forecasted air pollution data using coordinates.

```java
var response = openWeatherMapClient.airPollution()
        .forecast()
        .coordinates(45.5101617, 9.0894415)
        .response();

System.out.println("Air Quality Index: " + response.getList().get(0).getMain().getAqi());
```

#### Historical Air Pollution
Retrieve historical air pollution data using coordinates and a time range.

```java
var response = openWeatherMapClient.airPollution()
        .historical()
        .coordinatesAndTime(45.5101617, 9.0894415, 1606223802, 1606482999)
        .response();

System.out.println("Air Quality Index: " + response.getList().get(0).getMain().getAqi());
```

### Geocoding
Convert location names or zip codes into precise geographic data.

#### Available Methods for Geocoding
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

#### By Location Name
Convert a location name to geographic coordinates and other details.

```java
var response = openWeatherMapClient.geocoding()
        .locationName("London", "England", "GB")
        .response();

var dto = response.get(0);
System.out.println("City: " + dto.getName());
System.out.println("Country: " + dto.getCountry());
```

#### By Zip Code
Convert a zip code to geographic coordinates and other details.

```java
var response = openWeatherMapClient.geocoding()
        .zipCode("E14", "GB")
        .response();

System.out.println("City: " + response.getName());
System.out.println("Country: " + response.getCountry());
```