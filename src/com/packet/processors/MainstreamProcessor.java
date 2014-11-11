package com.packet.processors;

import com.packet.interfaces.IProcessor;

/**
 * Created by mihai on 11/11/2014.
 * This is the second concrete object
 */
public class MainstreamProcessor implements IProcessor {

    /**
     * Private Members
     */
    private int price = 0;
    private int powerRequired = 0;

    /**
     * Generic constructor
     *
     * @param price         The price for this type of processor
     * @param powerRequired The power required for this type of processor
     */
    public MainstreamProcessor(int price, int powerRequired) {
        this.price = price;
        this.powerRequired = powerRequired;
    }

    /**
     * Constructor without params
     */
    public MainstreamProcessor() {
    }

    /**
     * Getters
     *
     * @return
     */
    public int getPrice() {
        return price;
    }

    public int getPowerRequired() {
        return powerRequired;
    }

    /**
     * Setters
     *
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    public void setPowerRequired(int powerRequired) {
        this.powerRequired = powerRequired;
    }

    @Override
    public void clockSpeed() {
        System.out.println("This processor may be a good upgrade choice if you need more performance!\n Price :  " + price + " $ and power required " + powerRequired+" W.");
    }
}
