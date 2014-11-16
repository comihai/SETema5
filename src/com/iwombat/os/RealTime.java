package com.iwombat.os;

import com.iwombat.interfaces.IOperatingSystem;

/**
 * Created by mihai on 11/11/2014.
 * This is the first concrete object
 */
public class RealTime implements IOperatingSystem {
    /**
     * Private members
     */
    private String schedulingAlgorithm = null;
    private int timeSharing = 0;

    /**
     * Generic constructor
     *
     * @param schedulingAlgorithm The algorithm used by OS
     * @param timeSharing         OS switch tasks based on clock interrupts
     */
    public RealTime(String schedulingAlgorithm, int timeSharing) {
        this.schedulingAlgorithm = schedulingAlgorithm;
        this.timeSharing = timeSharing;
    }

    /**
     * Constructor without params
     */
    public RealTime() {
    }

    /**
     * Getters
     *
     * @return
     */
    public String getSchedulingAlgorithm() {
        return schedulingAlgorithm;
    }

    public int getTimeSharing() {
        return timeSharing;
    }

    /**
     * Setters
     *
     * @param schedulingAlgorithm
     */
    public void setSchedulingAlgorithm(String schedulingAlgorithm) {
        this.schedulingAlgorithm = schedulingAlgorithm;
    }

    public void setTimeSharing(int timeSharing) {
        this.timeSharing = timeSharing;
    }

    @Override
    public void systemCall() {
        System.out.println("This is a multitasking OS that aims at executing real-time apps !\n The scheduling algorithm is " + schedulingAlgorithm + " and the time-sharing is " + timeSharing + " ms.");
    }
}
