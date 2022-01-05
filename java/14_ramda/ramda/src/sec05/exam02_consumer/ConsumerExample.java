package sec05.exam02_consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = t -> System.out.println(t + "8");
        consumer.accept("자바");

        BiConsumer<String, String> biConsumer = (t,u) -> System.out.println(t + "8" + u);
        biConsumer.accept("mikoshiba", "mikoto");

        DoubleConsumer doubleConsumer = d -> System.out.println(d + "pt");
        doubleConsumer.accept(8.9);

        ObjIntConsumer<String> objIntConsumer = (str, i) -> System.out.println(str + "pt"+i);
        objIntConsumer.accept("myCalendar", 88);
    }
}
