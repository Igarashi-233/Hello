package com.bigdata.java.chapter;

public class Java11_ObjectEq {
    public static void main(String[] args) {
        User11 user1 = new User11();
        User11 user2 = new User11();

        user1.equals(user2);
    }
}

class User11 {

    private int id;
    private String name;

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof User11) {

            User11 otherUser = (User11)obj;
            return this.id == otherUser.id;

        } else {
            return false;
        }

    }
}
