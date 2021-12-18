package com.saturnindao.dvdstore.web.api;
/* Created by Saturnin Dao on 15/12/2021 14:33 */


import com.saturnindao.dvdstore.entity.Movie;
import com.saturnindao.dvdstore.service.MovieServiceInterface;
import com.saturnindao.dvdstore.web.form.MovieForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class MovieRessource {

    @Autowired
    private MovieServiceInterface movieService;

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    @GetMapping("movie/{id}")
    public Movie get(@PathVariable("id") long id){
        return movieService.getMovieById(id);
    }

    @PostMapping("add")
    public String add(@RequestBody Movie movie){
        movieService.registerMovie(movie);
        return "movie-added";
    }

    @GetMapping("/movie")
    public List<Movie> list(){
        return movieService.getMovieList();
    }
}
