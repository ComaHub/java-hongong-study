package main2.class01;

public class ChildEx {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
//		parent.method3(); => Error!
	}
}
