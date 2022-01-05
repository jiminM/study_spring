package sec06.exam01_method_referances;

import java.util.function.IntBinaryOperator;

public class MethodReferancesExample {
    public static void main(String[] args) {
        IntBinaryOperator operator;

        //정적 메서드 참조
        operator = (num1, num2) -> Calcurator.staticMethod(num1, num2);
        System.out.println(operator.applyAsInt(3, 5));

        operator = Calcurator :: staticMethod;
        System.out.println(operator.applyAsInt(34, 95));

        //인스턴스 메서드 참조
        Calcurator obj = new Calcurator();
        operator = (num1, num2) -> obj.instanceMethod(num1, num2);
        System.out.println(operator.applyAsInt(45, 14));
        operator = obj :: instanceMethod;
        System.out.println(operator.applyAsInt(11, 6));
    }
}
