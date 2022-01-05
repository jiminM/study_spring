package sec03.exam01_hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("Hong",28));
		set.add(new Member("Hong",28));
		
		System.out.println("total: "+set.size());
		//Set은 동일한 해쉬 코드를 중복저장시키지 않는다.
	}
}
