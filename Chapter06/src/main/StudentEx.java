package main;

public class StudentEx {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체 참조");
		
		Student s2 = new Student();
		System.out.println("s2 변수는 또 다른 Student 객체 참조");
	}
}
