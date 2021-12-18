package com.saturnindao.dvdstore.web.controller;


import com.saturnindao.dvdstore.entity.Movie;
import com.saturnindao.dvdstore.service.MovieServiceInterface;
import com.saturnindao.dvdstore.web.form.MovieForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private MovieServiceInterface movieService;

    public MovieServiceInterface getMovieService() {
        return movieService;
    }


    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/dvdstore-home")
    public void displayHome(){

    }

    @GetMapping("/add-movie-form")
    public void displayMovieForm(@ModelAttribute MovieForm movie){
        //vous pourriez même supprimer l'annotation @ModelAttribute si vous ne comptez
        //pas donner un identifiant personnalisé au backing bean
    }

}
