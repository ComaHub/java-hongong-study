package main8;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}
}
