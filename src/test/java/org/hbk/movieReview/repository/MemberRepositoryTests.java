package org.hbk.movieReview.repository;

import org.hbk.movieReview.entity.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.stream.IntStream;

@SpringBootTest
public class MemberRepositoryTests {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void insertMembers()  {

        IntStream.rangeClosed(1, 100).forEach(i ->{

            Member member =Member.builder()
                    .email("USER"+ i + "@gamil.com")
                    .password(passwordEncoder.encode("1111"))
                    .nickname("Nickname" + i)
                    .name("USER" + i)
                    .fromSocial(false)
                    .build();

            memberRepository.save(member);
        });

    }
}
