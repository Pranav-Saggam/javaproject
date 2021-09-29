package com.ott.entity;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private int movie_id;
    @NotNull(message = "Field Required")
    @Column(name = "movie_name")
    private String movieName;
    @NotNull
    @Column(name = "hero")
    String hero;
    @NotNull
    @Column(name="heroine")
    private String heroine;
    @NotNull
    @Column(name = "director")
    private String director;
    @NotNull
    @Column(name="genre")
    private String genre;
    @NotNull
    @Column
    private String language;
    @NotNull
    @Column
    private String link;
  public String getGenre(){
  return genre;
  }
  public void setMovie_id(int movie_id){
  this.movie_id=movie_id;

  }
public int getMovie_id(){
return movie_id;
}
public void setDirector(String director){
this.director=director;
}
public String getDirector(){
return director;
}
public String getLink(){
return link;
}


    public String getHero() {
        return hero;
    }


    public String getLanguage() {
        return language;
    }


    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setHeroine(String heroine) {
        this.heroine = heroine;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMovieName() {

        return movieName;
    }

    public String getHeroine() {
        return heroine;
    }
}
