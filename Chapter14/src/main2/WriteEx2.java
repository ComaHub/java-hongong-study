package main2;

import java.io.FileWriter;
import java.io.Writer;

public class WriteEx2 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("D:/Stream/test8.txt");
		
		char[] charArr = {'A', 'B', 'C'};
		
		writer.write(charArr);
		
		writer.flush();
		writer.close();
	}
}
