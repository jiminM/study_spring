package sec06.exam02_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		//queue는 인터페이스, Queue의 구현객체로 LinkedList 선언
		messageQueue.offer(new Message("sendMail","Lynn"));
		messageQueue.offer(new Message("sendSMS","Shin"));
		messageQueue.offer(new Message("sendKakao","Thick"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println("To."+message.to+" mail");
				break;
			case "sendSMS":
				System.out.println("To."+message.to+" SMS");
				break;
			case "sendKakao":
				System.out.println("To."+message.to+" Talk");
				break;
			}
		}
	}
}
