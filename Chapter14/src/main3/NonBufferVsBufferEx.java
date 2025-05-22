package main3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class NonBufferVsBufferEx {
	static int data = -1;
	
	public static long copy(InputStream inputStream, OutputStream outputStream) throws Exception {
		long startTime = System.nanoTime();
		
		while (true) {
			data = inputStream.read();
			if (data == -1) break;
			
			outputStream.write(data);
		}
		
		outputStream.flush();
		long endTime = System.nanoTime();
		
		return endTime - startTime;
	}
	
	public static void main(String[] args) throws Exception {
		String originalFilePath1 = NonBufferVsBufferEx.class.getResource("originalFile1.png").getPath();
		String targetFilePath1 = "D:/Stream/targetFile1.jpg";
		
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		String originalFilePath2 = NonBufferVsBufferEx.class.getResource("originalFile2.png").getPath();
		String targetFilePath2 = "D:/Stream/targetFile2.jpg";
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(originalFilePath2));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetFilePath2));
		
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼를 사용하지 않았을 때: " + nonBufferTime + "ns");
		
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼를 사용했을 때: " + bufferTime + "ns");
		
		fis.close();
		fos.close();
		
		bis.close();
		bos.close();
	}
}
