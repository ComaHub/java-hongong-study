package main;

import java.util.Date;

public class SwitchEx4 {
	public static void main(String[] args) {
		method(10);
		method("10");
		method(null);
		method(new Date());
	}
	
	public static void method(Object obj) {
		switch (obj) {
			case Integer i -> System.out.println("Integer" + i);
			
			case String s -> System.out.println("String" + s);
			
			case null, default -> System.out.println("Unknown");
		}
	}
}
