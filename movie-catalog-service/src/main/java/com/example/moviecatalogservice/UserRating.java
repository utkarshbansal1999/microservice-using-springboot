package com.example.moviecatalogservice;

import java.util.List;

public class UserRating {

    private List<RatingData> ratings;

    public List<RatingData> getRatings() {
        return ratings;
    }

    public void setRatings(List<RatingData> ratings) {
        this.ratings = ratings;
    }
}
