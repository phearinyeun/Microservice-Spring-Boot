package com.microservice.spring.Microservice.repo;

import com.microservice.spring.Microservice.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {
    List<Rating> findAllRatings();

    List<Rating> findRatingsByBookId(Long bookId);

    Rating createRating(Rating rating);

    void deleteRating();

    Rating updateRating(Rating rating, Long ratingId);
}
