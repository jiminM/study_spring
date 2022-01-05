package sec05.exam08_and_or_negate_isequal;

import java.util.function.Predicate;

public class PredicateIsEqualExample {
    public static void main(String[] args) {
        Predicate<String> predicate;
        predicate = Predicate.isEqual(null);
        System.out.println(predicate.test(null));

        predicate = Predicate.isEqual("java 8");
        System.out.println(predicate.test(null));

        predicate = Predicate.isEqual("null");
        System.out.println(predicate.test("java 8"));

        predicate = Predicate.isEqual("java 8");
        System.out.println(predicate.test("java 8"));
    }
}
