[![Maven Central](https://img.shields.io/maven-central/v/io.github.mbenincasa/java-open-weather-map-client.svg?label=Maven%20Central)](https://central.sonatype.com/search?namespace=io.github.mbenincasa&name=java-open-weather-map-client)
[![GitHub release](https://img.shields.io/github/release/MBenincasa/java-open-weather-map-client)](https://github.com/MBenincasa/java-open-weather-map-client/releases/)
[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)
![workflow](https://github.com/MBenincasa/java-open-weather-map-client/actions/workflows/maven-publish.yml/badge.svg)<p>
[![Donate](https://img.shields.io/badge/Donate-PayPal-green.svg)](https://www.paypal.com/donate/?hosted_button_id=WXYAJVFZD82BJ)

# Java OpenWeatherMap Client
The OpenWeatherMap Java Client Library is a robust and easy-to-use Java library for integrating weather data from the OpenWeatherMap API into your Java applications. This library simplifies the process of fetching current weather data, forecasts, historical data, and various other weather-related information directly from the OpenWeatherMap service.

## Table of Contents
- [Features](#features)
- [Minimum Requirements](#minimum-requirements)
- [Dependencies](#dependencies)
- [Maven Dependency](#maven-dependency)
- [Documentation](#documentation)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)
- [Donations](#donations)

## Features
- **One Call API 3.0**
  - Current and forecasts weather data
  - Weather data for timestamp
  - Daily Aggregation
  - Weather overview
- **Current & Forecast weather data collection**
  - Current Weather
  - 3-hour Forecast 5 days
  - Hourly Forecast 4 days
  - Daily Forecast 16 days
  - Climatic Forecast 30 days
  - Bulk Download
  - Road Risk API
- **Maps collection**
  - Basic weather maps
  - Advanced weather maps
  - Historical maps
  - Global Precipitation maps
- **Other weather API's collection**
  - Air Pollution API
  - Geocoding API

## Minimum Requirements
Java 17 or above.

## Dependencies
- io.github.mbenincasa:java-rest-client:jar:0.3.3
- org.junit.jupiter:junit-jupiter:jar:5.11.3
- org.junit.platform:junit-platform-suite-engine:jar:1.11.3

## Maven Dependency
The library is available on **GitHub Packages**, and on **Maven Central** starting from version `0.6.0`.
To include this library in your Maven project, add the following dependency to your `pom.xml`:

```xml
<dependency>
  <groupId>io.github.mbenincasa</groupId>
  <artifactId>java-open-weather-map-client</artifactId>
  <version>0.6.0</version>
</dependency>
```

If you want to use **GitHub Packages**, you need to add the GitHub Packages repository to your `pom.xml` or `settings.xml` and authenticate using your GitHub token.

### Add GitHub Packages Repository
In your `pom.xml`, add the following repository configuration:

```xml
<repositories>
    <repository>
        <id>github</id>
        <url>https://maven.pkg.github.com/MBenincasa/java-open-weather-map-client</url>
    </repository>
</repositories>
```

### Add Authentication for GitHub Packages
In your `settings.xml` (located in the `.m2` directory), add the following server configuration to authenticate with GitHub Packages:

```xml
<servers>
    <server>
        <id>github</id>
        <username>your-github-username</username>
        <password>your-github-token</password>
    </server>
</servers>
```

Replace `your-github-username` with your GitHub username and `your-github-token` with a GitHub Personal Access Token (PAT) that has the necessary permissions.

## Documentation
You can find the documentation for each release in the [docs folder](https://github.com/MBenincasa/java-open-weather-map-client/tree/master/docs)

## Contributing
We welcome contributions from the community to improve this library. If you encounter any bugs, have feature requests, or want to contribute code, please open an issue or submit a pull request on GitHub.

## License
Distributed under the GNU General Public License v3.0. See `LICENSE` for more information.

## Contact
Mirko Benincasa - mirkobenincasa44@gmail.com

## Donations
Another way to support and contribute to the project is by sending a donation. The project will always be free and open source.<br>
Click [here](https://www.paypal.com/donate/?hosted_button_id=WXYAJVFZD82BJ) to make a donation on PayPal
