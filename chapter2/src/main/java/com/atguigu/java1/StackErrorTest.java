package com.atguigu.java1;

/**
 * StackOverflowError
 */
public class StackErrorTest {

    private static int count = 1;

    public static void main(String[] args) {
        System.out.println(count);
        count++;
        main(args);
    }
}
