package main.class02;

public class StudentEx {
	public static void main(String[] args) {
		Student student = new Student("유니", "123456-2345678", 1);
		System.out.println("name: " + student.name);
		System.out.println("ssn: " + student.ssn);
		System.out.println("studentNo: " + student.studentNo);
	}
}
