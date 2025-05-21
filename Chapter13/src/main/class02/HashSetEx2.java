package main.class02;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("정윤희", 4));
		set.add(new Member("정윤희", 4));
		
		System.out.println("총 객체 수: " + set.size());
	}
}
