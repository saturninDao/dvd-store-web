package com.saturnindao.dvdstore.web.form;
/* Created by Saturnin Dao on 17/12/2021 16:06 */

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class MovieForm {

    Long id;
    @NotBlank(message = "Veuillez entrer un titre")
    @Size(max = 20, message = "Entrez un titre de 20 caractères au plus")
    String title;

    @NotBlank(message = "Veuillez entrer un genre")
    private String genre;

    @Size(max = 255,message = "Entrez une description de 255 caractères au plus")
    String description;

    @Size(max = 20,message = "Entrez un nom de 20 caractères au plus")
    String nom;

    @NotBlank(message = "Veuillez entrer un prenom")
    @Size(max = 20,message = "Entrez un prenom de 20 caractères au plus")
    String prenom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
