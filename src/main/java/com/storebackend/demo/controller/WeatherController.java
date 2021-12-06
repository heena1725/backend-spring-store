package com.storebackend.demo.controller;

import com.storebackend.demo.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin()
@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather/{city}")
    public String getWeather(@PathVariable String city){
        return weatherService.getWeatherByCity(city);
    }
}
