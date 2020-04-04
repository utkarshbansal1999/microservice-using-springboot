package com.example.movieinfoservice;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {

    @RequestMapping("/{movieid}")
    public List<MovieInfo> getMovie(@PathVariable(value = "movieid") String movieid)
    {
        return Collections.singletonList(
                new MovieInfo("234","pk")
        );
    }
}
