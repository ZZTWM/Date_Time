package date;

import java.util.Date;

/**
 * getTime
 * 	getTime() 得到一个long型的整数
 * 	这个整数代表 从1970.1.1 08:00:00:000 开始 每经历一毫秒，增加1
 * @author Administrator
 *
 */
public class Test02 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());//Wed Aug 28 16:25:05 CST 2019
		System.out.println(date);//Wed Aug 28 16:25:05 CST 2019
		
        //getTime() 得到一个long型的整数
        //这个整数代表 1970.1.1 08:00:00:000，每经历一毫秒，增加1
		System.out.println("当前时间getTime()返回的值是：" + date.getTime());
		
		Date zero = new Date(0);
		System.out.println("用0作为构造方法，得到的日期是:" + zero);//Thu Jan 01 08:00:00 CST 1970
		System.out.println(zero.toString());//Thu Jan 01 08:00:00 CST 1970
		System.out.println("时间原点getTime()返回值是：" + zero.getTime());//0
	}
}
