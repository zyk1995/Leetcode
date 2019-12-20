package com.zyk.foobar;

public class FooBar {
    private int n;
    private volatile boolean flag = false;
    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            while (flag) {
                Thread.yield();
            }
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            flag = true;
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            while (!flag) {
                Thread.yield();
            }
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            flag = false;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        FooBar fooBar = new FooBar(10);

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
