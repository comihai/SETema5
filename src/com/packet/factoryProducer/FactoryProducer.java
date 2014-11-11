package com.packet.factoryProducer;

import com.packet.abstractFactory.AbstractFactory;
import com.packet.factories.OperatingSystemFactory;
import com.packet.factories.ProcessorFactory;

/**
 * Created by mihai on 11/11/2014.
 * This class create a factory generator
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String type) {
        if (type.equalsIgnoreCase("OPERATINGSYSTEM")) {
            return new OperatingSystemFactory();
        } else if (type.equalsIgnoreCase("PROCESSOR")) {
            return new ProcessorFactory();
        }
        return null;
    }
}
