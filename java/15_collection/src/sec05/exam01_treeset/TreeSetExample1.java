package sec05.exam01_treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample1 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		Integer score = null;
		
		//tree정렬 후 가장 왼쪽(오름차순인 경우 제일 첫번 째)
		score = scores.first();
		System.out.println("The Lowest score: "+score);
		
		score = scores.last();
		System.out.println("The Highest Score: "+score);
		
		//부모객체의 왼쪽 자식 노드 출력 = 바로 아래 점수
		score = scores.lower(95);
		System.out.println("More Than Low Score: "+score);
		
		//부모객체의 오른쪽 자식 노드 출력 = 바로 위 점수
		score = scores.higher(95);
		System.out.println("More Than Low Score: "+score);
		
		//같은 숫자가 있으면 그 숫자 출력
		score = scores.floor(95);
		System.out.println("equal 95 or Than Low Score: "+score);
		
		//
		score = scores.ceiling(85);
		System.out.println("equal 85 or Than Higher Score: "+score);
		
		/*
		while(!scores.isEmpty()) {
			//pollFirst() : 왼쪽 자식노드를 하나씩 '빼 낸다',노드가 빠진다.
			score = scores.pollFirst();
			System.out.println(score+"  (remains: "+scores.size()+")"); 
		}
		*/
		
		/*
		Iterator<Integer> iterator = scores.iterator();
		while(iterator.hasNext()) {
			int s = iterator.next();
			iterator.remove();//제거를 명시
			System.out.println(s);
		}
		*/
		
		while(!scores.isEmpty()) {
			//pollLast() : 왼쪽 자식노드를 하나씩 '빼 낸다',노드가 빠진다.
			score = scores.pollLast();
			System.out.println(score+"  (remains: "+scores.size()+")"); 
		}
		
		
		
	}

}
