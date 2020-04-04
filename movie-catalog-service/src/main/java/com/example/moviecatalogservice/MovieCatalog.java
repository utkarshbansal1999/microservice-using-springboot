package com.example.moviecatalogservice;

public class MovieCatalog {
    private String movieID;
    private String name;
    private int rating;

    public MovieCatalog(String movieID, String name, int rating) {
        this.movieID = movieID;
        this.name = name;
        this.rating = rating;
    }

    public String getMovieID() {
        return movieID;
    }

    public void setMovieID(String movieID) {
        this.movieID = movieID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
