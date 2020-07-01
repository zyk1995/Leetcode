package com.zyk.utils.threadLocal;

public class ThreadLocalTest {

    public static ThreadLocal<Integer> a  = new ThreadLocal<>();
    public static void main(String[] args) {
        new Thread(() -> {
            a.set(2);
            System.out.println(a.get());
        }).start();

        new Thread(() -> {
            a.set(10);
            System.out.println(a.get());
        }).start();
    }
}
