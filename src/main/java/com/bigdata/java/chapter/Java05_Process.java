package com.bigdata.java.chapter;

public class Java05_Process {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        String s = "abc".substring(0,1);
        String b = "a".substring(0,1);

        if (s == b) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
