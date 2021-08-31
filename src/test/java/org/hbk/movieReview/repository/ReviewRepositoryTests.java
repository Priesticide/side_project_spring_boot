package org.hbk.movieReview.repository;

import org.hbk.movieReview.entity.Member;
import org.hbk.movieReview.entity.Movie;
import org.hbk.movieReview.entity.Review;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class ReviewRepositoryTests {

    @Autowired
    private ReviewRepository reviewRepository;

    @Test
    public void insertReviews(){

        IntStream.rangeClosed(1, 200).forEach(i ->{

            Long mno = (long)(Math.random() * 100) +1;

            Long mid = ((long)(Math.random() * 100) + 1);
            Member member = Member.builder().mid(mid).build();

            Review review = Review.builder()
                    .member(member)
                    .movie(Movie.builder().mno(mno).build())
                    .grade((int)(Math.random()*5)+1)
                    .text("이영화는 말이죠....." + i)
                    .build();

            reviewRepository.save(review);

        });

    }

}
