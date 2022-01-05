package sec04.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("��",30);
		map.put("��",27);
		map.put("����",29);
		map.put("�˿�",28);
		
		System.out.println("�� Entry��: "+map.size());
		System.out.println(map.get("��"));
		System.out.println();
		
		//Map Collection ��� �� ������
		//1. keySet()
		//Map Collection ���� Key ��Ʈ���� �� ������
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			int value = map.get(key);
			System.out.println("key: "+key+" value: "+value);
		}
		System.out.println();
		map.remove("��");
		System.out.println("�� Entry��: "+map.size());
		System.out.println();
		
		//2. entrySet()		
		//Ű�� ���� ���� Map.Entry ��� �θ�
		//Map.Entry ��Ʈ���� �� ������
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
