package main.class06;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "정윤희"));
		messageQueue.offer(new Message("sendSMS", "정리코"));
		messageQueue.offer(new Message("sendLine", "정타비"));
		
		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			
			switch (message.command) {
				case "sendMail":
					System.out.println(message.to + "님에게 메일을 보냅니다.");
					break;
					
				case "sendSMS":
					System.out.println(message.to + "님에게 SMS을 보냅니다.");
					break;
					
				case "sendLine":
					System.out.println(message.to + "님에게 라인을 보냅니다.");
					break;
			}
		}
	}
}
