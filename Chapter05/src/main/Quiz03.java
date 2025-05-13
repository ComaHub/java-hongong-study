package main;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		
		while (run) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-----------------------------------------------------------");
			System.out.print("선택> ");
			int selectNum = Integer.parseInt(scanner.nextLine());
			
			switch (selectNum) {
			  case 1:
			  	System.out.print("학생수> ");
			  	studentNum = Integer.parseInt(scanner.nextLine());
			  	scores = new int[studentNum];
			  	break;
			  	
			  case 2:
			  	for (int i = 0; i < studentNum; i++) {
			  		System.out.print("scores[" + i + "]> ");
			  		scores[i] = Integer.parseInt(scanner.nextLine());
			  	}
			  	break;
			  	
			  case 3:
			  	for (int i = 0; i < studentNum; i++) {
			  		System.out.println("scores[" + i + "]> " + scores[i]);
			  	}
			  	break;
			  	
			  case 4:
			  	int sum = 0;
			  	int max = 0;
			  	for (int i = 0; i < studentNum; i++) {
			  		sum += scores[i];
			  		
			  		if (scores[i] > max) max = scores[i];
			  	}
			  	
			  	double avg = (double) sum / studentNum;
			  	
			  	System.out.println("최고 점수: " + max);
			  	System.out.println("평균 점수: " + avg);
			  	break;
			  	
			  case 5:
			  	run = false;
			  	break;
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
}
