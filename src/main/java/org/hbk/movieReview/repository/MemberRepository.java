package org.hbk.movieReview.repository;

import org.hbk.movieReview.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {
}
