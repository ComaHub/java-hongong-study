package main01.class01;

public class MyClassEx {
	public static void main(String[] args) {
		System.out.println("1)----------------");
		
		MyClass myClass1 = new MyClass();
		myClass1.remoteControl.turnOn();
		myClass1.remoteControl.setVolume(5);
		
		System.out.println("2)----------------");
		
		MyClass myClass2 = new MyClass(new Audio());
		
		System.out.println("3)----------------");
		
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		
		System.out.println("4)----------------");
		
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());
  }
}
