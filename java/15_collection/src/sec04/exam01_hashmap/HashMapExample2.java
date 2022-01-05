package sec04.exam01_hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(new Student(1,"Jin"), 80);
		map.put(new Student(1,"Jin"), 95);
		
		System.out.println("Total Entry: "+map.size());
	}
}
