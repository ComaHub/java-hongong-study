package main.class03;

public class PrintThread2 extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("실행 중...");
			
			if (Thread.interrupted()) break;
		}
		
		System.out.println("자원 정리 중...");
		System.out.println("실행 종료");
	}
}
