package main01;

class A {
	A() {
		System.out.println("A 객체 생성");
	}
	
	class B { // instance member class
		int field1;
		
		B() {
			System.out.println("B 객체 생성");
		}
		
		void method1() {}
	}
	
	static class C { // static member class
		int field1;
		static int field2;
		
		C() {
			System.out.println("C 객체 생성");
		}
		
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		class D { // local class
			int field1;
			
			D() {
				System.out.println("D 객체 생성");
			}
			
			void method1() {}
		}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
