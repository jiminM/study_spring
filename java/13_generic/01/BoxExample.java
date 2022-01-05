public class BoxExample{
	public static void main(String[] args){
		Box<String> box1 = new Box<String>();
		box1.set("mic drop");
		String name = box1.get();
		System.out.println(name);

		Box<Integer> box2 = new Box<Integer>();
		box2.set(85);
		int _box2 = box2.get();
		System.out.println(_box2);

		//box.set(new Apple());
		//Apple apple = (Apple) box.get();
	}
}