package main.class05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("유니", 96);
		map.put("나나", 86);
		map.put("히나", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
		
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			String keyName = entry.getKey();
			Integer value = entry.getValue();
			
			totalScore += value;
			if (value > maxScore) {
				name = keyName;
				maxScore = value;
			}
		}
		
		System.out.println("평균 점수: " + (totalScore / map.size()));
		System.out.println("최고 점수: " + maxScore);
		System.out.println("최고 점수를 받은 사람: " + name);
	}
}
