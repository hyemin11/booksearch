package com.book.booksearch.member;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public class MemberTest
{
    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void test()
    {
        Member member = new Member();
        member.setId("aa");
        member.setPassword("aa");

        Member newmb = memberRepository.save(member);

    }
}
