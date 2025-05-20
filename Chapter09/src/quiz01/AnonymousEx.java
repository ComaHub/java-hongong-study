package quiz01;

public class AnonymousEx {
	public static void main(String[] args) {
		Anonymous anonymous = new Anonymous();
		anonymous.field.start();
		anonymous.method1();
		anonymous.method2(new Worker() {
			@Override
			public void start() {
				System.out.println("테스트를 합니다.");
			}
		});
	}
}
