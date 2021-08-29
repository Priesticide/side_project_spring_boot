package org.hbk.movieReview.repository;

import org.hbk.movieReview.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
