package sec05.exam02_treemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreemapExample2 {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(87,"Hong");
		scores.put(98,"Dong soo");
		scores.put(75,"Gil soon");
		scores.put(95,"Shin");
		scores.put(80,"Java");

		//ascending
		NavigableMap<Integer, String> descendingMap = scores.descendingMap();
		Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();
		for(Map.Entry<Integer, String> entry:descendingEntrySet) {
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
	}

}
