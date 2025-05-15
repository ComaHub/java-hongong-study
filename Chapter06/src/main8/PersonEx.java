package main8;

public class PersonEx {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "GilDong");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "USA"; => Error!
//		p1.ssn = "654321-7654321"; => Error!
		p1.name = "MongRyong";
	}
}
