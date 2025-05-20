package main.class04;

public class SystemTimeEx {
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		int sum = 0;
		for (int i = 1; i <= 1000000; i++) {
			sum += i;
		}
		
		long endTime = System.nanoTime();
		
		System.out.println("1 ~ 1,000,000 까지의 합: " + sum);
		System.out.println("소요 시간: " + (endTime - startTime));
	}
}
