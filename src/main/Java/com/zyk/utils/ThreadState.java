package com.zyk.utils;

public class ThreadState {
    public static void main(String[] args) {

    }

    static class TimeWaiting implements  Runnable {
        @Override
        public void run() {
            while (true) {
            }
        }
    }

    static class Waiting implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (Waiting.class) {

                }
            }
        }
    }
}
