package main3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamEx {
	public static void main(String[] args) throws Exception {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:/Stream/primitive.db"));
		
		dos.writeUTF("정윤희");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("정인아");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		dos.flush();
		dos.close();
		
		DataInputStream dis = new DataInputStream(new FileInputStream("D:/Stream/primitive.db"));
		
		for (int i = 0; i < 2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			
			System.out.println(name + ": " + score + " " + order);
		}
		
		dis.close();
	}
}
