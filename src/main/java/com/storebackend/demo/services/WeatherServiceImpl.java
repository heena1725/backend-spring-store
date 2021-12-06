package com.storebackend.demo.services;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherServiceImpl implements WeatherService{
    private final RestTemplate restTemplate;

    public WeatherServiceImpl(RestTemplateBuilder restTemplateBuilder){
        restTemplate = restTemplateBuilder.build();
    }

    @Override
    public String getWeatherByCity(String city) {
        String url = "https://api.openweathermap.org/data/2.5/weather?";
        String cityParam = "q=" + city;
        String appIdParam = "&&appid=bce900cc4be211af14d020c0dc7b0e32";
        return restTemplate.getForObject(url + cityParam + appIdParam, String.class);
    }
}
