package main.class07;

public class StringLengthEx {
	public static void main(String[] args) {
		String ssn = "0305034112754";
		int length = ssn.length();
		
		if (length == 13) {
			System.out.println("자리수가 맞습니다.");
		} else {
			System.out.println("자리수가 다릅니다.");
		}
	}
}
