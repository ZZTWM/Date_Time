package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 练习：Calendar
 * 找出下个月的倒数第3天是哪天
 * @author Administrator
 *
 */
public class Test10 {
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println("今天是：" + format(c.getTime()));
		
		//先翻到下下个月
		c.add(Calendar.MONTH, 2);
		//设置月初
		c.set(Calendar.DATE, 1);
		c.add(Calendar.DATE, -3);
		System.out.println("下个月倒数第三天是:" + format(c.getTime()));
	}

	private static String format(Date time) {
		return sdf.format(time);
	}

}
