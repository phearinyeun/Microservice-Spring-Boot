package com.microservice.spring.Microservice.controller;

import com.microservice.spring.Microservice.model.Rating;
import com.microservice.spring.Microservice.services.RatingServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {
    private final RatingServiceImpl ratingService;

    public RatingController(RatingServiceImpl ratingService) {
        this.ratingService = ratingService;
    }

    @GetMapping
    public List<Rating> findRatingsByBookId(@RequestParam(required = false, defaultValue = "0") Long bookId){
        return ratingService.findRatingsByBookId(bookId);
    }

    @PostMapping
    public Rating createRating(@RequestBody Rating rating){
        return ratingService.createRating(rating);
    }

    @GetMapping
    public void deleteRating(@PathVariable Long ratingId){
        ratingService.deleteRating(ratingId);
    }
}
