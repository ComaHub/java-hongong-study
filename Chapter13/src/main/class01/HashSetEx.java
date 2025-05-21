package main.class01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("유니");
		set.add("리제");
		set.add("부키");
		set.add("유니");
		set.add("시로");
		
		int size = set.size();
		System.out.println("총 객체 수: " + size);
		
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		
		set.remove("리제");
		set.remove("시로");
		System.out.println("총 객체 수: " + set.size());
		
		iterator = set.iterator();
		for (String element : set) {
			System.out.println(element);
		}
		
		set.clear();
		if (set.isEmpty()) System.out.println("비어 있음");
	}
}
