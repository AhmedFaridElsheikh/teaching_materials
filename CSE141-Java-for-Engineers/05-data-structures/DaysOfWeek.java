package com.ahmed;

public class DaysOfWeek {
	enum WeekDays{ SATURDAY,
		SUNDAY,
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (WeekDays day : WeekDays.values()) {
			if(day == WeekDays.MONDAY)continue;
			else if(day == WeekDays.THURSDAY)break;
			System.out.println(day);
		}
	}

}
