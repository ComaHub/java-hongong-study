package main03;

public class Outter {
	// Java 7 이전 => final 명시
	public void method1(final int arg) {
		final int localVar = 1;
		
//		arg = 100; => Error!
//		localVar = 100; => Error!
		
		class Inner {
			public void method() {
				int result = arg + localVar;
			}
		}
	}
	
	
	// Java 8 이후 => 자동으로 final 부여
	public void method2(int arg) {
		int localVar = 1;
		
//		arg = 100; => 값을 변경하면 자동으로 final 부여 불가 => 로컬 클래스에서 사용할 때 compile error 발생
//		localVar = 100;
		
		class Inner {
			public void method() {
				int result = arg + localVar;
			}
		}
	}
}
