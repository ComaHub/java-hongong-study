package main.class10;

import java.util.Calendar;

public class CalendarEx {
	public static void main(String[] args) {
		Calendar myCale = Calendar.getInstance();
		
		int year = myCale.get(Calendar.YEAR);
		int month = myCale.get(Calendar.MONTH) + 1;
		int day = myCale.get(Calendar.DAY_OF_MONTH);
		int week = myCale.get(Calendar.DAY_OF_WEEK);
		
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
		
		int amPm = myCale.get(Calendar.AM_PM);
		String strAmPm = null;
		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		int hour = myCale.get(Calendar.HOUR);
		int minute = myCale.get(Calendar.MINUTE);
		int second = myCale.get(Calendar.SECOND);
		
		System.out.print(year + "년 " + month + "월 " + day + "일\n" + strWeek + "요일 " + strAmPm + "\n" + hour + "시 " + minute + "분 " + second + "초");
	}
}
