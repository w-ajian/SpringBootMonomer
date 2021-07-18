package com.wenjian.test;

public class TicketThread extends Thread {

    public TicketThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(getName()+i);
        }
    }
}