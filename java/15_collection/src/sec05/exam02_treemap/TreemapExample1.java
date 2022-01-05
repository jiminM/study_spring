package sec05.exam02_treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreemapExample1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(87,"Hong");
		scores.put(98,"Dong-soo");
		scores.put(75,"Gil-soon");
		scores.put(95,"Shin");
		scores.put(80,"Java");
		
		//entry?
		Map.Entry<Integer, String> entry = null;
		entry = scores.firstEntry();
		System.out.println("���� ���� ����: "+entry.getKey()+"-> "+entry.getValue()+"\n");
		entry = scores.lastEntry();
		System.out.println("���� ���� ����: "+entry.getKey()+"-> "+entry.getValue()+"\n");
		
		entry = scores.lowerEntry(95);
		System.out.println("95������ �Ʒ� ����: "+entry.getKey()+"-> "+entry.getValue()+"\n");
		entry = scores.higherEntry(95);
		System.out.println("95������ �� ����: "+entry.getKey()+"-> "+entry.getValue()+"\n");
		entry = scores.floorEntry(95);
		System.out.println("95���� �Ʒ� ����: "+entry.getKey()+"-> "+entry.getValue()+"\n");
		entry = scores.ceilingEntry(95);
		System.out.println("95���� �� ����: "+entry.getKey()+"-> "+entry.getValue()+"\n");
		
		while(!scores.isEmpty()) {
			//ù��° entry ����
			entry = scores.pollFirstEntry();
			System.out.println(entry.getKey()+"-> "+entry.getValue()+", remains: "+scores.size());
		}
		
	}

}
