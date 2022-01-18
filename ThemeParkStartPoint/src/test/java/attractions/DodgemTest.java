package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5, 4.50);
        visitor1 = new Visitor(17, 190, 12.50);
        visitor2 = new Visitor(11, 190, 12.50);
        visitor3 = new Visitor(20, 230, 12.50);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void canGetPrice(){
        assertEquals(4.50, dodgems.defaultPrice(), 0.0);
        assertEquals(4.50, dodgems.priceFor(visitor1), 0.0);
        assertEquals(2.25, dodgems.priceFor(visitor2), 0.0);
        assertEquals(4.50, dodgems.priceFor(visitor3), 0.0);
    }
}
