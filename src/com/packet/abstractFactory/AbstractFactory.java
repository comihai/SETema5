package com.packet.abstractFactory;

import com.packet.interfaces.IOperatingSystem;
import com.packet.interfaces.IProcessor;

/**
 * Created by mihai on 11/11/2014.
 * Abstract class to get factories for OperatingSystem and Processor Objects
 */
public abstract class AbstractFactory {

    abstract IOperatingSystem getOperatingSystem(String operatingSystem);
    abstract IProcessor getProcessor(String processor);
}
