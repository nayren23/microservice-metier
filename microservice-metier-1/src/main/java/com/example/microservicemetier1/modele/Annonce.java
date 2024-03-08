package com.example.microservicemetier1.modele;

import java.time.LocalDate;

public class Annonce {
    private Long id;

    private String title;

    private String description;

    private String adress;

    private String mail;

    private LocalDate date;

    public Annonce() {
    }

    public Annonce(String title, String description, String address, String mail, LocalDate date) {
        this.title = title;
        this.description = description;
        this.adress = address;
        this.mail = mail;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return adress;
    }

    public void setAddress(String address) {
        this.adress = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
