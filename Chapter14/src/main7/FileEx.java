package main7;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx {
	public static void main(String[] args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		
		File dir = new File("D:/Stream/images");
		File file1 = new File("D:/Stream/file1.txt");
		File file2 = new File("D:/Stream/file2.txt");
		File file3 = new File("D:/Stream/file3.txt");
		
		if (!dir.exists()) dir.mkdirs();
		if (!file1.exists()) file1.createNewFile();
		if (!file2.exists()) file2.createNewFile();
		if (!file3.exists()) file3.createNewFile();
		
		File stream = new File("D:/Stream");
		File[] contents = stream.listFiles();
		
		System.out.println("시간\t\t\t형태\t\t크기\t이름");
		System.out.println("---------------------------------------------------------------------");
		
		for (File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			
			if (file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName());
			} else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
			}
			
			System.out.println();
		}
	}
}
