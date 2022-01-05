public class Util{
	public static <K,V> V getValue(Pair<K, V> t1, K key){
		if(t1.getKey() == key)
			return t1.getValue();
		else
			return null;
	}

}