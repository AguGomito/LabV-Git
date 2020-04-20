package com.company;

import java.util.Random;

public class BeerProducer implements Runnable {
    BeerHouse beerHouse;

    public BeerProducer(BeerHouse beerHouse) {
        this.beerHouse = beerHouse;
        Thread thread = new Thread (this, "Producer");
        thread.start();
    }

    @Override
    public void run() {

        while (true) {
            Random random = new Random();
            int ltsProduced = random.nextInt(100 - 1);
            beerHouse.produce(ltsProduced);

            try {
                Thread.sleep(500);
            }
            catch (Exception e) {

            }
        }
    }
}
