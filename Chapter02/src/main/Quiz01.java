package main;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		String inputName = scanner.nextLine();
		
		System.out.print("2. 주민번호 앞 6자리: ");
		String inputCode = scanner.nextLine();
		
		System.out.print("3. 전화번호: ");
	  String inputPhone = scanner.nextLine();
	  
	  System.out.println("[입력된 내용]");
	  System.out.printf("1. 이름: %s\n2. 주민번호 앞 6자리: %s\n3. 전화번호: %s", inputName, inputCode, inputPhone);
	}
}
