package main;

public class BreakOutterEx {
	public static void main(String[] args) {
		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + " - " + lower);
				
				if (lower == 'g') break Outter;
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
}
