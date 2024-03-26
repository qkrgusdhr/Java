package p0326;

import java.util.Calendar;

public class LongExample {
	enum week {
		MONDAY, TUSEDAY, WEDNESSDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	};

	public static void main(String[] args) {
		week today = null;
		Calendar cal = Calendar.getInstance();
		int iweek = cal.get(Calendar.DAY_OF_WEEK);

		switch (iweek) {
		case 2: {

			today = week.MONDAY;
			break;
		}
		case 3: {
			today = week.TUSEDAY;
			break;
		}
		case 4: {
			today = week.WEDNESSDAY;
			break;
		}
		case 5: {
			today = week.THURSDAY;
			break;
		}
		case 6: {
			today = week.FRIDAY;
			break;
		}
		case 7: {
			today = week.SATURDAY;
			break;
		}
		case 1: {
			today = week.SUNDAY;
			break;
		}

		}
		System.out.println("오늘 요일 : " + today);
		if(today == week.SUNDAY) {
			System.out.println("오늘은 쉬는 날 입니다.");
		}else {
			System.out.println("오늘은 공부하는 날 입니다.");
		}
	}

}
