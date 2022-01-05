public class Product<T,M>{
	private T kind;
	private M model;

	public T getKind() { return this.kind; }
	public M getModel() { return this.model; }

	public void setKind(T _kind){ this.kind = _kind; }
	public void setModel(M _model){ this.model = _model; }
}
