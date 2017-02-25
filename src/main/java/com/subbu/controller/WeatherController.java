package com.subbu.controller;

/**
 * Created by subbu on 2/19/17.
 */
import net.aksingh.owmjapis.CurrentWeather;
import net.aksingh.owmjapis.OpenWeatherMap;
import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@RestController
public class WeatherController {

    private static final Logger log = LoggerFactory.getLogger(WeatherController.class);
    //private String weatherAPIurl="http://api.openweathermap.org/data/2.5/weather";

    @RequestMapping("/weather/current")
    public CurrentWeather  getCurrentWeather(@RequestParam(value="city", defaultValue="New York") String city, @RequestParam(value="country", defaultValue="US") String country)  throws IOException, JSONException{
        OpenWeatherMap owm = new OpenWeatherMap("cd0906689c9eb04fd3c3c89011a1336b");
        log.info("Pulling Weather details for ::" + city + "::" +  country);
        CurrentWeather cwd = owm.currentWeatherByCityName(city, country);
        log.info(cwd.toString());
        return cwd;
        //weatherAPIurl = weatherAPIurl   + "?" + zipCode + "&APPID=f4c59548b7a1d5a143493ebb39a5596b";
        //return restTemplate.getForObject(weatherAPIurl , String.class);
    }
}
