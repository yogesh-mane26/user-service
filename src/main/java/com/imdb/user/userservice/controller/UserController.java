package com.imdb.user.userservice.controller;

import com.imdb.user.userservice.model.CatalogItem;
import com.imdb.user.userservice.model.Movie;
import com.imdb.user.userservice.model.Rating;
import com.imdb.user.userservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class UserController {

    @Autowired
    public RestTemplate restTemplate;

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {

        /*List<Rating> ratings= Arrays.asList(
                new Rating(101,5),
                new Rating(102,25)
        );*/
        User ratings=restTemplate.getForObject("http://localhost:8082/api/service/v1/rating/"+userId, User.class)

        return ratings.stream().map(rating ->{
           Movie movie=restTemplate.getForObject("http://localhost:8081/movie/"+rating.getmID(), Movie.class);
           return new CatalogItem(movie.getName(),"Desc", rating.getRating());
        })
        .collect(Collectors.toList());

    }
}
