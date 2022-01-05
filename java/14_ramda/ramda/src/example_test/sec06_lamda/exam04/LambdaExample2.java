package example_test.sec06_lamda.exam04;

import java.util.function.ToIntFunction;

public class LambdaExample2 {
    private static Student[] students = {
        new Student("hong gildong", 90, 96),
        new Student("kim sukjin", 95, 93)
    };

    public static void main(String[] args) {
        double englishAvg = avg( Student :: getEngScore);
        System.out.println(englishAvg);
        double mathAvg = avg( Student :: getMathScore);
        System.out.println(mathAvg);
    }

    //avg 메서드 작성
    public static double avg(ToIntFunction<Student> function){
        int sum = 0;
        for(Student student: students){
            sum += function.applyAsInt(student);
        }
        System.out.println(sum);
        System.out.println(students.length);
        return (double) sum / students.length;
    }
    
}
