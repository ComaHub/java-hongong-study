package main;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadEx2 {
	public static void main(String[] args) throws Exception {
		InputStream inputStream = new FileInputStream("D:/Stream/test2.db");
		
		byte[] buffer = new byte[100];
		while (true) {
			int readByteNum = inputStream.read(buffer);
			if (readByteNum == -1) break;
			
			for (int i = 0; i < readByteNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		
		inputStream.close();
	}
}
