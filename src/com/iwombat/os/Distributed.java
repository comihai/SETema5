package com.iwombat.os;

import com.iwombat.interfaces.IOperatingSystem;

/**
 * Created by mihai on 11/11/2014.
 * This is the third concrete object
 */
public class Distributed implements IOperatingSystem {

    /**
     * Private Member
     */
    private int numberOfWorkingComputers = 0;

    /**
     * Generic constructor
     *
     * @param numberOfWorkingComputers Maxim number of computers that work in cooperation - distributed system
     */
    public Distributed(int numberOfWorkingComputers) {
        this.numberOfWorkingComputers = numberOfWorkingComputers;
    }

    /**
     * Constructor without params
     */
    public Distributed() {
    }

    /**
     * Getter for numberOfWorkingComputers
     *
     * @return
     */
    public int getNumberOfWorkingComputers() {
        return numberOfWorkingComputers;
    }

    /**
     * Setter for numberOfWorkingComputers
     *
     * @param numberOfWorkingComputers
     */
    public void setNumberOfWorkingComputers(int numberOfWorkingComputers) {
        this.numberOfWorkingComputers = numberOfWorkingComputers;
    }

    @Override
    public void systemCall() {
        System.out.println("This is a operating system that manages a group of independent computers and makes them appear to be a single computer!\n Maxim number of computers that work at the same time is " + numberOfWorkingComputers + ".");
    }
}
