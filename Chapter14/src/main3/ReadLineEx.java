package main3;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineEx {
	public static void main(String[] args) throws Exception {
		String path = ReadLineEx.class.getResource("language.txt").getPath();
		BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
		
		while (true) {
			String data = bufferedReader.readLine();
			if (data == null) break;
			
			System.out.println(data);
		}
		
		bufferedReader.close();
	}
}
