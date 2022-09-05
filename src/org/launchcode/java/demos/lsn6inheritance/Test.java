package org.launchcode.java.demos.lsn6inheritance;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class Test {
//testing that housecat inherits cat constructor
    @org.junit.Test
    public void inheritsSuperInFirstConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertEquals(7, keyboardCat.getWeight(), .001);
    }

    @org.junit.Test
    public void inheritsDefaultCatInSecondConstructor () {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat");
        assertNotNull(keyboardCat.getWeight());
    }
}
