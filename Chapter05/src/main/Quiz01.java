package main;

public class Quiz01 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for (int i : array) {
			if (i > max) max = i;
		}
		
		System.out.println("max = " + max);
	}
}
