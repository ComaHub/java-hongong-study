package main;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadEx {
	public static void main(String[] args) throws Exception {
		InputStream inputStream = new FileInputStream("D:/Stream/test1.db");
		
		while (true) {
			int data = inputStream.read();
			if (data == -1) break;
			
			System.out.println(data);
		}
		
		inputStream.close();
	}
}
