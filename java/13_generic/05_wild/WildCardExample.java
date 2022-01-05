import java.util.Arrays;

public class WildCardExample{
	//all Students
	public static void registerCourse( Course<?> course){
		System.out.println(course.getName()+" .students: "+Array.toString(course.getStudents()));
	}

	//only Students
	public static void registerCourseStudent( Course<? extends Student> course){
		System.out.println(course.getName()+" .students: "+Array.toString(course.getStudents()));
	}
	
	//only Workers
	public static void registerCourseWorker( Course<? super Worker> course){
		System.out.println(course.getName()+" .students: "+Array.toString(course.getStudents()));
	}

	public static void main(String[] args){
		
	}
}