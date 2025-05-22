package main2;

import java.io.FileReader;
import java.io.Reader;

public class ReadEx3 {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("D:/Stream/test9.txt");
		
		char[] buffer = new char[5];
		
		int readCharNum = reader.read(buffer, 2, 3);
		if (readCharNum != -1) {
			for (int i = 0; i < buffer.length; i++) {
				System.out.println((char) buffer[i]);
			}
		}
		
		reader.close();
	}
}
