package com.iwombat.processors;

import com.iwombat.interfaces.IProcessor;

/**
 * Created by mihai on 11/11/2014.
 * This is the third concrete object
 */
public class DualCoreProcessor implements IProcessor {
    /**
     * Private Members
     */
    private int price = 0;
    private String cpuSocket = null;
    private double frequency = 0;

    /**
     * Generic constructor
     *
     * @param price     The price for this type of processor
     * @param cpuSocket The compatibility with most existing Socket motherboards
     * @param frequency The frequency at which the processor runs
     */
    public DualCoreProcessor(int price, String cpuSocket, double frequency) {
        this.price = price;
        this.cpuSocket = cpuSocket;
        this.frequency = frequency;
    }

    /**
     * Constructor without params
     */
    public DualCoreProcessor() {
    }

    /**
     * Getters
     *
     * @return
     */
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCpuSocket() {
        return cpuSocket;
    }

    /**
     * Setters
     *
     * @param cpuSocket
     */

    public void setCpuSocket(String cpuSocket) {
        this.cpuSocket = cpuSocket;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    @Override
    public void clockSpeed() {
        System.out.println("This processor introduces many complexities through doubling the already-high power consumption and heat production.!\n Price :  " + price + " $\nCPU Socket : " + cpuSocket + "\nFrequency : " + frequency+" GHz.");
    }
}
