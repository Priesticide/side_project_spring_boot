package org.hbk.movieReview.repository;

import org.hbk.movieReview.entity.Movie;
import org.hbk.movieReview.entity.MovieImage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.UUID;
import java.util.stream.IntStream;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class MovieRepositoryTests {

    @Autowired
    private MovieRepository repository;

    @Autowired
    private MovieImageRepository imageRepository;

    @Test
    public void insertMovies() {

        IntStream.rangeClosed(1,100).forEach(i->{

            Movie movie = Movie.builder()
                    .title("Movie Title..." + i)
                    .content("Movie Content..." + i)
                    .build();

            repository.save(movie);

            for (int j = 0; j < 3; j++){
                MovieImage image = MovieImage.builder()
                        .uuid(UUID.randomUUID().toString())
                        .movie(movie)
                        .imgName("Movie Poster" + j + ".jpg")
                        .build();

                imageRepository.save(image);
            }

        });


    }
}
