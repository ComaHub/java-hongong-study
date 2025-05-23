package main.class03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("정윤희", 85);
		map.put("정북희", 90);
		map.put("청운종", 80);
		map.put("정북희", 95);
		System.out.println("총 Entry 수: " + map.size());
		
		System.out.println("정북희: " + map.get("정북희"));
		System.out.println();
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + ": " + value);
		}
		System.out.println();
		
		map.remove("정북희");
		System.out.println("총 Entry 수: " + map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + ": " + value);
		}
		System.out.println();
		
		map.clear();
		System.out.println("총 Entry 수: " + map.size());
		
	}
}
