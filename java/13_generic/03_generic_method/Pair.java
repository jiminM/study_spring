public class Pair<K,V>{
	private K key;
	private V value;
	public Pair(K _key, V _value){
		this.key = _key;
		this.value = _value;
	}
	
	public void setKey(K _key){ this.key = _key; }
	public void setValue(V _value){ this.value = _value; }
	public K getKey(){ return key; }
	public V getValue(){ return value; }
}