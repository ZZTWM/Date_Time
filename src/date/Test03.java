package date;

import java.util.Date;
/**
 * ��ǰ���ں�����
 * @author Administrator
 * 
 */
public class Test03 {
	public static void main(String[] args) {
		Date date = new Date();
		//��ǰ���ڵĺ�����
		System.out.println("Date.getTime() \t\t\t����ֵ: " + date.getTime());
		//ͨ��System.currentTimeMillis()��ȡ��ǰ���ڵĺ�����
		System.out.println("System.currentTimeMillis() \t����ֵ: " + System.currentTimeMillis());
	}
}
