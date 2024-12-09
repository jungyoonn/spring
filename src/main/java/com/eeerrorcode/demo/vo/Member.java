package com.eeerrorcode.demo.vo;

import java.lang.System.Logger.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Builder
@Slf4j
public class Member {
    private String id;
    private String pw;
    private String name;

    private static final Logger logger = Logger.getLogger("com.eeerrorcode.demo.vo.Member"); // logger는 보통 static final로 만듭니다
    private static final java.lang.System.Logger logger2 = System.getLogger("com.eeerrorcode.demo.vo.Member");
    private static final org.apache.logging.log4j.Logger logger3 = org.apache.logging.log4j.LogManager.getLogger(Member.class);

    public static void main(String[] args) {
        Member member = Member.builder()
        .id("abcd")
        .pw("1234")
        .name("이름")
        .build();
        System.out.println(member); // Member(id=abcd, pw=1234, name=이름

        logger.info(member.toString()); // 12월 09, 2024 11:13:33 오전 com.eeerrorcode.demo.vo.Member main
                                        // INFO: Member(id=abcd, pw=1234, name=이름)
        
        logger2.log(Level.INFO, member); // logger.info()랑 로그 출력 결과가 같다
        
        log.info(member.toString()); // Slf4j가 만들어 준 로그 객체 (Slf4j는 lombok이 만들어 줬음!)
        // 11:22:23.531 [main] INFO com.eeerrorcode.demo.vo.Member -- Member(id=abcd, pw=1234, name=이름)
        // @Slf4j 대신 @Log4j2를 추가하고 출력해도 같은 결과가 나온다

        logger3.info(member.toString()); // 얘도 Slf4j랑 같은 결과
    }
}
