package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitor1 = new Visitor(17, 190, 12.50);
        visitor2 = new Visitor(11, 190, 12.50);
        visitor3 = new Visitor(20, 230, 12.50);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void canIsAllowedto(){
        assertEquals(false, playground.isAllowedTo(visitor1));
        assertEquals(true, playground.isAllowedTo(visitor2));
        assertEquals(false, playground.isAllowedTo(visitor3));
    }
}
