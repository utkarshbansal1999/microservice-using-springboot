package com.example.moviecatalogservice;

public class RatingData {

    private String movieid;
    private int rating;

    public RatingData() {
    }

    public RatingData(String movieid, int rating) {
        this.movieid = movieid;
        this.rating = rating;
    }

    public String getMovieid() {
        return movieid;
    }

    public void setMovieid(String movieid) {
        this.movieid = movieid;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
