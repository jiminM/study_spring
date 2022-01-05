public class UtilExample{
	public static void main(String[] args){
		Pair<String, Integer> pair = new Pair<>("Hong", 35);
		Integer age = Util.getValue(pair,"Hong");
		System.out.println(age);
	
	}	
}