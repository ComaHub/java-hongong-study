package main.quiz02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TodayDate {
	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
		System.out.println(sdf.format(today));
	}
}
