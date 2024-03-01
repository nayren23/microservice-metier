package com.example.microservicemetier1.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public class AnnonceService {

    private RestTemplate restTemplate;
    private String url;

    public AnnonceService() {
        this.restTemplate = new RestTemplate();
        this.url = "http://localhost:8080/";;
    }

    public List<Map<String, Objects>> getAllAnnonces() {
        List<Map<String, Objects>> announces = this.restTemplate.getForObject(this.url + "annonce/display", List.class);
        return announces;
    }
}