package com.example.moviecatalogservice;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/users")
public class MovieCatalogController {

    @RequestMapping("/{userid}")
    public List<MovieCatalog> getCatalog(@PathVariable(value="userid") String userid)
    {
        return Collections.singletonList(
                new MovieCatalog("234","dostana",5)
        );
    }
}
