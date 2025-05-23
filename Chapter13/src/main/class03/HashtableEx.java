package main.class03;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableEx {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		Scanner scanner = new Scanner(System.in);
		
		map.put("Spring", "12");
		map.put("Summer", "123");
		map.put("Fall", "1234");
		map.put("Winter", "12345");
		
		while (true) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			
			System.out.print("아이디: ");
			String id = scanner.nextLine();
			
			System.out.print("비밀번호: ");
			String password = scanner.nextLine();
			System.out.println();
			
			if (!map.containsKey(id)) {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
				continue;
			}
			
			if (!map.get(id).equals(password)) {
				System.out.println("비밀번호가 일치하지 않습니다.");
				continue;
			}
			
			System.out.println("로그인되었습니다.");
			break;
		}
	}
}
