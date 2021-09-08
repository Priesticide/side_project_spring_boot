package org.hbk.movieReview.repository;

import org.hbk.movieReview.entity.Movie;
import org.hbk.movieReview.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    List<Review> findByMovie(Movie movie);

}
