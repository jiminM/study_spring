public class BoxingMethodExample{
	public static void main(String[] agrs){
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);

		Box<String> box2 = Util.boxing("what is rule?");
		String strValue = box2.get();
		System.out.println(strValue);
	}
}



//-> 이게 왜 필요하고 어디에 쓰일ㄹ까