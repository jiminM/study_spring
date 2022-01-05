package sec05.exam07_andthen_compose;

import java.util.function.Function;

public class FunctionAndThenCompose {
    public static void main(String[] args) {
        Function<Member, Address> functionA;
        Function<Address, String> functionB;
        Function<Member, String> functionC;

        functionA = (member)->member.getAddress();
        functionB = (address)->address.getCity();
        functionC = functionA.andThen(functionB);
        String city = functionC.apply(new Member("Kim sukjin","home",new Address("Korea","Deagu")));
        System.out.println(city);


        functionC = functionB.compose(functionA);
        city = functionC.apply(new Member("Kim sukjin","home",new Address("Korea","Deagu")));
        System.out.println(city);
    }
}
