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
			_hour = 24;
			_minute = 24;
	}
	
	public void setTime(int Hour, int Minute) {
		_hour = Hour;
		_minute = Minute; 
	}

	public int getYear() {
		return _year;
	}
	
	public int getMonth() {
		return _month;
	}
	
	public int getDay() {
		return _day;
	}
	
	public int getHour() {
		return _hour;
	}
	
	public int getMinute() {
		return _minute;
	}
	
	public String getLenght(int state, Date deadLine) {
		if(state == 0) {
			Integer retVal = deadLine._year-_year;
			return retVal.toString();
		}
		if(state == 1) {
			Integer year = deadLine._year-_year;
			Integer month = deadLine._month-_month;
			if(month<0) {
				year -= 1;
				month += 12; 
			}
			return year.toString() + "," + month.toString();
		}
		if(state == 2) {
			Integer year = deadLine._year-_year;
			Integer month = deadLine._month-_month;
			if(month<0) {
				year -= 1;
				month += 12; 
			}
			Integer day = deadLine._day-_day;
		}
		return null;
		
	}
	
	
	
	@Override
	public int compareTo(Date o) {
		if(_year<o._year) {
			return 1;
		}else if(_year>o._year) {
			return -1;
		}else if(_month<o._month) {
			return 1;
		}else if(_month>o._month) {
			return -1;
		}else if(_day<o._day) {
			return 1;
		}else if(_day>o._day) {
			return -1;
		}else if(_hour>o._hour) {
			return 1;
		}else if(_hour<o._hour) {
			return -1;
		}else if(_minute>o._minute){
			return 1;
		}else if(_minute<o._minute) {
			return -1;
		}
		else {
		return 0;
		}
		}
	

	
	

	}

	

