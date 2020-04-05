package com.example.moviecatalogservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class MovieCatalogController {

    @Autowired
    private RestTemplate restTemplate;

//    @Autowired
//    private WebClient.Builder webClientBuilder;

    @RequestMapping("/{userid}")
    public List<MovieCatalog> getCatalog(@PathVariable(value="userid") String userid)
    {

        //RestTemplate restTemplate=new RestTemplate();

        List<RatingData> ratings= Arrays.asList(
          new RatingData("123",5),
          new RatingData("456",4)
        );


        return ratings.stream().map(rating ->
                {
                    MovieInfo movieInfo = restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieid(), MovieInfo.class);
                    //               OR

                    /*  MovieInfo movieInfo = webClientBuilder.build()
                            .get()
                            .uri("http://localhost:8082/movies/" + rating.getMovieid())    // Reactive Web
                            .retrieve()
                            .bodyToMono(MovieInfo.class)
                            .block();
                    */
                    return new MovieCatalog(rating.getMovieid(),movieInfo.getName(),rating.getRating());
                }
        ).collect(Collectors.toList());


//        return ratings.stream().map(rating ->
//                new MovieCatalog(rating.getMovieid(),"aliens",rating.getRating())
//        ).collect(Collectors.toList());


//        return Collections.singletonList(
//                new MovieCatalog("234","dostana",5)
//        );
    }
}
