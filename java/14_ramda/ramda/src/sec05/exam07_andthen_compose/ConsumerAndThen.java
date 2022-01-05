package sec05.exam07_andthen_compose;

import java.util.function.Consumer;

public class ConsumerAndThen {
    public static void main(String[] args) {
        Consumer<Member> consumerA = (a->{
            System.out.println("consumer A: "+a.getName());
        });

        Consumer<Member> consumerB = (b->{
            System.out.println("consumer B: " + b.getId());
        });

        Consumer<Member> consumerC = consumerA.andThen(consumerB);
        consumerC.accept(new Member("Doruka","eikk1250",null));
    }
}
