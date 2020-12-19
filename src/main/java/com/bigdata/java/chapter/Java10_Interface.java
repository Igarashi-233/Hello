package com.bigdata.java.chapter;

public class Java10_Interface {
    public static void main(String[] args) {
        A10 a = new C10();
        System.out.println(C10.class.getInterfaces().length);
        System.out.println(B10.class.getInterfaces().length);
    }
}

interface A10 {

}

class B10 implements A10 {

}

class C10 extends B10 {

}
