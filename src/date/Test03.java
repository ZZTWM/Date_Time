package date;

import java.util.Date;
/**
 * 当前日期毫秒数
 * @author Administrator
 * 
 */
public class Test03 {
	public static void main(String[] args) {
		Date date = new Date();
		//当前日期的毫秒数
		System.out.println("Date.getTime() \t\t\t返回值: " + date.getTime());
		//通过System.currentTimeMillis()获取当前日期的毫秒数
		System.out.println("System.currentTimeMillis() \t返回值: " + System.currentTimeMillis());
	}
}
