package main07;

public class AnonymousEx {
	public static void main(String[] args) {
		Anonymous anonym = new Anonymous();
		
		anonym.field.wake();
		anonym.method1();
		
		anonym.method2(new Person() {
			void study() {
				System.out.println("공부합니다.");
			}
			
			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}
		});
	}
}
