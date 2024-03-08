package com.example.microservicemetier1.controller;

import com.example.microservicemetier1.modele.Annonce;
import com.example.microservicemetier1.service.AnnonceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/job/")
public class AnnounceController {

    private final WebClient webClient;
    private final AnnonceService annonceService;

    @Autowired
    public AnnounceController(WebClient.Builder webClientBuilder, AnnonceService annonceService) {
        this.webClient = webClientBuilder.baseUrl("http://localhost:8080").build();
        this.annonceService = annonceService;
    }

    /**
     * Route pour lister toutes les annonces
     * @return liste d'annonces
     */
    @GetMapping("/announce")
    public Flux<Annonce> listerAnnounces() {
        return this.annonceService.getAllAnnounces(this.webClient);
    }
}