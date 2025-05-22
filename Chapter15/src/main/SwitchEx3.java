package main;

public class SwitchEx3 {
	public static void main(String[] args) {
		String s = null;
		
		switch (s) {
			case "a", "b" -> System.out.println("A or B");
			
			case "c" -> System.out.println("C");
			
			case null, default -> System.out.println("Unknown");
		}
	}
}
