package main.class01;

public class MemberEx {
	public static void main(String[] args) {
		Member obj1 = new Member("Blue");
		Member obj2 = new Member("Blue");
		Member obj3 = new Member("Red");
		
		if (obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		}
		
		if (obj1.equals(obj3)) {
			System.out.println("obj1과 obj3은 동등합니다.");
		}
	}
}
