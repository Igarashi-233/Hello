package com.bigdata.java.chapter;

public class Java08_Access {
    public static void main(String[] args) throws CloneNotSupportedException {
        /*
        List list = new ArrayList();
        list.clone();

        ArrayList list1 = new ArrayList();
        list1.clone();
        */

        // 访问权限
        // 权限是 方法提供者和使用者之间的关系
        //      方法提供者: java.lang.Object
        //      方法调用者: com.bigdata.java.chapter.Java08_Access
//        A a = new A();
//        a.clone();   报错

        //      方法提供者: com.bigdata.java.chapter.B
        //      方法调用者: com.bigdata.java.chapter.Java08_Access
        B b = new B();
        b.clone();

        User user = new User();
        user.username = "IGARASHI";

    }

//    public static void test(List list){
//
//    }
}

class A {

}

class B{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class User {
    public String username;
}
