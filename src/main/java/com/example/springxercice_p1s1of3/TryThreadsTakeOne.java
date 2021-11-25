package com.example.springxercice_p1s1of3;

public class TryThreadsTakeOne {
    class HelloThreadTakeOne extends Thread {
        @Override
        public void run() {
            String hello = String.format("This is thread name:", getName());
            System.out.println(hello);
        }
    }
}
