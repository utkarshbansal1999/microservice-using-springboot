package com.example.ratingdataservice;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingDataController {

    @RequestMapping("/{movieid}")
    public List<RatingData> getRating(@PathVariable(value="movieid") String movieid)
    {
        return Collections.singletonList(
          new RatingData(movieid,5)
        );
    }

    @RequestMapping("/users/{userid}")
    public UserRating getRatingUserId(@PathVariable(value="userid") String userid)
    {
        List<RatingData> ratings= Arrays.asList(
                new RatingData("123",5),
                new RatingData("456",4)
        );
//        return ratings;
        UserRating userRating=new UserRating();
        userRating.setRatings(ratings);
        return userRating;
    }
}
