package sec05.exam08_and_or_negate_isequal;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {
    public static void main(String[] args) {
        //2의 배수 검사
        IntPredicate predicateA = num -> num%2 == 0;

        //3
        IntPredicate predicateB = num -> num%3 == 0;

        IntPredicate predicateC ;
        boolean result;

        //and()
        predicateC = predicateA.and(predicateB);
        result = predicateC.test(21);
        System.out.println(result);

        //or()
        predicateC = predicateA.or(predicateB);
        result = predicateC.test(21);
        System.out.println(result);

        //negate()
        predicateC = predicateA.negate();
        result = predicateC.test(21);
        System.out.println(result);

        
    }
}
