# Changelog

All significant changes to this project will be documented in this file.

## [0.6.0] - 2024-12-08

### Added
- **Bulk Download**: Get current weather, weather forecasts and their 7-day archives in JSON or CSV format.
- **Road Risk API**: Provides weather data and national alerts at the point of destination and along a route.
- **Global Precipitation maps**: Get current and historical global precipitation weather maps.

### Changed
- All DTOs now include properly implemented `equals()` and `hashCode()` methods.
- Reorganized the `dto` package into separate sub-packages for **request** and **response** types to improve structure and maintainability.
- When an `OpenWeatherMapException` is thrown for 4xx errors, the entire response body is now included in the exception message for better debugging and clarity.
- Renamed the services for making requests in `HttpRequestExecutor` to improve clarity and consistency.

## [0.5.0] - 2024-11-24

### Added
- **One Call API 3.0**: Get essential weather data, short-term and long-term forecasts and aggregated weather data.

## [0.4.0] - 2024-10-29

### Added
- **Basic weather maps**: Provides many kinds of weather maps including Precipitation, Clouds, Pressure, Temperature, Wind.
- **Advanced weather maps**: Forecast, Historical and Current weather maps. 15 weather map layers.
- **Error handling**: Implemented a method to manage HTTP request errors, providing clearer feedback on API response issues.

### Fixed
- Corrected the structure of `ClimaticWeatherForecastDTO` to resolve deserialization errors.

### Dependencies Updated
- Updated `io.github.mbenincasa:java-rest-client` from **0.3.1** to **0.3.3**
- Updated `org.junit.jupiter:junit-jupiter` from **5.10.3** to **5.11.3**
- Updated `org.junit.platform:junit-platform-suite-engine` from **1.10.3** to **1.11.3**

## [0.3.0] - 2024-10-18

### Added
- **Hourly Forecast (4 days)**: Access detailed weather forecasts at hourly intervals for the next 4 days
- **Climatic Forecast (30 days)**: Access climatic forecasts at daily intervals for the next 30 days.

### Changed
- **Air Pollution API**: Refactored methods for accessing air quality data. Methods have been renamed and organized.

## [0.2.0] - 2024-09-18

### Added
- **Daily Forecast (16 days)**: Access detailed weather forecasts at daily intervals for the next 16 days.

### Changed
- **3-hour Forecast (5 days)**: Renamed methods and classes.

### Removed
- Unnecessary setters within DTOs have been removed.

## [0.1.0] - 2024-09-03

### Added
- Initial implementation of the Java OpenWeatherMap Client library.
- **Current Weather**: Retrieve real-time weather data for any location.
- **3-hour Forecast (5 days)**: Access detailed weather forecasts in 3-hour intervals for the next 5 days.
- **Air Pollution API**: Obtain air quality data, including pollutant levels, for specific locations.
- **Geocoding API**: Convert city names or geographic coordinates into accurate location data.

### Dependencies Added
- **io.github.mbenincasa:java-rest-client:jar:0.3.1** - REST client library.
- **org.junit.jupiter:junit-jupiter:5.10.3** - JUnit Jupiter for unit testing.
- **org.junit.platform:junit-platform-suite-engine:1.10.3** - JUnit Platform Suite Engine for organizing tests.