package main3.class01;

public class PhoneEx {
	public static void main(String[] args) {
//		Phone phone = new Phone(); => Error!
		
		SmartPhone smartPhone = new SmartPhone("아이폰");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
