package main.class01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.currentTimeMillis();
		System.out.println("ArrayList의 소요 시간: " + (endTime - startTime) + " ms");
		
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.currentTimeMillis();
		System.out.println("LinkedList의 소요 시간: " + (endTime - startTime) + " ms");
	}
}
