package main.class03;

import java.util.Date;

public class ToStringEx {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString()); // => Date Class가 toString()을 overriding
	}
}
