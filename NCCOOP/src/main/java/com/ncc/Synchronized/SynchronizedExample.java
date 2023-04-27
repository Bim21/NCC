package com.ncc.Synchronized;

public class SynchronizedExample implements Runnable {
    public int tong;

    public SynchronizedExample() {
        this.tong = 10000;
    }

    public synchronized void RutTien() throws InterruptedException {
        if (tong > 0) {
            Thread.sleep(1000);
            tong = tong - 1000;
            System.out.println(tong);
        } else {
            System.out.println("Khong con tien");
        }
    }

    @Override
    public void run() {
        try {
            RutTien();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        SynchronizedExample t = new SynchronizedExample();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        t1.start();
        t2.start();
        t3.start();
    }
}

