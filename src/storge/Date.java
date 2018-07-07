package storge;

import java.util.Comparator;

public class Date implements Comparable<Date>{
	
	/*
	 * ��������ͼ���ʱ��ĵ�λ
	 * To save and calculate date data
	 */
	
	private int _year;
	private int _month;
	private int _day;
	private int _hour;
	private int _minute;
	
	
	
	
	/**	
	 * 	�����С������λ
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
	 * Constructor, ����������ʱ��"��λ����������꣬�£���������λ��ʱ��Ĭ��Ϊ24�㣬��һ��Ľ���.
	 * �������ʱ�����Ҫ����Call Method setTime(int,int).
	 * Constructor, to open an "date" instance, "_hour" and "_minute" is set to 24, which is the end of a day.
	 * To change time, call method "setTime(int,int)".
	 * 
	 * @param Year ��
	 * @param Month ��
	 * @param Day ��
	 */
	
	public Date(int Year, int Month, int Day) {
			_year = Year;
			_month = Month;
			_day = Day;
			_hour = 24;
			_minute = 24;
	}
	
	/**
	 *  ����������ʱ�䡱��λ�е�Сʱ�ͷ��ӵ�λ��
	 *  ���û����Ӧ��������ά��ԭ����(�õ�����������GUI����Ӧ��ActionListener��Class��)��
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
	 * ���year(��)����
	 * @return _year
	 */

	public int getYear() {
		return _year;
	}
	
	/**
	 * ���Month(��)����
	 * @return _month
	 */
	public int getMonth() {
		return _month;
	}
	
	/**
	 * ���Day(��)����
	 * @return _day
	 */
	public int getDay() {
		return _day;
	}
	
	/**
	 * ���Hour(Сʱ)����
	 * @return _hour;
	 */
	public int getHour() {
		return _hour;
	}
	
	/**
	 * ���Minute(����)����
	 * @return _Minute;
	 */
	public int getMinute() {
		return _minute;
	}
	
	/**
	 * �����Ա�������ʱ�䡱֮��ĳ��ȣ�State��������Ҫ�ĵ�λ��
	 * State==1��������Ϊ��λ���㣨�������С��10���¾�Ϊ0�꣬��11��7�µ�12��2�£���7���£���Ϊ0�꣬11��4�µ�12��2�¼�Ϊ1�꣩��
	 * State==2��������Ϊ��λ���㣨���С��25��ͼ�Ϊ0���£���11��1��2�ŵ�1��20�žͼ�Ϊ0���£�1��3�ŵ�3��2�ż�Ϊ2���£���
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

	

