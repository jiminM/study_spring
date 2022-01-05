package sec04.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("진",30);
		map.put("뷔",27);
		map.put("슈가",29);
		map.put("알엠",28);
		
		System.out.println("총 Entry수: "+map.size());
		System.out.println(map.get("진"));
		System.out.println();
		
		//Map Collection 모든 값 꺼내기
		//1. keySet()
		//Map Collection 안의 Key 세트들을 다 가져옴
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			int value = map.get(key);
			System.out.println("key: "+key+" value: "+value);
		}
		System.out.println();
		map.remove("뷔");
		System.out.println("총 Entry수: "+map.size());
		System.out.println();
		
		//2. entrySet()		
		//키와 값을 합쳐 Map.Entry 라고 부름
		//Map.Entry 세트들을 다 가져옴
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			
			String key = entry.getKey();
			int value = entry.getValue();
			
			System.out.println("key: "+key+" value: "+value);			
		}
		
		
	}
}
