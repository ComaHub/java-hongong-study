package main03;

public class A {
	int field1;
	static int field2;
	
	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C {
		void method() {
//			field1 = 10; => Error!
//			method1(); => Error!
			
			field2 = 10;
			method2();
		}
	}
	
	void method1() {}
	static void method2() {}
}
