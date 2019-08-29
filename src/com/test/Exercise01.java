package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * �ӿ���̨����һ�������ַ��������磺1993-03-27��Ȼ������������೤ʱ��
 * @author Administrator
 *
 */
public class Exercise01 {
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("����������,(����1993-03-27):");
		String strInputDate = scan.nextLine();
		//��������1993-03-27��1993-03-1��1993-3-27��1993-3-1
		String regx = "\\d{4}+[-]\\d{1,2}+[-]\\d{1,2}+";
		if (strInputDate.matches(regx)){
			try {
				Date date = sdf.parse(strInputDate);//��������ַ�������תΪDate����
				Date now = new Date();
				long millionSecond = now.getTime() - date.getTime();//������������ھ���ʱ�������
				//System.out.println(millionSecond);
				long second = millionSecond / 1000;
				long minute = second / 60;
				long hour = minute / 60;
				long day = hour / 24;
				String[] strYearMonthDayArray = strInputDate.split("-\\s*");//����������ڲ�ֳ�����
				//System.out.println(strYearMonthDayArray[0]);
				Integer birthIntegerYear = Integer.parseInt(strYearMonthDayArray[0]);//��ȡ�����һ��Ԫ�أ�Ҳ������
				//System.out.println(birthYear instanceof Integer);
				int birthIntYear = birthIntegerYear.intValue();//����תΪint����
				//System.out.println(birthIntegerYear + 1);
				//System.out.println(birthIntYear + 1);
				
				Calendar c = Calendar.getInstance();
				//System.out.println(c.get(Calendar.YEAR));
				//System.out.println(c.get(Calendar.YEAR) + 1);
				int nowYear = c.get(Calendar.YEAR);//��ȡ��ǰ�����
				int[] yearArray = new int[(nowYear-birthIntYear) + 1];//�����������ĳ��ȣ�����Ϊ�������-������� + 1
				for (int i = 0,temp = 1993; i < yearArray.length; i++,temp ++) {
					yearArray[i] = temp;//Ϊ���鸳ֵ��1993��1994��1995...2018��2019
				}
				/**
				 * �ж��Ƿ�Ϊ����
				 */
				int count = 0;
				for (int i = 0; i < yearArray.length; i++) {
					
					if((0 == yearArray[i]%4 && 0!= yearArray[i]%100)||(0 == yearArray[i]%400)){
						count ++;
					}
				}
				//System.out.println(count);������
				
				long year = nowYear - birthIntYear;//�������
				System.out.println("��������" + strInputDate + ",����Ϊֹ����һ�����ˣ�" + year + "��,�ۺϣ�"+ day + "��," + hour + "Сʱ," + minute + "����," + second + "��");
			} catch (ParseException e) {
				
				e.printStackTrace();
			}
		}else{
			
			System.out.println("�������������������ȷ�����ڣ����磺1993-03-27");
		}
	}
	
	
}
