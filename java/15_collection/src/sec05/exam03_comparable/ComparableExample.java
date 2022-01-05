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
			//���� ������ �ƴ�, Person comparate�� �����Ѵ�� ���̰� ���� ������� ����
			Person person = iterator.next();
			System.out.println(person.name+":"+person.age);
			
		}
		
		
	}
}
