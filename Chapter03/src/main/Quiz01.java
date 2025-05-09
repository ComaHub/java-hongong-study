package main;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 수: ");
		double num1 = scanner.nextDouble();
		
		System.out.print("두 번째 수: ");
		double num2 = scanner.nextDouble();
		
		if (num2 == 0) {
			System.out.println("결과: 무한대");
		} else {
			System.out.println("결과: " + (num1 / num2));
		}
	}
}
