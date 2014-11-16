package com.iwombat.adapters;

import com.iwombat.abstracts.AbstractFactory;
import com.iwombat.interfaces.IOperatingSystem;
import com.iwombat.interfaces.IProcessor;
import com.iwombat.processors.BugetProcessor;
import com.iwombat.processors.DualCoreProcessor;
import com.iwombat.processors.MainstreamProcessor;

/**
 * Created by mihai on 11/11/2014.
 * <p/>
 * This create ProcessorFactory class extending AbstractFactory to generate concrete objects
 */
public class ProcessorFactory extends AbstractFactory {
    @Override
    public IOperatingSystem getOperatingSystem(String operatingSystem, int numberOfWorkingComputers, double autonomy, int numberOfUsers, String schedulingAlgorithm, int timeSharing) {
        return null;
    }

    @Override
    public IProcessor getProcessor(String processor, int price, String cpuSocket, double frequency, int powerRequired) {
        if (processor == null) {
            return null;
        }
        if (processor.equalsIgnoreCase("BUGETPROCESSOR")) {
            return new BugetProcessor(price);
        } else if (processor.equalsIgnoreCase("DUALCOREPROCESSOR")) {
            return new DualCoreProcessor(price, cpuSocket, frequency);
        } else if (processor.equalsIgnoreCase("MAINSTREAMPROCESSOR")) {
            return new MainstreamProcessor(price, powerRequired);
        }
        return null;
    }
}
