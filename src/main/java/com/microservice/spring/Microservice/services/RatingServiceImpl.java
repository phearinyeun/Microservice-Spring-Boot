package com.microservice.spring.Microservice.services;

import com.microservice.spring.Microservice.model.Rating;
import com.microservice.spring.Microservice.repo.RatingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService{
    private final RatingRepository ratingRepository;

    public RatingServiceImpl(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    public List<Rating> findRatingsByBookId (Long bookId){
        if (bookId.equals(0L)){
            return ratingRepository.findAllRatings();
        }
        return ratingRepository.findRatingsByBookId(bookId);
    }

    public Rating createRating (Rating rating){
        return ratingRepository.createRating(rating);
    }

    @Override
    public void deleteRating(Long ratingId) {
        ratingRepository.deleteRating();
    }

    @Override
    public Rating updateRating(Rating rating, Long ratingId) {
        return ratingRepository.updateRating(rating, ratingId);
    }

}
