package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 从控制台输入一个日期字符串：例如：1993-03-27，然后计算距离至今多长时间
 * @author Administrator
 *
 */
public class Exercise01 {
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入日期,(例如1993-03-27):");
		String strInputDate = scan.nextLine();
		//日期正则：1993-03-27、1993-03-1、1993-3-27、1993-3-1
		String regx = "\\d{4}+[-]\\d{1,2}+[-]\\d{1,2}+";
		if (strInputDate.matches(regx)){
			try {
				Date date = sdf.parse(strInputDate);//将输入的字符串日期转为Date类型
				Date now = new Date();
				long millionSecond = now.getTime() - date.getTime();//计算输入的日期距今的时间毫秒数
				//System.out.println(millionSecond);
				long second = millionSecond / 1000;
				long minute = second / 60;
				long hour = minute / 60;
				long day = hour / 24;
				String[] strYearMonthDayArray = strInputDate.split("-\\s*");//将输入的日期拆分成数组
				//System.out.println(strYearMonthDayArray[0]);
				Integer birthIntegerYear = Integer.parseInt(strYearMonthDayArray[0]);//获取数组第一个元素，也就是年
				//System.out.println(birthYear instanceof Integer);
				int birthIntYear = birthIntegerYear.intValue();//将年转为int类型
				//System.out.println(birthIntegerYear + 1);
				//System.out.println(birthIntYear + 1);
				
				Calendar c = Calendar.getInstance();
				//System.out.println(c.get(Calendar.YEAR));
				//System.out.println(c.get(Calendar.YEAR) + 1);
				int nowYear = c.get(Calendar.YEAR);//获取当前的年份
				int[] yearArray = new int[(nowYear-birthIntYear) + 1];//设置年份数组的长度，长度为当今年份-出生年份 + 1
				for (int i = 0,temp = 1993; i < yearArray.length; i++,temp ++) {
					yearArray[i] = temp;//为数组赋值：1993、1994、1995...2018、2019
				}
				/**
				 * 判断是否为润年
				 */
				int count = 0;
				for (int i = 0; i < yearArray.length; i++) {
					
					if((0 == yearArray[i]%4 && 0!= yearArray[i]%100)||(0 == yearArray[i]%400)){
						count ++;
					}
				}
				//System.out.println(count);闰年数
				
				long year = nowYear - birthIntYear;//活的年数
				System.out.println("您出生于" + strInputDate + ",迄今为止，您一共活了：" + year + "年,折合："+ day + "天," + hour + "小时," + minute + "分钟," + second + "秒");
			} catch (ParseException e) {
				
				e.printStackTrace();
			}
		}else{
			
			System.out.println("日期输入错误！请输入正确的日期，例如：1993-03-27");
		}
	}
	
	
}
