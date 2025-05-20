package main.class05;

public class ClassEx {
	public static void main(String[] args) throws ClassNotFoundException {
		Class class1 = Car.class;
		
		System.out.println(class1.getName());
		System.out.println(class1.getSimpleName());
		System.out.println(class1.getPackage().getName());
		
		Class class2 = Class.forName("main.class05.Car");
		
		System.out.println(class2.getName());
		System.out.println(class2.getSimpleName());
		System.out.println(class2.getPackage().getName());
		
		Car car = new Car();
		Class class3 = car.getClass();
		
		System.out.println(class3.getName());
		System.out.println(class3.getSimpleName());
		System.out.println(class3.getPackage().getName());
	}
}
