package storge;

import java.util.Comparator;

public class Date implements Comparable<Date>{
	
	private int _year;
	private int _month;
	private int _day;
	private int _hour;
	private int _minute;
	
	
/*	private final int MAXIMUM_MONTH = 12;
	private final int MINIMUM_MONTH = 1;
	private final int MAXIMUM_DAY = 31;
	private final int MINIMUM_DAY = 1;
	private final int MAXIMUM_HOUR = 24;
	private final int MINIMUM_HOUR = 0;
	private final int MAXIMUM_MINUTE = 60;
	private final int MINIMUM_MINUTE = 0;
	private final int MINIMUM_YEAR = 2000;
*/

	
	public Date(int Year, int Month, int Day) {
			_year = Year;
			_month = Month;
			_day = Day;
			_hour = 0;
			_minute = 0;
	}
	
	public void setTime(int Hour, int Minute) {
		_hour = Hour;
		_minute = Minute; 
	}

	public int getYear() {
		return _year;
	}
	
	@Override
	public int compareTo(Date o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	

	}

	

