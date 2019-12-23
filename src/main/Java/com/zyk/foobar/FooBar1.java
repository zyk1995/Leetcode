package com.zyk.foobar;

import java.util.concurrent.ThreadPoolExecutor;

public class FooBar1 {
    private int n;
    private Object lock = new Object();
    private boolean flag = false;
    public FooBar1(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            synchronized (lock) {
                if (flag) {
                    lock.wait();
                }
                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();
                flag = true;
                lock.notifyAll();
            }

        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            synchronized (lock) {
                if (!flag) {
                    lock.wait();
                }
                // printBar.run() outputs "bar". Do not change or remove this line.
                printBar.run();
                flag = false;
                lock.notifyAll();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        FooBar1 fooBar = new FooBar1(10);

        fooBar.foo(new Runnable() {
            @Override
            public void run() {
                System.out.print("foo");
            }
        });
        fooBar.bar(new Runnable() {
            @Override
            public void run() {
                System.out.print("bar");
            }
        });
    }
}
