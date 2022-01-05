package hello.core.beanfind;

import hello.core.AppConfig;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class ApplicationContextBasicFindTest {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("Bean 이름으로 조회")
    void findBeanByName(){
       MemberService memberService =  ac.getBean("memberService", MemberService.class);
       System.out.println(memberService);
       System.out.println(memberService.getClass());
       //검증
        Assertions.assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
    }


    @Test
    @DisplayName("Bean 이름없이 타입으로 조회")
    void findBeanByType(){
                                                    //Type만
        MemberService memberService =  ac.getBean(MemberService.class);
        System.out.println(memberService);
        System.out.println(memberService.getClass());
        //검증
        Assertions.assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
    }
}
