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
    public IOperatingSystem getOperatingSystem(String operatingSystem) {
        if(operatingSystem == null) {
            return null;
        }
        if(operatingSystem.equalsIgnoreCase("REALTIME"))
        {
            return new RealTime();
        }
        else if(operatingSystem.equalsIgnoreCase("MULTIUSER"))
        {
            return new MultiUser();
        }
        else if(operatingSystem.equalsIgnoreCase("EMBEDDED"))
        {
            return new Embedded();
        }
        else if(operatingSystem.equalsIgnoreCase("DISTRIBUTED"))
        {
            return new Distributed();
        }
        return null;

    }

    @Override
    public IProcessor getProcessor(String processor) {
        return null;
    }
}
