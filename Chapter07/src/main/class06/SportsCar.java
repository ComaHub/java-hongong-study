package main.class06;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
	
//	@Override
//	public void stop() { => Error!
//		System.out.println("스포츠카를 멈춥니다.");
//		speed = 0;
//	}
}
