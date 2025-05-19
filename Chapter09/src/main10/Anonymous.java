package main10;

public class Anonymous {
	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
//		arg1 = 20; => Error! final로 선언됨
//		arg2 = 20; => 값을 변경하면 자동으로 final을 부여할 수 없음
		
//		var1 = 30; => Error! final로 선언됨
//		var2 = 30; => 값을 변경하면 자동으로 final을 부여할 수 없음
		
		Calculatable calc = new Calculatable() {
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		
		System.out.println(calc.sum());
	}
}
