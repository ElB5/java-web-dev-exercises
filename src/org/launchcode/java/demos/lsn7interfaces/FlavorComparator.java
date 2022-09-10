package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;


public class FlavorComparator implements Comparator <Flavor> {

//    @Override
//    public int compare(Flavor o1, Flavor o2) {
//        return o1.getName().compareTo(o2.getName());
//    }
//

    //didn't sort highest to lowest allergens
    @Override
    public int compare(Flavor o1, Flavor o2) {
        if (o1.getAllergens() == o2.getAllergens()) {
            return 0;
        } else if (o1.getAllergens() != o2.getAllergens()) {
            return 1;
        } else {
            return -1;
        }
    }
}
