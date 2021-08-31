package org.hbk.movieReview.repository;

import org.hbk.movieReview.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
