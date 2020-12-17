package com.bigdata.java.chapter;

public class Java07_Exception {
    public static void main(String[] args) {

        //异常的捕捉范围  由小到大

        try {
            int i=10;
            int j=0;
            int z = i/j;
        }catch (ArithmeticException e) {
            System.out.println("ArithmeticException........");
        } catch (Exception e){
            System.out.println("Exception........");
        }finally {
            System.out.println("finally......");
        }
    }
}
