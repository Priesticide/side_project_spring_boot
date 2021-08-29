package org.hbk.movieReview.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Table(name = "mr_movie")
public class Movie extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mno;

    @OneToOne(mappedBy = "movie")
    private Genre genre;

    private String title;

    private String content;
}
