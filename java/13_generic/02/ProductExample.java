public class ProductExample{
	public static void main(String[] arg){
		Product<TV, String> product1 = new Product<>();
		product1.setKind(new TV());
		product1.setModel("½º¸¶Æ® tv");
		TV tv = product1.getKind();
		String tvModel = product1.getModel();
		System.out.println(tv.getTv());
		System.out.println(tvModel);

		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car("yellow",36));
		product2.setModel("very fast Car");
		Car car = product2.getKind();
		String myModel = product2.getModel();
		
		System.out.println(car.getColor());
		System.out.println(car.getHighSpeed());
		System.out.println(myModel);

	}
}