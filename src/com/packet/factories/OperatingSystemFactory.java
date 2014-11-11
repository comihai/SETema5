package com.packet.factories;

import com.packet.abstractFactory.AbstractFactory;
import com.packet.interfaces.IOperatingSystem;
import com.packet.interfaces.IProcessor;
import com.packet.operatingSystems.Distributed;
import com.packet.operatingSystems.Embedded;
import com.packet.operatingSystems.MultiUser;
import com.packet.operatingSystems.RealTime;

/**
 * Created by mihai on 11/11/2014.
 * This create OperatingSystemFactory class extending AbstractFactory to generate concrete objects
 */
public class OperatingSystemFactory extends AbstractFactory{
    @Override
    public IOperatingSystem getOperatingSystem(String operatingSystem, int numberOfWorkingComputers, double autonomy, int numberOfUsers, String schedulingAlgorithm, int timeSharing) {
        if(operatingSystem == null) {
            return null;
        }
        if(operatingSystem.equalsIgnoreCase("REALTIME"))
        {
            return new RealTime(schedulingAlgorithm,timeSharing);
        }
        else if(operatingSystem.equalsIgnoreCase("MULTIUSER"))
        {
            return new MultiUser(numberOfUsers);
        }
        else if(operatingSystem.equalsIgnoreCase("EMBEDDED"))
        {
            return new Embedded(autonomy);
        }
        else if(operatingSystem.equalsIgnoreCase("DISTRIBUTED"))
        {
            return new Distributed(numberOfWorkingComputers);
        }
        return null;

    }

    @Override
    public IProcessor getProcessor(String processor, int price, String cpuSocket, double frequency,int powerRequired) {
        return null;
    }
}
