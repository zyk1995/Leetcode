package com.zyk.jvm;

// 引用计数法的缺陷 很难解决对象间互相循环引用的问题
public class GCtest {

    public Object instance = null;

    private static final  int _1MB = 1025 * 1024;
    public static void main(String[] args) {
        GCtest test1 = new GCtest();
        GCtest test2 = new GCtest();
        test1.instance = test2;
        test2.instance = test1;

        test1 = null;
        test2 = null;

        System.gc();
    }
}
