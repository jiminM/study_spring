public class ContainerDouble<K, V>{
	private K key;
	private V value;
	
	public void set(K k, V v){
		this.key = k;
		this.value = v;
	}
	public K getKey(){ return key; }
	public V getValue(){ return value; }
}