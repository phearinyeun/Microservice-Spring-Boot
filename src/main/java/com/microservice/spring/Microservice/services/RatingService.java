package com.microservice.spring.Microservice.services;

import com.microservice.spring.Microservice.model.Rating;

import java.util.List;

public interface RatingService {
    List<Rating> findRatingsByBookId(Long bookId);
    Rating createRating (Rating rating);
    void deleteRating(Long ratingId);
    Rating updateRating (Rating rating, Long ratingId);

}
