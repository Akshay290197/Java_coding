package org.example.Multi_Threading;

public class CounterUsingSynchronized implements Runnable {
    private int count=0;
    public synchronized void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }
    public static void main(String[] args) throws InterruptedException {
        CounterUsingSynchronized counter=new CounterUsingSynchronized();
        Thread t1=new Thread(counter);
        Thread t2=new Thread(counter);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.getCount());
    }

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            increment();
        }
    }
}
