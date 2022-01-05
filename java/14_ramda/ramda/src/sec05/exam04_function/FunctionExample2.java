package sec05.exam04_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
    private static List<Student> students = Arrays.asList(
        new Student("Kim namjoon",100,100),
        new Student("Kim Sukjin",90,95)
    );

    
    public static double avg(ToIntFunction<Student> function){
        //들어오는 int값들의 평균값
        int sum = 0;
        for(Student student : students){
            sum += function.applyAsInt(student);
        }
        double avg = sum/ students.size();
        return avg;
    }



    public static void main(String[] args) {
        double engAvg = avg(t->t.getEngScore() );
        double mathAvg = avg(t->t.getMathScore());

        System.out.println("영어 평균 점수: "+ engAvg);
        System.out.println("수학 평균 점수: "+ mathAvg);
    }
}
