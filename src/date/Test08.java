package date;

import java.util.Calendar;
import java.util.Date;

/**
 * Calendar��Date����ת��
 * ���õ���ģʽ��ȡ��������Calendar.getInstance();
 * @author Administrator
 *
 */
public class Test08 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		//ͨ����������õ����ڶ���
		Date d = c.getTime();
		
		Date d2 = new Date(0);
		c.setTime(d2);
		System.out.println(c);//java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=19,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=8,HOUR_OF_DAY=8,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=28800000,DST_OFFSET=0]
		System.out.println(c.getTime());//Thu Jan 01 08:00:00 CST 1970
	}
}
