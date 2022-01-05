public class StorageImpl<T> implements Storage<T>{
	public T[] array;
	public StorageImpl(int capacity){
		this.array = (T[]) (new Object[capacity]);
	}	

	@Override
	public void add(T item, int idx){
		array[idx] = item;
	}

	@Override
	public T get(int index){
		return array[index];
	}
}