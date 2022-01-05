public class CompareMethodExample{
	public static void main(String[] args){
		Pair<Integer, String> p1 = new Pair<Integer, String>(1,"apple");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1,"apple");
		boolean result1 = Util.<Integer, String>compare(p1, p2);
		if(result1)
			System.out.println("They are equal objects...");
		else
			System.out.println("They are diffrent Objects,,,,");

		Pair<Integer, String> p3 = new Pair<Integer, String>(3,"grape");
		Pair<Integer, String> p4= new Pair<Integer, String>(5,"grape");
		boolean result2 = Util.compare(p3, p4);
		if(result2)
			System.out.println("They are equal objects...");
		else
			System.out.println("They are diffrent Objects,,,,");

	}
}