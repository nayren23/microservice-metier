package com.example.microservicemetier1;

import com.example.microservicemetier1.service.AnnonceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@SpringBootApplication
public class MicroserviceMetier1Application {


    public static void main(String[] args) {
        SpringApplication.run(MicroserviceMetier1Application.class, args);
        // Juste pour le test
        AnnonceService annonceService = new AnnonceService();
        List<Map<String, Objects>> annonces = annonceService.getAllAnnonces();
        System.out.println("-----------------------------------------------------------------");
        System.out.println(annonces);
        System.out.println("-----------------------------------------------------------------");
    }
}
