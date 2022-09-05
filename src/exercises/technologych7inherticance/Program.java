package exercises.technologych7inherticance;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Program {
    @Test
    public void inheritModelFromComputer () {
        Laptop mine = new Laptop("Samsung", "blue");
        assertEquals("Samsung", mine.getModel());
    }

    @Test
    public void smartPhoneInheritFromComputer () {
        SmartPhone thatMe = new SmartPhone("Samsung", 6.5);
        assertEquals("Samsung", thatMe.getModel());
    }

    @Test
    public void screenSizeUpdate () {
        SmartPhone newSize = new SmartPhone("Samsung", 6.5);
        assertEquals(7, newSize.newPhoneScreenSize(), .001);
    }
}
