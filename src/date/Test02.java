package date;

import java.util.Date;

/**
 * getTime
 * 	getTime() �õ�һ��long�͵�����
 * 	����������� ��1970.1.1 08:00:00:000 ��ʼ ÿ����һ���룬����1
 * @author Administrator
 *
 */
public class Test02 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());//Wed Aug 28 16:25:05 CST 2019
		System.out.println(date);//Wed Aug 28 16:25:05 CST 2019
		
        //getTime() �õ�һ��long�͵�����
        //����������� 1970.1.1 08:00:00:000��ÿ����һ���룬����1
		System.out.println("��ǰʱ��getTime()���ص�ֵ�ǣ�" + date.getTime());
		
		Date zero = new Date(0);
		System.out.println("��0��Ϊ���췽�����õ���������:" + zero);//Thu Jan 01 08:00:00 CST 1970
		System.out.println(zero.toString());//Thu Jan 01 08:00:00 CST 1970
		System.out.println("ʱ��ԭ��getTime()����ֵ�ǣ�" + zero.getTime());//0
	}
}
