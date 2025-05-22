package quiz;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberEx {
	public static void main(String[] args) throws Exception {
		String filePath = "src/quiz/AddLineNumberEx.java";
		BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
		
		int lineCount = 1;
		while (true) {
			String line = bufferedReader.readLine();
			if (line == null) break;
			
			System.out.println(lineCount++ + ": " + line);
		}
		
		bufferedReader.close();
	}
}
