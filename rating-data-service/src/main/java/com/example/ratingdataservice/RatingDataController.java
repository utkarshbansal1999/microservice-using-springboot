package com.example.ratingdataservice;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
