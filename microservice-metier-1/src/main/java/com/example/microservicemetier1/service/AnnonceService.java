package com.example.microservicemetier1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class AnnonceService {

    @Autowired
    private WebClient.Builder webClientBuilder;

    private String url;

    public AnnonceService() {
        this.webClientBuilder = WebClient.builder();
        this.url = "http://localhost:8080/";;
    }

    public String getAllAnnonces() {

        String announces = webClientBuilder.build()
                .get()
                .uri(this.url+"annonce/display")
                .retrieve()
                .bodyToMono(String.class)
                .block();
        return announces;
    }



}
