package date;

import java.util.Date;

/**
 * �������ڶ���
 * @author Administrator
 *
 */
public class Test01 {
	public static void main(String[] args) {
		//��ǰʱ��
		Date date1 = new Date();
		System.out.println("��ǰʱ�䣺" + date1);
		
		// ��1970��1��1�� ����8��0��0�� ��ʼ�����ĺ�����
		Date date2 = new Date(5000);
		System.out.println("��1970��1��1�� ����8��0��0�� ��ʼ�����ĺ�����:" + date2);
	}	
}	
 