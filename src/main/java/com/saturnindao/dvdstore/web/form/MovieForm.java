package com.saturnindao.dvdstore.web.form;
/* Created by Saturnin Dao on 17/12/2021 16:06 */

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class MovieForm {

    Long id;
    @NotBlank
    @Size(max = 20)
    String title;

    @NotBlank
    private String genre;

    @Size(max = 255)
    String description;

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
