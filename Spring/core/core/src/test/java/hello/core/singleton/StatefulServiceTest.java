package hello.core.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.junit.jupiter.api.Assertions.*;

class StatefulServiceTest {

    @Test
    void statefulServiceSingleton(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService statefulService1 =  ac.getBean(StatefulService.class);
        StatefulService statefulService2 =  ac.getBean(StatefulService.class);

        //A사용자가 10000원 주문
        statefulService1.order("userA",10000);
        //A사용자가 20000원 주문
        statefulService2.order("userB",20000);

        //ThreadA:사용자A가 주문 금액 조회
        int price = statefulService1.getPrice();

    }

    static class TestConfig{
        @Bean
        public StatefulService statefulService(){
            return new StatefulService();
        }
    }
}