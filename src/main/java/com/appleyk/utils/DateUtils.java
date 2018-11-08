package com.appleyk.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    private static  SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");

	public static String dateTostring(Date date) {
		return format.format(date);
	}

    /**
     * 截取时间戳
     * @param time
     * @return
     */
	public static  Long getTime(long time){
	    String timeStr = String.valueOf(time);
	    int len = timeStr.length();
	    if(len == 13){
	        // 截取到秒
            timeStr = timeStr.substring(0, len-3);
        }
        return  Long.parseLong(timeStr);
    }

    public static Date addDays(Integer day){
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DAY_OF_MONTH, day);
        return c.getTime();
    }

}
