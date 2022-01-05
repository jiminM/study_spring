package example_test.sec06_lamda.exam04;

import java.util.function.IntBinaryOperator;

public class LambdaExample {
    private static int[] scores = {10,50,3};

    public static int maxOrMin(IntBinaryOperator operator){
        int result = scores[0];
        for(int score : scores){
            result = operator.applyAsInt(result, score);
        }        
        return result;
    }

    public static void main(String[] args) {
        //max
        int max = maxOrMin((num1, num2)->{
            if(num1 >= num2)
                return num1;
            else
                return num2;
        });
        System.out.println(max);

        //min
        int min = maxOrMin((num1, num2)->{
            if(num1 <= num2)
                return num1;
            else
                return num2;
        });
        System.out.println(min);
    }

}
