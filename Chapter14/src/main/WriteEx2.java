package main;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteEx2 {
	public static void main(String[] args) throws Exception {
		OutputStream outputStream = new FileOutputStream("D:/Stream/test2.db");
		
		byte[] byteArr = {10, 20, 30};
		
		outputStream.write(byteArr);
		
		outputStream.flush();
		outputStream.close();
	}
}
