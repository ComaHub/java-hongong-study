package main3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamEx {
	public static void write(String str) throws Exception {
		Writer writer = new OutputStreamWriter(new FileOutputStream("D:/Stream/test001.txt"));
		
		writer.write(str);
		
		writer.flush();
		writer.close();
	}
	
	public static String read() throws Exception {
		Reader reader = new InputStreamReader(new FileInputStream("D:/Stream/test001.txt"));
		
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer);
		String data = new String(buffer, 0, readCharNum);
		
		reader.close();
		return data;
	}
	
	public static void main(String[] args) throws Exception {
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
	}
}
