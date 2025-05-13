package main;

public class BreakEx {
	public static void main(String[] args) {
		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num + "번이 나왔습니다.");
			
			if (num == 6) break;
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
}
