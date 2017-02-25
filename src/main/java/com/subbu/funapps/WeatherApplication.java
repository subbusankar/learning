package com.subbu.funapps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.subbu.controller"})
public class WeatherApplication {

	public static void main(String[] args) {

		SpringApplication.run(WeatherApplication.class, args);
	}
}
