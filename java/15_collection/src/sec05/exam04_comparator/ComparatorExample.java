package sec05.exam04_comparator;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());
													//내림차순하는 정렬자를 직접만듬
		treeSet.add(new Fruit("grape",3000));
		treeSet.add(new Fruit("watermelon",10000));
		treeSet.add(new Fruit("strawberry",6000));
		
		Iterator<Fruit> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Fruit f = iterator.next();
			System.out.println(f.name + ":" + f.price);
		}
		
	}

}
