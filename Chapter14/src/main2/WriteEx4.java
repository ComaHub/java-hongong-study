package main2;

import java.io.FileWriter;
import java.io.Writer;

public class WriteEx4 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("D:/Stream/test10.txt");
		
		String str = "ABC";
		
		writer.write(str);
		
		writer.flush();
		writer.close();
	}
}
