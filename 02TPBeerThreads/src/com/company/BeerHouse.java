package com.company;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class BeerHouse {
    private int ltsStock;
    private final int MAX = 100;
    private int day = 1;

    public synchronized void produce (int ltProduced) {
        System.out.println("---------- DAY " + this.day + "----------");
        System.out.println("In Stock: " + ltsStock + " lts.");
        day++;

        if ((this.ltsStock + ltProduced) < MAX) {
            System.out.println("Day's Production: " + ltProduced + " lts.");
            this.ltsStock += ltProduced;
            System.out.println("In Stock: " + ltsStock + " lts.");
        }
        while (ltsStock == MAX) {
            try {
                System.out.println("Maximum stock reached" + ltsStock);
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        notify();
    }

    public synchronized void consume (int ltConsumed) {
        if (ltConsumed > ltsStock) {
            System.out.println("Closed for the day ... beer is out of Stock");
            System.exit(0);
        }
        this.ltsStock -= ltConsumed;
        System.out.println(ltsStock + " lts. remaining to be consumed");
        notify();
    }
}
