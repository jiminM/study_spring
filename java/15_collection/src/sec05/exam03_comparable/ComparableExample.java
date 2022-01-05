package sec05.exam03_comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		treeSet.add(new Person("Hong", 45));
		treeSet.add(new Person("Java", 25));
		treeSet.add(new Person("Jiwon", 31));
		
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			//저장 순서가 아닌, Person comparate에 지정한대로 나이가 적은 순서대로 정렬
			Person person = iterator.next();
			System.out.println(person.name+":"+person.age);
			
		}
		
		
	}
}
