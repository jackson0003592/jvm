package com.atguigu.java1;

public class StringTest {

    public static void main(String[] args) {
        String str = new String();

        ClassLoader classLoader = str.getClass().getClassLoader();
        System.out.println(classLoader);

        System.out.println("hello");
    }
}
