package main.class05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1, "정윤희"));
		set.add(new Student(2, "정시로"));
		set.add(new Student(1, "정북희"));
		
		Iterator<Student> iterator = set.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + ": " + student.name);
		}
	}
}
