package com.eeerrorcode.demo.vo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class MemberTests {
    // private Member member = Member.builder().build();

    // @Test
    // public void testMember() {
    //     // given
    //     Member m1 = Member.builder()
    //     .id("abcd")
    //     .pw("1234")
    //     .name("이름")
    //     .build();

    //     Member m2 = Member.builder()
    //     .id("abcd")
    //     .pw("1234")
    //     .name("이름")
    //     .build();

    //     // when ~ then
    //     log.info(String.format("%X@%X", m1.getClass().getName(), m1.hashCode()));
    //     log.info(String.format("%X@%X", m2.getClass().getName(), m2.hashCode()));
        
    //     // expect / assert
    //     assertEquals(m1, m2); // true로 통과됨
    //     System.out.println(m1.equals(m2));
    //     assertSame(m1, m2); // 통과 안 됨
    // }

    // @Autowired
    // @Qualifier("member")
    // private Member member;
    // @Test
    // public void testDI() {
    //     System.out.println(member);
    // }
}
