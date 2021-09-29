package com.ott.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="moviedetails")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn
    @Column(name = "movie_id")
    private int movie_id;
 /*   @OneToOne(targetEntity=Movie.class,cascade=CascadeType.ALL)
    private  */

    @Column(name = "movie_name")
    private String movieName;

    @Column(name = "description")
    String descripitom;

    @Column(name="image")
    private String image;



    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setDescripitom(String descripitom) {
        this.descripitom = descripitom;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getImage() {
        return image;
    }

    public String getDescripitom() {
        return descripitom;
    }

    public int getMovie_id() {
        return movie_id;
    }
}