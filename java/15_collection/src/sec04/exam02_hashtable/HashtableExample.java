package sec04.exam02_hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {

	public static void main(String[] args) {
		
		Map<String, String> map = new Hashtable<String, String>();
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("put in id and password");
			System.out.println("id: ");
			String id = scanner.nextLine();
			System.out.println("password: ");
			String password = scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("logined..");;
					break;
				}else {
					System.out.println("wrong password");
				}
			}else {
				System.out.println("id is not exist");
			}
			
		}
		
	}

}
