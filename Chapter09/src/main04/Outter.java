package main04;

public class Outter {
	String field = "Outter-Field";
	
	class Nested {
		String field = "Nested-Field";
		
		void method() {
			System.out.println("Nested-Method");
		}
		
		void print() {
			System.out.println(this.field);
			this.method();
			
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
	
	void method() {
		System.out.println("Outter-Method");
	}
}
