package main.class07;

public class StringSubstringEx {
	public static void main(String[] args) {
		String ssn = "030503-4112754";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}
}
