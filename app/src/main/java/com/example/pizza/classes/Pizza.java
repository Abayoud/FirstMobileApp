package com.example.pizza.classes;

public class Pizza {
    private int id;
    private String nom;
    private int nbIngredients;
    private int photo;
    private String duree;
    private String detailsIngred;
    private String description;
    private String preparation;
    private static int comp = 0;

    public Pizza(String nom, int nbIngredients, int photo, String duree, String detailsIngred, String description, String preparation) {
        this.id = ++comp;
        this.nom = nom;
        this.nbIngredients = nbIngredients;
        this.photo = photo;
        this.duree = duree;
        this.detailsIngred = detailsIngred;
        this.description = description;
        this.preparation = preparation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbIngredients() {
        return nbIngredients;
    }

    public void setNbIngredients(int nbIngredients) {
        this.nbIngredients = nbIngredients;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getDetailsIngred() {
        return detailsIngred;
    }

    public void setDetailsIngred(String detailsIngred) {
        this.detailsIngred = detailsIngred;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }
}
