package com.zyk.utils.synchronize;

/*
  多个线程访问同一个对象的同一个方法
 */
class SynchroizedTest implements Runnable{

    //共享资源
    public static int i =0;
    /**
     * synchronized 修饰实例方法
     */
    public synchronized void increase(){
        i++;
    }
    @Override
    public void run() {
        for (int j = 0; j < 10000; j++) {
            increase();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SynchroizedTest test = new SynchroizedTest();
        Thread t1 = new Thread(new SynchroizedTest());
        Thread t2 = new Thread(new SynchroizedTest());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }
}