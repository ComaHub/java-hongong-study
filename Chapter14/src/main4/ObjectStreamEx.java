package main4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ObjectStreamEx {
	public static void main(String[] args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		writeList();
		List<Board> list = readList();
		
		for (Board board : list) {
			System.out.println(board.getBno() + " " + board.getTitle() + " " + board.getContent() + " " + board.getWriter() + " " + sdf.format(board.getDate()));
		}
	}
	
	public static void writeList() throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/Stream/board.db"));
		List<Board> list = new ArrayList<Board>();
		
		list.add(new Board(1, "정윤희", "유니콘", "유니", new Date()));
		list.add(new Board(2, "정시로", "우주고양이", "시로", new Date()));
		list.add(new Board(3, "정리제", "뱀파이어", "리제", new Date()));
		
		oos.writeObject(list);
		oos.flush();
		oos.close();
	}
	
	public static List<Board> readList() throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/Stream/board.db"));
		
		List<Board> list = (List<Board>) ois.readObject();
		return list;
	}
}
