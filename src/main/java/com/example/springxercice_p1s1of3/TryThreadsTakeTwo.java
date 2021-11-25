package com.example.springxercice_p1s1of3;

public class TryThreadsTakeTwo {
    class HelloRunnable implements Runnable {
        @Override
        public void run() {
            String threadName = Thread.currentThread().getName();
            String hello = String.format("Hello, my name is %s", threadName);
            System.out.println(hello);
        }

    }

}
