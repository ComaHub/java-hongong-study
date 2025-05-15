package main.class03;

public class ComputerEx {	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Computer computer = new Computer();
		
		int r = 10;
		
		System.out.println("원의 면적: " + calculator.areaCircle(r));
		System.out.println();
		System.out.println("원의 면적: " + computer.areaCircle(r));
	}
}
