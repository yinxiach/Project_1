package storge;

import java.util.Comparator;

public class Date implements Comparable<Date>{
	
	/*
	 * 用来储存和计算时间的单位
	 * To save and calculate date data
	 */
	
	private int _year;
	private int _month;
	private int _day;
	private int _hour;
	private int _minute;
	
	
	
	
	/**	
	 * 	最大及最小的允许单位
	 * Maximum and minimum data allowed.
	 */ 
	/*  private final int MAXIMUM_MONTH = 12;
	 *  private final int MINIMUM_MONTH = 1;
	 *  private final int MAXIMUM_DAY = 31;
	 *  private final int MINIMUM_DAY = 1;
	 *  private final int MAXIMUM_HOUR = 24;
	 *  private final int MINIMUM_HOUR = 0;
	 *  private final int MAXIMUM_MINUTE = 60;
	 *  private final int MINIMUM_MINUTE = 0;
	 *  private final int MINIMUM_YEAR = 2000;
	 */

	/**
	 * Constructor, 用来开启“时间"单位，必须放入年，月，日三个单位，时间默认为24点，即一天的结束.
	 * 如需调整时间就需要额外Call Method setTime(int,int).
	 * Constructor, to open an "date" instance, "_hour" and "_minute" is set to 24, which is the end of a day.
	 * To change time, call method "setTime(int,int)".
	 * 
	 * @param Year 年
	 * @param Month 月
	 * @param Day 日
	 */
	
	public Date(int Year, int Month, int Day) {
			_year = Year;
			_month = Month;
			_day = Day;
			_hour = 24;
			_minute = 24;
	}
	
	/**
	 *  用来调整“时间”单位中的小时和分子单位。
	 *  如果没有相应的数据则维持原数据(该调整将体现在GUI或相应的ActionListener的Class里)。
	 *  To make change to the "_hour" and "_minute".
	 *  If there is no data than it should been set to the old one(Which will be shown in the GUI or other ActionListener Class).
	 * @param Hour
	 * @param Minute
	 */
	 
	public void setTime(int Hour, int Minute) {
		_hour = Hour;
		_minute = Minute; 
	}

	/**
	 * 获得year(年)数据
	 * @return _year
	 */

	public int getYear() {
		return _year;
	}
	
	/**
	 * 获得Month(月)数据
	 * @return _month
	 */
	public int getMonth() {
		return _month;
	}
	
	/**
	 * 获得Day(日)数据
	 * @return _day
	 */
	public int getDay() {
		return _day;
	}
	
	/**
	 * 获得Hour(小时)数据
	 * @return _hour;
	 */
	public int getHour() {
		return _hour;
	}
	
	/**
	 * 获得Minute(分钟)数据
	 * @return _Minute;
	 */
	public int getMinute() {
		return _minute;
	}
	
	/**
	 * 用来对比两个“时间”之间的长度，State代表着需要的单位。
	 * State==1代表以年为单位计算（如果月数小于10个月就为0年，如11年7月到12年2月（共7个月）记为0年，11年4月到12年2月记为1年）。
	 * State==2代表以月为单位计算（如果小于25天就记为0个月，如11年1月2号到1月20号就记为0个月，1月3号到3月2号记为2个月）。
	 * 
	 * @param state
	 * @param deadLine
	 * @return
	 */
	  
	public Double[] getLenght(int state, Date deadLine) {
		Double[] retVal = new Double[state];
		if(state == 1) {
			Integer year = deadLine._year-_year;
			if((year==0)&&(deadLine._month-_month>=10)) {
				year+=1;
			}else if(deadLine._month-_month<-2) {
				year-=1;
			}
			return retVal;
		}
		if(state == 1) {
			Integer year = deadLine._year-_year;
			Integer month = deadLine._month-_month;
			if(month<0) {
				year -= 1;
				month += 12; 
			}
			return retVal;
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

	

