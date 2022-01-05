package sec05.exam09_minby_maxby;

import java.util.function.BinaryOperator;

public class OpperatorMinbyMaxbyExample {
    public static void main(String[] args) {
        BinaryOperator<Fruit> operator;
        Fruit fruit, apple, melon, strawberry;

        apple = new Fruit("apple", 3400, 123.0);
        melon = new Fruit("melon", 8700, 2300.45);
        strawberry = new Fruit("strawberry", 6000, 45.3);

        //두 객체의 가격을 비교해 객체를 리턴
        operator = BinaryOperator.minBy( (fruit1, fruit2)->Integer.compare(fruit1.price, fruit2.price));
        fruit = operator.apply(apple, melon);
        System.out.println(fruit.name);

        operator = BinaryOperator.maxBy( (fruit1, fruit2)->Integer.compare(fruit1.price, fruit2.price));
        fruit = operator.apply(apple, melon);
        System.out.println(fruit.name);

        //객체의 무개를 비교해 객체를 리턴
        operator = BinaryOperator.minBy( (fruit1, fruit2)->Double.compare(fruit1.weight, fruit2.weight));
        fruit = operator.apply(apple, strawberry);
        System.out.println(fruit.name);

        operator = BinaryOperator.maxBy( (fruit1, fruit2)->Double.compare(fruit1.weight, fruit2.weight));
        fruit = operator.apply(melon, apple);
        System.out.println(fruit.name);
    }
}
