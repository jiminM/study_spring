package sec03.exam01_hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("Hong",28));
		set.add(new Member("Hong",28));
		
		System.out.println("total: "+set.size());
		//Set�� ������ �ؽ� �ڵ带 �ߺ������Ű�� �ʴ´�.
	}
}
