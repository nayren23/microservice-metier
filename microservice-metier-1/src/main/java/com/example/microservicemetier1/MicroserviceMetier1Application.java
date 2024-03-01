package com.example.microservicemetier1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration;
import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientSsl;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class MicroserviceMetier1Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceMetier1Application.class, args);

        String url = "http://localhost:8080/";

        WebClient.Builder  builder = WebClient.builder();

        String annonce = builder.build()
                .get()
                .uri(url+"annonce/display")
                .retrieve().
                bodyToMono(String.class)
                .block();
        System.out.println("-----------------------------------------------------------------");
        System.out.println(annonce);
        System.out.println("-----------------------------------------------------------------");
    }

}
