package sec06.exam02_argument_method_referances;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferancesExample {
    public static void main(String[] args) {
        ToIntBiFunction<String, String> function;

        function = (msg1, msg2) -> msg1.compareToIgnoreCase(msg2);
        print(function.applyAsInt("bear", "apple"));
        function = String :: compareToIgnoreCase;
        print(function.applyAsInt("jin", "jin"));

    }

    public static void print(int order){
        if(order < 0) System.out.println("사전순으로 먼저 옵니다.");
        else if(order == 0) System.out.println("동일한 문자열입니다,");
        else System.out.println("사전순으로 나중에 옵니다.");
    }
}
