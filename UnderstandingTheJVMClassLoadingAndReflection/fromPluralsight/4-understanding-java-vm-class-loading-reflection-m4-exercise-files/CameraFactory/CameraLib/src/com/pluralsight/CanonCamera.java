package com.pluralsight;

/**
 * Created by kevinj.
 */
public class CanonCamera implements ICamera {
    @Override
    public void takePhoto() {
        System.out.println("Canon photo taken");
    }

}
