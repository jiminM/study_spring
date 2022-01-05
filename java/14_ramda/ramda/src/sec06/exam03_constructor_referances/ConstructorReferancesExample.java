package sec06.exam03_constructor_referances;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferancesExample {
    public static void main(String[] args) {
        Function<String, Member> function1 = Member :: new;
        Member member1 = function1.apply("angel..");

        //**생성자 참조 함수의 코드는 같지만 실행되는 생성자는 다르다.
        BiFunction<String, String, Member> function2 =  Member :: new;
        Member member2 = function2.apply("doruka", "iron");

        //
    }
}
