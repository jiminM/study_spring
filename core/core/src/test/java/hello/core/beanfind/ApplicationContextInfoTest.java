package hello.core.beanfind;

import hello.core.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextInfoTest {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("모든 빈 출력하기")
    void fingAllBean(){
        String[] beanDefinictionName = ac.getBeanDefinitionNames();
        for(String name : beanDefinictionName){
            //스프링 컨테이너의 빈 저장소에 저장된 빈객체들을 출력
            Object bean = ac.getBean(name);
            System.out.println("name= "+ name+",bean= "+ bean);
        }
    }

    @Test
    @DisplayName("모든 빈 출력하기")
    void fingApplicationBean(){
        String[] beanDefinictionName = ac.getBeanDefinitionNames();
        for(String name : beanDefinictionName){
            BeanDefinition beanDefinition =  ac.getBeanDefinition(name);  //bean 하나하나에 대한 메타데이터

            // BeanDefinition.ROLE_APPLICATION      :: 내부 빈이 아닌 프로젝트에서 쓰기위해 등록한 Bean들
            // BeanDefinition.ROLE_INFRASTRUCTURE   :: 스프링이 내부에서 사용하는 빈
            if(beanDefinition.getRole() == BeanDefinition.ROLE_INFRASTRUCTURE){
                Object bean = ac.getBean(name);
                System.out.println("name= "+ name+",bean= "+ bean);
            }
        }
    }
}
