package main5;

public class CarEx {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if (gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if (myCar.isLeftGas()) {
			System.out.println("Gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("Gas를 주입하세요.");
		}
	}
}
