# Changelog

All significant changes to this project will be documented in this file.

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