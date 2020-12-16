package com.bigdata.java.chapter01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Java06_Date {
    public static void main(String[] args) throws ParseException {

        //日期格式化
        Date d = parse("2020-12-16 18:45:00", "yyyy-MM-dd HH:mm:ss");
        System.out.println(d);

    }

    public static Date parse(String date, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.parse(date);
    }
}
