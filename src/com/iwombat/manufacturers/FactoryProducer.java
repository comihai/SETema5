package com.iwombat.manufacturers;

import com.iwombat.abstracts.AbstractFactory;
import com.iwombat.adapters.OperatingSystemFactory;
import com.iwombat.adapters.ProcessorFactory;

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
