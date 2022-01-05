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
		
		//tree���� �� ���� ����(���������� ��� ���� ù�� °)
		score = scores.first();
		System.out.println("The Lowest score: "+score);
		
		score = scores.last();
		System.out.println("The Highest Score: "+score);
		
		//�θ�ü�� ���� �ڽ� ��� ��� = �ٷ� �Ʒ� ����
		score = scores.lower(95);
		System.out.println("More Than Low Score: "+score);
		
		//�θ�ü�� ������ �ڽ� ��� ��� = �ٷ� �� ����
		score = scores.higher(95);
		System.out.println("More Than Low Score: "+score);
		
		//���� ���ڰ� ������ �� ���� ���
		score = scores.floor(95);
		System.out.println("equal 95 or Than Low Score: "+score);
		
		//
		score = scores.ceiling(85);
		System.out.println("equal 85 or Than Higher Score: "+score);
		
		/*
		while(!scores.isEmpty()) {
			//pollFirst() : ���� �ڽĳ�带 �ϳ��� '�� ����',��尡 ������.
			score = scores.pollFirst();
			System.out.println(score+"  (remains: "+scores.size()+")"); 
		}
		*/
		
		/*
		Iterator<Integer> iterator = scores.iterator();
		while(iterator.hasNext()) {
			int s = iterator.next();
			iterator.remove();//���Ÿ� ���
			System.out.println(s);
		}
		*/
		
		while(!scores.isEmpty()) {
			//pollLast() : ���� �ڽĳ�带 �ϳ��� '�� ����',��尡 ������.
			score = scores.pollLast();
			System.out.println(score+"  (remains: "+scores.size()+")"); 
		}
		
		
		
	}

}
