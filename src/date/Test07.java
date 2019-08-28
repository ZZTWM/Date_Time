package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 准备一个长度是9的日期数组
 *  使用1970年-2000年之间的随机日期初始化该数组
 *  按照这些日期的时间进行升序排序
 *  比如 1988-1-21 12:33:22 就会排在 1978-4-21 19:07:23 前面，因为它的时间更小，虽然日期更大
 * @author Administrator
 *
 */
public class Test07 {
    public static void main(String[] args) {
        int yearStart = 1970;
        int yearEnd = 2000;
 
        Date[] ds = new Date[9];
        for (int i = 0; i < ds.length; i++) {
            ds[i] = getRandomDate(yearStart, yearEnd);
        }
         
        System.out.println("得到的随机日期数组:");
        for (int i = 0; i < ds.length; i++) {
            System.out.print(toString(ds[i])+"\t");
            if(2==i%3)
                System.out.println();
        }
         
        //选择法排序
        for (int j = 0; j < ds.length-1; j++) {
            for (int i = j+1; i < ds.length; i++) {
                String strTimeI = toString(ds[i],"HHmmss");
                String strTimeJ = toString(ds[j],"HHmmss");
 
                int lTimeI = Integer.parseInt(strTimeI);
                int lTimeJ = Integer.parseInt(strTimeJ);
 
                if( lTimeI<lTimeJ  ){  
                    Date temp = ds[j];
                    ds[j] = ds[i];
                    ds[i] = temp;
                }
            }
        }      
         
        System.out.println("排序后的随机日期数组:");
        for (int i = 0; i < ds.length; i++) {
            System.out.print(toString(ds[i])+"\t");
            if(2==i%3)
                System.out.println();
        }
         
    }
 
    public static String toString(Date d) {
        return toString(d, "yyyy-MM-dd HH:mm:ss");
    }
 
    public static String toString(Date d, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(d);
    }
 
    private static Date getRandomDate(int yearStart, int yearEnd) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        try {
            Date dStart = sdf.parse(String.valueOf(yearStart)); // 1970
            Date dEnd = sdf.parse(String.valueOf(yearEnd + 1)); // 2001 不是 2000，要在2001的基础上减少以毫秒，才表示2000最后一刻
            long timeStart = dStart.getTime();
            long timeEnd = dEnd.getTime() - 1;
            long timeRandom = (long) (timeStart + Math.random() * (timeEnd - timeStart));
            return new Date(timeRandom);
 
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
 
        return null;
    }

}
