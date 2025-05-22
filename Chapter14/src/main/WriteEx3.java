package main;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteEx3 {
	public static void main(String[] args) throws Exception {
		OutputStream outputStream = new FileOutputStream("D:/Stream/test3.db");
		
		byte[] byteArr = {10, 20, 30, 40, 50};
		
		outputStream.write(byteArr, 1, 3);
		
		outputStream.flush();
		outputStream.close();
	}
}
