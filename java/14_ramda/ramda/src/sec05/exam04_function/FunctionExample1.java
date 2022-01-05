package sec05.exam04_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
    private static List<Student> students = Arrays.asList(
        new Student("Kim namjoon",100,100),
        new Student("Kim Sukjin",90,95)
    );

    public static void printString(Function<Student, String> function){
        for(Student student : students){
            System.out.print(function.apply(student)+" ");
        }
        System.out.println();
    }

    public static void printInt(ToIntFunction<Student> function){
        for(Student student : students){
            System.out.print(function.applyAsInt(student)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printString(t->t.getName());
        printInt(t->t.getEngScore());
        printInt(t->t.getMathScore());
    }
}
