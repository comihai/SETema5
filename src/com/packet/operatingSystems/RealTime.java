package com.packet.operatingSystems;

import com.packet.interfaces.IOperatingSystem;

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

    @Override
    public void systemCall() {
        System.out.println("This is a multitasking OS that aims at executing real-time apps ! The scheduling algorithm is " + schedulingAlgorithm + " and the time-sharing is " + timeSharing);
    }
}
