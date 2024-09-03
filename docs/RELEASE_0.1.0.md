# Release 0.1.0

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Usage](#usage)
  - [Current Weather](#current-weather)
  - [5-Day Weather Forecast](#5-day-weather-forecast)
  - [Air Pollution](#air-pollution)
  - [Geocoding](#geocoding)

## Overview

The `0.1.0` release introduces the initial version of the Java OpenWeatherMap Client library. This release provides a robust foundation for interacting with the OpenWeatherMap API, offering the following core features: **Current Weather**, **3-hour Forecast (5 days)**, **Air Pollution API**, **Geocoding API**.

## Features

- **Current Weather**
- **3-hour Forecast (5 days)**
- **Air Pollution API**
- **Geocoding API**

## Usage

### Current Weather

Retrieve real-time weather data for any location using coordinates, city name, city ID, or zip code.

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

### 5-Day Weather Forecast

Get detailed weather forecasts in 3-hour intervals for the next 5 days.

#### By Coordinates

Fetch a 5-day weather forecast using geographic coordinates.

```java
var response = openWeatherMapClient.fiveDayWeatherForecast()
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
var response = openWeatherMapClient.fiveDayWeatherForecast()
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
var response = openWeatherMapClient.fiveDayWeatherForecast()
        .cityId(2643743)
        .cnt(2)
        .response();

System.out.println("City: " + response.getCity().getName());
System.out.println("Number of forecast entries: " + response.getCnt());
```

#### By Zip Code

Retrieve a 5-day weather forecast using a zip code.

```java
var response = openWeatherMapClient.fiveDayWeatherForecast()
        .zipCode("20016", "it")
        .cnt(2)
        .response();

System.out.println("City: " + response.getCity().getName());
System.out.println("Number of forecast entries: " + response.getCnt());
```

### Air Pollution

Obtain air quality data, including pollutant levels.

#### Current Air Pollution

Fetch current air pollution data using coordinates.

```java
var response = openWeatherMapClient.currentAirPollution()
        .coordinates(45.5101617, 9.0894415)
        .response();

System.out.println("Air Quality Index: " + response.getList().get(0).getMain().getAqi());
```

#### Forecast Air Pollution

Get forecasted air pollution data using coordinates.

```java
var response = openWeatherMapClient.forecastAirPollution()
        .coordinates(45.5101617, 9.0894415)
        .response();

System.out.println("Air Quality Index: " + response.getList().get(0).getMain().getAqi());
```

#### Historical Air Pollution

Retrieve historical air pollution data using coordinates and a time range.

```java
var response = openWeatherMapClient.historicalAirPollution()
        .coordinatesAndTime(45.5101617, 9.0894415, 1606223802, 1606482999)
        .response();

System.out.println("Air Quality Index: " + response.getList().get(0).getMain().getAqi());
```

### Geocoding

Convert location names or zip codes into precise geographic data.

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