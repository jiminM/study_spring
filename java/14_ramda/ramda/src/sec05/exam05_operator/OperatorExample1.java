package sec05.exam05_operator;

import java.util.function.IntBinaryOperator;

public class OperatorExample1 {

    private static int[] scores = {92,95,87,45,125};

    public static  int maxOrmin(IntBinaryOperator operator){
        int result = scores[0];

        for(int s : scores){
            result = operator.applyAsInt(result, s);
        }
        return result;
    }

    public static void main(String[] args) {
        //최대값
        int max = maxOrmin((a,b)->{
            if(a >= b)
                return a;
            else
                return b;
        });
        System.out.println(max);

        int min = maxOrmin((a,b)->{
            if(a <= b)
                return a;
            else return b;
        });
        System.out.println(min);

        int sum = maxOrmin((a,b)->{
            return (a+b)/2;
        });
        System.out.println(sum);
    }

}
