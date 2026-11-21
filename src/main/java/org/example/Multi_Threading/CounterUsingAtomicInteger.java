package org.example.Multi_Threading;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterUsingAtomicInteger implements Runnable{
    private AtomicInteger count=new AtomicInteger(0);
    public void increment(){
        count.incrementAndGet();
    }
    public int getCount(){
        return count.get();
    }
    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            increment();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        CounterUsingAtomicInteger counter = new CounterUsingAtomicInteger();
        Thread t1=new Thread(counter);
        Thread t2=new Thread(counter);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.getCount());
    }
}
