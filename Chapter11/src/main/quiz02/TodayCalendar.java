package main.quiz02;

import java.util.Calendar;

public class TodayCalendar {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		
		switch (week) {
			case Calendar.MONDAY:
				strWeek = "월";
				break;
				
			case Calendar.TUESDAY:
				strWeek = "화";
				break;
				
			case Calendar.WEDNESDAY:
				strWeek = "수";
				break;
				
			case Calendar.THURSDAY:
				strWeek = "목";
				break;
				
			case Calendar.FRIDAY:
				strWeek = "금";
				break;
				
			case Calendar.SATURDAY:
				strWeek = "토";
				break;
				
			case Calendar.SUNDAY:
				strWeek = "일";
				break;
		}
		
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		
		System.out.printf("%d년 %d월 %d일 %s요일 %d시 %d분", year, month, day, strWeek, hour, minute);
	}
}
