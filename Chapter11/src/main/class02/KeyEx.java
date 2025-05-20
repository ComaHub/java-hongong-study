package main.class02;

import java.util.HashMap;

public class KeyEx {
	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		hashMap.put(new Key(1), "정윤희");
		
		String value = hashMap.get(new Key(1));
		System.out.println(value); // => equals를 재정의해서 비교시 true가 나오지만 근본적으로 다른 객체라 hashCode가 서로 다름
	}
}
