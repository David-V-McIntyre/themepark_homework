package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10, 8.40);
        visitor1 = new Visitor(17, 190, 12.50);
        visitor2 = new Visitor(11, 220, 12.50);
        visitor3 = new Visitor(20, 100, 12.50);
        visitor4 = new Visitor(9, 120, 12.50);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }
    @Test
    public void canIsAllowedTo(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor1));
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
        assertEquals(false, rollerCoaster.isAllowedTo(visitor3));
        assertEquals(false, rollerCoaster.isAllowedTo(visitor4));
    }


    @Test
    public void canGetPriceFor(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.0);
        assertEquals(8.40, rollerCoaster.priceFor(visitor1), 0.0);
        assertEquals(16.80, rollerCoaster.priceFor(visitor2), 0.0);
        assertEquals(8.40, rollerCoaster.priceFor(visitor3), 0.0);
        assertEquals(8.40, rollerCoaster.priceFor(visitor4), 0.0);
    }
}
