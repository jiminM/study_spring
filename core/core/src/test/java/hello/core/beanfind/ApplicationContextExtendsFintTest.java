package hello.core.beanfind;

import hello.core.AppConfig;
import hello.core.discount.DiscountPolish;
import hello.core.discount.FixDiscountPolish;
import hello.core.discount.RateDiscountPolish;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

public class ApplicationContextExtendsFintTest {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);

    @Test
    @DisplayName("부모타입으로 조회 시, 자식이 둘 이상이면 중복 오류가 발생한다.")
    void findBeanByParentTypeDuplicate(){
        DiscountPolish discountPolish =  ac.getBean(DiscountPolish.class);
        //Assertions.assertThrows(NoUniqueBeanDefinitionException.class, ()->ac.getBean(DiscountPolish.class));
    }

    @Test
    @DisplayName("부모타입으로 조회 시, 자식이 둘 이상이면 빈 이름을 지정하면 된다.")
    void findBeanByParentTypeName(){
        DiscountPolish rateDiscountPolish =  ac.getBean("rateDiscountPolish",DiscountPolish.class);
        Assertions.assertThat(rateDiscountPolish).isInstanceOf(RateDiscountPolish.class);
    }

    @Test
    @DisplayName("부모타입으로 조회 시, 자식이 둘 이상이면 특정 하위타입으로 조회(비추천)")
    void findBeanByParentType(){
        Map<String, DiscountPolish> beanType = ac.getBeansOfType(DiscountPolish.class);
        Assertions.assertThat(beanType.size()).isEqualTo(2);
        for(String key : beanType.keySet()){
            System.out.println("key: "+key+" value= "+beanType.get(key));
        }
    }

    @Test
    @DisplayName("부모 타입으로 모두 조회 - Object출력," +
            " 내부에 쓰이는 모두 Bean 출력")
    void findAllBeanByObjectType(){
        Map<String, Object> beanOfType = ac.getBeansOfType(Object.class);
        for(String k : beanOfType.keySet()){
            System.out.println("key: "+k+" value= "+beanOfType.get(k));
        }
    }


    @Configuration
    static class TestConfig{
        @Bean
        public DiscountPolish rateDiscountPolish(){
            return new RateDiscountPolish();
        }
        @Bean
        public DiscountPolish fixDiscountPolish(){
            return new FixDiscountPolish();
        }

    }
}
