package main.class03;

public class PrintThread1 extends Thread {
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		while (!stop) {
			System.out.println("실행 중...");
		}
		
		System.out.println("자원 정리 중...");
		System.out.println("실행 종료");
	}
}
