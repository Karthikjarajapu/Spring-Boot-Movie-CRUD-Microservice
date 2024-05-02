package com.wipro.movie.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "movie_title")
    private String title;

    @Column(name = "movie_language")
    private String language;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Movie() {
        // Default constructor
    }

    public Movie(int id, String title, String language) {
        this.id = id;
        this.title = title;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Movie [id=" + id + ", title=" + title + ", language=" + language + "]";
    }
}
