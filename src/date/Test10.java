package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ��ϰ��Calendar
 * �ҳ��¸��µĵ�����3��������
 * @author Administrator
 *
 */
public class Test10 {
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println("�����ǣ�" + format(c.getTime()));
		
		//�ȷ������¸���
		c.add(Calendar.MONTH, 2);
		//�����³�
		c.set(Calendar.DATE, 1);
		c.add(Calendar.DATE, -3);
		System.out.println("�¸��µ�����������:" + format(c.getTime()));
	}

	private static String format(Date time) {
		return sdf.format(time);
	}

}
