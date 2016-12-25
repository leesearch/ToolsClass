package Time;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by lsq on 12/21/16.
 */
public class DateTime {
    public static void main(String args[]) throws ParseException {
        Date d=new Date();
        System.out.println(d);

        //time format.
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String today=sdf.format(d);
        System.out.println(today);

        //string to Date
        String str="2014年02月14日 11:34:11";
        SimpleDateFormat strdate= new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date=strdate.parse(str);
        System.out.println(date);

        //Calendar
        Calendar c=Calendar.getInstance();
        //System.out.println(c);
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH)+1;
        int day=c.get(Calendar.DAY_OF_MONTH);
        int hour=c.get(Calendar.HOUR_OF_DAY);
        int minute=c.get(Calendar.MINUTE);
        int second=c.get(Calendar.SECOND);
        System.out.println("当前年份："+year+"当前月份"+month+"当前日期"+day+"当前时间"+hour+":"+minute+":"+second);
        Date now=c.getTime();
        Long time=c.getTimeInMillis();
        System.out.println("now time:"+now);
        System.out.println("now millis"+time);
    }
}
