package com.example.mybatisplus.jvm;

public class TestHeap {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("1========");
        Thread.sleep(20000);
        System.out.println("2========");
        byte[] bytes = new byte[1024 * 1024];
        Thread.sleep(20000);
        bytes=null;
        System.out.println("3========");
        System.gc();
        Thread.sleep(20000);

    }
}
