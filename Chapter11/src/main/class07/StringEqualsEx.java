package main.class07;

public class StringEqualsEx {
	public static void main(String[] args) {
		String strVar1 = new String("정윤희");
		String strVar2 = "정윤희";
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1.equals(strVar2));
	}
}
