package com.bigdata.java.chapter;

public class Java09_Override {
    public static void main(String[] args) {
        AAA aaa = new BBB();

        //动态绑定机制
        // 成员方法在执行过程中  JVM会将方法和当前调用对象实际内存进行绑定
        // 属性没有动态绑定机制  属性在哪儿声明 在哪儿使用
        System.out.println(aaa.getResult());  //30
    }
}

class AAA {
    public int i = 10;

    public int getResult() {
        return getI() + 10;
    }
    public int getI(){
        return i;
    }
}

class BBB extends AAA {
    public int i = 20;

//    public int getResult() {
//        return i + 20;
//    }

    public int getI(){
        return i;
    }

}