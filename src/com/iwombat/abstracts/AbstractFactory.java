package com.iwombat.abstracts;

import com.iwombat.interfaces.IOperatingSystem;
import com.iwombat.interfaces.IProcessor;

/**
 * Created by mihai on 11/11/2014.
 * Abstract class to get adapters for OperatingSystem and Processor Objects
 */
public abstract class AbstractFactory {

    public abstract IOperatingSystem getOperatingSystem(String operatingSystem, int numberOfWorkingComputers, double autonomy, int numberOfUsers, String schedulingAlgorithm, int timeSharing);
    public abstract IProcessor getProcessor(String processor, int price, String cpuSocket, double frequency, int powerRequired);
}
