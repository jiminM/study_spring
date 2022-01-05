public class BoundedTypeParameterExample{
	public static void main(String[] agrs){
		//String str = Util.compare("a","b");
		//String is not  number type
	
		int result = Util.compare(51,6);
		System.out.println(result);
		int result2 = Util.compare(46.968, 74);
		System.out.println(result2);
		int result3 = Util.compare(11.0, 11);
		System.out.println(result3);
	}
}