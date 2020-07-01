package com.zyk.utils.threadLocal;

public class NoThreadLocal {
    public  static  int a = 1;
    public static void main(String[] args) {
        new Thread(() -> {
            a = 2;
            System.out.println(a);
        }).start();

        new Thread(() -> {
            a = 10;
            System.out.println(a);
        }).start();
    }
}
