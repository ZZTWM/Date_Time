package date;

import java.util.Date;

/**
 * 创建日期对象
 * @author Administrator
 *
 */
public class Test01 {
	public static void main(String[] args) {
		//当前时间
		Date date1 = new Date();
		System.out.println("当前时间：" + date1);
		
		// 从1970年1月1日 早上8点0分0秒 开始经历的毫秒数
		Date date2 = new Date(5000);
		System.out.println("从1970年1月1日 早上8点0分0秒 开始经历的毫秒数:" + date2);
	}	
}	
 