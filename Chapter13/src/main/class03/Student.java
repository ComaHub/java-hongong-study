package main.class03;

class Student {
	public int studentNo;
	public String name;
	
	public Student(int studentNo, String name) {
		this.studentNo = studentNo;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student student) {
			return (studentNo == student.studentNo) && (name.equals(student.name));
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return studentNo + name.hashCode();
	}
}
