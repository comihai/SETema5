package com.packet.operatingSystems;

import com.packet.interfaces.IOperatingSystem;

/**
 * Created by mihai on 11/11/2014.
 * This is the fourth concrete object
 */
public class Embedded implements IOperatingSystem {
    /**
     * Private Member
     */
    private double autonomy = 0;

    /**
     * Generic constructor
     *
     * @param autonomy Autonomy used for operating with a limited number of resources
     */
    public Embedded(double autonomy) {
        this.autonomy = autonomy;
    }

    /**
     * Constructor without params
     */
    public Embedded() {
    }

    /**
     * Getter for autonomy
     *
     * @return
     */
    public double getAutonomy() {
        return autonomy;
    }

    /**
     * Setter for autonomy
     *
     * @param autonomy
     */
    public void setAutonomy(double autonomy) {
        this.autonomy = autonomy;
    }

    @Override
    public void systemCall() {
        System.out.println("This operating system is designed to be used in embedded computer systems!\n Autonomy :  " + autonomy +" units.");
    }
}
