package com.bigdata.java.chapter01;

import java.lang.reflect.Field;

public class Java03_Var_2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //字面量
        String name = "IGARASHI";
        int i = 10;

        //String, StringBuilder, StringBuffer
        //String为不可变字符串  内存地址不可变  值可以改变 只是没有提供改变内容的方法
        String s = " a b ";
//        s.trim();
        Field values = s.getClass().getDeclaredField("value");
        values.setAccessible(true);
        char[] cs = (char[])values.get(s);
        cs[2] = 'd';
        System.out.println("!"+s+"!");

    }
}
