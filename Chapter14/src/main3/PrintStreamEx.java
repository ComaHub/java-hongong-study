package main3;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamEx {
	public static void main(String[] args) throws Exception {
		PrintStream printStream = new PrintStream(new FileOutputStream("D:/Stream/printstream.txt"));
		
		printStream.println("[프린터 보조 스트림]");
		printStream.print("마치 ");
		printStream.println("프린터로 출력을 하는 것처럼");
		printStream.println("데이터를 출력합니다.");
		
		printStream.flush();
		printStream.close();
	}
}
