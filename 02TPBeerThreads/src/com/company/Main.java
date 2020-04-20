package com.company;


public class Main {

    public static void main(String[] args) {
        BeerHouse beerHouse = new BeerHouse ();
        BeerProducer producer = new BeerProducer(beerHouse);
        BeerConsumer consumer = new BeerConsumer (beerHouse);
    }

}
