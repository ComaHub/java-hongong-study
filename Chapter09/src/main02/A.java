package main02;

public class A {
	B field1 = new B();
	C field2 = new C();
	
//	static B field3 = new B(); => Error!
	static C field4 = new C();
	
	class B {}
	static class C {}
	
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	static void method2() {
//		B var1 = new B(); => Error!
		C var2 = new C();
	}
}
