package main5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GetLineStringFromKeyboard {
	public static void main(String[] args) throws Exception {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			System.out.print("입력하세요: ");
			String line = bufferedReader.readLine();
			if ("Q".equalsIgnoreCase(line) || "Quit".equalsIgnoreCase(line)) break;
			
			System.out.println("입력한 내용: " + line);
		}
		
		bufferedReader.close();
	}
}
