public interface Storage<T>{
	public void add(T item, int idx);
	public T get(int index);
}