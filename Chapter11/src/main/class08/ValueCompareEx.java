package main.class08;

public class ValueCompareEx {
	public static void main(String[] args) {
		System.out.println("[-128 ~ 127 초과값의 경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		
		System.out.println("== 결과: " + (obj1 == obj2));
		System.out.println("Unboxing 후...\n== 결과: " + (obj1.intValue() == obj2.intValue()));
		System.out.println("equals() 결과: " + obj1.equals(obj2));
		
		System.out.println();
		
		System.out.println("[-128 ~ 127 내의 값의 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		
		System.out.println("== 결과: " + (obj3 == obj4));
		System.out.println("Unboxing 후...\n== 결과: " + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals() 결과: " + obj3.equals(obj4));
	}
}
