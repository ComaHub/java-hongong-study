package main.class06;

public class Car {
	public int speed;
	
	public void speedUp() {
		speed++;
	}
	
	public final void stop() {
		System.out.println("차를 멈춥니다.");
		speed = 0;
	}
}
