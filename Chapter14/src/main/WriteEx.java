package main;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteEx {
	public static void main(String[] args) throws Exception {
		OutputStream outputStream = new FileOutputStream("D:/Stream/test1.db");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		outputStream.write(a);
		outputStream.write(b);
		outputStream.write(c);
		
		outputStream.flush();
		outputStream.close();
	}
}
