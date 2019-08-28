package date;

import java.util.Date;

/**
 * ���������������һ����1995.1.1 00:00:00 �� 1995.12.31 23:59:59 ֮����������
 * @author Administrator
 *
 */
public class Test04 {
	public static void main(String[] args) {
		long second = 1000;
		long minute = 60*second;
		long hour = minute * 60;
		long day = hour *24;
		long year = day * 365;
		long year1995Start = (1995 -1970)*year;
		long leapDay = (1995-1970)/4*day; //ÿ��4����һ������
		year1995Start = year1995Start + leapDay;
		long eightHour = hour * 8;
		year1995Start = year1995Start - eightHour;//8��Сʱ�ĺ���������Ϊ��0�����Ӧ����1970.1.1 08:00:00
		
		Date dStart = new Date(year1995Start);
		System.out.println("1995���һ�죺" + dStart);
		long year1995End = year1995Start + year -1000;
		Date dEnd = new Date(year1995End);
		System.out.println("1995�����һ�죺" + dEnd);
		
		long randomTime = (long) (Math.random()*(year - 1000) + year1995Start);
		Date dRandom = new Date(randomTime);
		System.out.println("1995����һ���е������һ��ʱ�䣺" + dRandom);
	}
	
}