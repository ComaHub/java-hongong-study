package classpack6;

import classpack5.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;
//		a.field2 = 1; => Error!
//		a.field3 = 1; => Error!
		
		a.method1();
//		a.method2(); => Error!
//		a.method3(); => Error!
	}
}
