package com.bigdata.java.chapter;

public class Java04_Oper {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        //运算
        int i = 0;
        int j = i++;  //j=0 i=1
        int k = ++i;
        System.out.println(i + "=" + j + "=" + k);

        //"++"歧义
        int a = 0;
        a = a++;  // 1. (_b=a++),  2. (a=_b)
        //  3. _b=0, a=1  4.a=_b=0
        System.out.println(a);

    }
}
