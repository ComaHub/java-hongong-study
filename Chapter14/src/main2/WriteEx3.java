package main2;

import java.io.FileWriter;
import java.io.Writer;

public class WriteEx3 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("D:/Stream/test9.txt");
		
		char[] charArr = {'A', 'B', 'C', 'D', 'E', 'F'};
		
		writer.write(charArr, 1, 3);
		
		writer.flush();
		writer.close();
	}
}
