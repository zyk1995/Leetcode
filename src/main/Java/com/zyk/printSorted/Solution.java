package com.zyk.printSorted;

import java.util.concurrent.ThreadFactory;

public class Solution {


    private volatile int count = 0;


    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        count++;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while(count != 1) { };
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        count++;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while(count != 2) {};
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }


    public static void main(String[] args) throws InterruptedException {

        Solution solution = new Solution();
        solution.first(new Runnable() {
            @Override
            public void run() {
                System.out.println("first");
            }
        });
        solution.second(new Runnable() {
            @Override
            public void run() {
                System.out.println("second");
            }
        });
        solution.third(new Runnable() {
            @Override
            public void run() {
                System.out.println("third");
            }
        });
    }
}
