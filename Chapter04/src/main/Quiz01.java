package main;

public class Quiz01 {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 != 0) continue;
			
			sum += i;
		}
		
		System.out.println(sum);
	}
}
