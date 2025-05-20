package main.class03;

public class SmartPhoneEx {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("Apple", "iPhone 15 Pro");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		System.out.println(myPhone);
	}
}
