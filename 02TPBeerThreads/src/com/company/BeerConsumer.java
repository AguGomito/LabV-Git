package com.company;

import java.util.Random;

public class BeerConsumer implements Runnable{
    BeerHouse beerHouse;

    public BeerConsumer (BeerHouse beerHouse) {
        this.beerHouse = beerHouse;
        Thread thread = new Thread (this, "Consumer");
        thread.start();
    }

    @Override
    public void run() {
        while (true) {

            Random random = new Random();
            int ltConsumed = random.nextInt(20 - 1);
            System.out.println("Consumed: " + ltConsumed + " lts.");
            beerHouse.consume(ltConsumed);

            try {
                Thread.sleep(100);
            }
            catch (Exception e) {

            }
        }
    }
}
