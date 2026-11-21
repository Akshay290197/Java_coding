package org.example.Multi_Threading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterUsingReentrant implements Runnable {
    private int count=0;
    private final Lock lock=new ReentrantLock(true);

    private void increment(){
        lock.lock();
        try{
            count++;
        }
        finally {
            lock.unlock();
        }
    }
    public int getCount(){
        return count;
    }

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            increment();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        CounterUsingReentrant counter = new CounterUsingReentrant();
        Thread t1=new Thread(counter);
        Thread t2=new Thread(counter);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.getCount());
    }
}
