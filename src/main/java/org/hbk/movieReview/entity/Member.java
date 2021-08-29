package org.hbk.movieReview.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Table(name = "mr_member")
public class Member extends BaseEntity{

    @Id
    private String mid;

    private String email;

    private String pw;

    private String nickname;

}
