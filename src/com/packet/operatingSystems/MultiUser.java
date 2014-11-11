package com.packet.operatingSystems;

import com.packet.interfaces.IOperatingSystem;

/**
 * Created by mihai on 11/11/2014.
 * <p/>
 * This is the second concrete object
 */
public class MultiUser implements IOperatingSystem {
    /**
     * Member
     */
    private int numberOfUsers = 0;

    /**
     * Generic constructor
     *
     * @param numberOfUsers Maxim number of users that are logged into the system at a certain time
     */
    public MultiUser(int numberOfUsers) {
        this.numberOfUsers = numberOfUsers;
    }

    @Override
    public void systemCall() {
        System.out.println("This is a operating system that allows multiple users to access a computer system at the same time! Maxim number of users is " + numberOfUsers);
    }
}
