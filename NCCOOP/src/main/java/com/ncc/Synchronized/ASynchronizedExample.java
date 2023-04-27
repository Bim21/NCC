package com.ncc.Synchronized;

public class ASynchronizedExample implements Runnable {
    public int tong;

    public ASynchronizedExample() {
        this.tong = 10000;
    }

    public void RutTien() throws InterruptedException {
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
        ASynchronizedExample t = new ASynchronizedExample();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        Thread t4 = new Thread(t);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

