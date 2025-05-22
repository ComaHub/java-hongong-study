package main;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadEx3 {
	public static void main(String[] args) throws Exception {
		InputStream inputStream = new FileInputStream("D:/Stream/test3.db");
		
		byte[] buffer = new byte[5];
		
		int readByteNum = inputStream.read(buffer, 2, 3);
		if (readByteNum != -1) {
			for (int i = 0; i < buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		
		inputStream.close();
	}
}
