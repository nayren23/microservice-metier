package com.example.microservicemetier1.service;

import com.example.microservicemetier1.modele.Annonce;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public class AnnonceService {

    public AnnonceService() {
    }

    /**
     * Récupère une liste d'annonces.
     *
     * @return un flux de type Flux<Annonce> contenant la liste des annonces.
     */
    public Flux<Annonce> getAllAnnounces(WebClient webClient) {
        return webClient.get().uri("/announce/announces")
                .retrieve()
                .bodyToFlux(Annonce.class);
    }
}