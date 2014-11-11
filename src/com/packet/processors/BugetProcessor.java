package com.packet.processors;

import com.packet.interfaces.IProcessor;

/**
 * Created by mihai on 11/11/2014.
 * This is the first concrete object
 */
public class BugetProcessor implements IProcessor {
    /**
     * Private member
     */
    private int price = 0;

    /**
     * Generic constructor
     *
     * @param price The price for this type of processor
     */
    public BugetProcessor(int price) {
        this.price = price;
    }

    /**
     * Constructor without params
     */
    public BugetProcessor() {
    }

    /**
     * Getter for price
     *
     * @return
     */
    public int getPrice() {
        return price;
    }

    /**
     * Setter for price
     *
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void clockSpeed() {
        System.out.println("This processor give up a bit of performance in exchange for a lower price! Price :  " + price);
    }
}
