package com.threadexample;

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println("MyThread - START "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            //Get database connection, delete unused data from DB
            doDBProcessing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThread - END "+Thread.currentThread().getName());
//        for (int i = 0; i <= 10; i++) {
//            System.out.println("Child Thread : "+i);
//        }
    }
    private void doDBProcessing() throws InterruptedException {
        Thread.sleep(5000);
    }
}
