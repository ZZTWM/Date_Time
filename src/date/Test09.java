package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ������
 * @author Administrator
 *
 */
public class Test09 {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Date now = c.getTime();
		//��ǰ����
		System.out.println("��ǰ���ڣ�\t" + format(now));
		
		//�¸��µĽ���
		c.setTime(now);
		c.add(Calendar.MONTH, 1);
		System.out.println("�¸��µĽ��죺\t" + format(c.getTime()));
		
		//ȥ��Ľ���
		c.setTime(now);
		c.add(Calendar.YEAR, -1);
		System.out.println("ȥ��Ľ��죺\t" + format(c.getTime()));
		
		//�ϸ��µ�����
		c.setTime(now);
		c.add(Calendar.MONTH, -1);
		c.set(Calendar.DATE, 3);
		System.out.println("�ϸ��µĵ�����:\t" +format(c.getTime()));
	}
	
	private static String format(Date time){
		return sdf.format(time);
	}
}
