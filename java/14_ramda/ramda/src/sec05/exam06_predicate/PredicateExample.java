package sec05.exam06_predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class PredicateExample {
    private static List<Student> list = Arrays.asList(
        new Student("Liu", "m", 65),
        new Student("Mako", "m", 33),
        new Student("Miluo", "w", 100),
        new Student("LVe", "w", 89),
        new Student("Zara", "w", 77)
    );

    public static double avg(Predicate<Student> predicate){
        int count = 0, sum = 0;
        for(Student s : list){
            if(predicate.test(s)){
                count++;
                sum += s.getScore();
            }
        }
        return (double)sum / count;
    }
    public static void main(String[] args) {
        double m_avg = avg((man)-> man.getGender().equals("m"));
        double w_avg = avg((woman)-> woman.getGender().equals("w"));

        System.out.println(w_avg);
        System.out.println(m_avg);
    }
}
