package com.example.microservicemetier1.controller;

import com.example.microservicemetier1.modele.Annonce;
import com.example.microservicemetier1.service.AnnonceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/annonce/")

public class AnnonceController {

    //private final AnnonceService annonceService;
    private final WebClient webClient;

    @Autowired
    public AnnonceController(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://localhost:8080").build();

        //this.annonceService = annonceService;
    }


    @GetMapping("/display")
    public Flux<Annonce> listerAnnonces() {
        return this.webClient.get().uri("/annonce/display")
                .retrieve()
                .bodyToFlux(Annonce.class);
    }
}
