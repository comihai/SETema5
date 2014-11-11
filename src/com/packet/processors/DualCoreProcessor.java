package com.packet.processors;

import com.packet.interfaces.IProcessor;

/**
 * Created by mihai on 11/11/2014.
 * This is the third concrete object
 */
public class DualCoreProcessor implements IProcessor{
    /**
     * Private Members
     */
    private int price;
    private String cpuSocket;
    private double frequency;

    /**
     * Generic constructor
     * @param price     The price for this type of processor
     * @param cpuSocket The compatibility with most existing Socket motherboards
     * @param frequency The frequency at which the processor runs
     */
    public DualCoreProcessor(int price, String cpuSocket, double frequency) {
        this.price = price;
        this.cpuSocket = cpuSocket;
        this.frequency = frequency;
    }

    @Override
    public void clockSpeed() {
        System.out.println("This processor introduces many complexities through doubling the already-high power consumption and heat production.!\n Price :  " + price + "\nCPU Socket : " + cpuSocket+"\nFrequency : "+frequency);
    }
}
