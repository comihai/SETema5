package com.iwombat;

import com.iwombat.abstracts.AbstractFactory;
import com.iwombat.interfaces.IOperatingSystem;
import com.iwombat.interfaces.IProcessor;
import com.iwombat.manufacturers.FactoryProducer;

/**
 * Created by mihai on 11/10/2014.
 * <p/>
 * This is the main class that holds the role of the client
 */
public class Main {
    public static void main(String[] args) {
        /**
         * create factory instances
         */

        /**
         * get operatingSystem Factory
         */
        FactoryProducer fp = new FactoryProducer();
        AbstractFactory operatingSystemFactory = fp.getFactory("OPERATINGSYSTEM");

        IOperatingSystem os1 = operatingSystemFactory.getOperatingSystem("DISTRIBUTED", 100, 0, 0, null, 0);
        os1.systemCall();

        IOperatingSystem os2 = operatingSystemFactory.getOperatingSystem("EMBEDDED", 0, 134.7, 0, null, 0);
        os2.systemCall();

        IOperatingSystem os3 = operatingSystemFactory.getOperatingSystem("MULTIUSER", 0, 0, 14, null, 0);
        os3.systemCall();

        IOperatingSystem os4 = operatingSystemFactory.getOperatingSystem("REALTIME", 0, 0, 0, "Least slack time scheduling", 12);
        os4.systemCall();

        /**
         * get processor Factory
         */
        AbstractFactory processorFactory = FactoryProducer.getFactory("PROCESSOR");

        IProcessor p1 = processorFactory.getProcessor("BUGETPROCESSOR", 75, null, 0, 0);
        p1.clockSpeed();

        IProcessor p2 = processorFactory.getProcessor("DUALCOREPROCESSOR", 125, "FM2", 3.2, 0);
        p2.clockSpeed();

        IProcessor p3 = processorFactory.getProcessor("MAINSTREAMPROCESSOR", 800, null, 0, 2000);
        p3.clockSpeed();
    }
}
