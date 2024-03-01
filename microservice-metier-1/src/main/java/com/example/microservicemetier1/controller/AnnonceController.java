package com.example.microservicemetier1.controller;

import com.example.microservicemetier1.service.AnnonceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnnonceController {


    private final AnnonceService annonceService;

    @Autowired
    public AnnonceController(AnnonceService annonceService) {
        this.annonceService = annonceService;
    }

    @GetMapping("/annonce/display")
    public String getAllAnnonces() {
        return annonceService.getAllAnnonces();
    }

}
