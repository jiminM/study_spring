public class ContainerExample{
	public static void main(String[] args){
		Container<String> container1 = new Container<String>();
		container1.set("Juna");
		String str = container1.get();

		System.out.println(str);

		Container<Integer> container2 = new Container<Integer>();
		container2.set(56);
		int value = container2.get();
		System.out.println(value);
		System.out.println("=============");

		ContainerDouble<String, String> container3 = new ContainerDouble<String, String>();
		container3.set("kellly","doctor");
		String name1 = container3.getKey();
		String job = container3.getValue();

		System.out.println(name1 );
		System.out.println(job);

		ContainerDouble<String, Integer> container4 = new ContainerDouble<String, Integer>();
		container4.set("robin",36);
		String name2 = container4.getKey();
		int age = container4.getValue();

		System.out.println(name2);
		System.out.println(age);

	}
}