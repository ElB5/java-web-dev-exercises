package org.launchcode.java.demos.lsn6inheritance;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());

        HouseCat spike = new HouseCat ("spike");
        System.out.println(spike.getWeight());

        HouseCat noisey = new HouseCat("noisey");
        System.out.println(noisey.noise());

    }
}
