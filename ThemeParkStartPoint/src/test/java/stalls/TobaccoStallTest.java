package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", 5, ParkingSpot.B1);
        visitor1 = new Visitor(17, 190, 12.50);
        visitor2 = new Visitor(11, 190, 12.50);
        visitor3 = new Visitor(20, 230, 12.50);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void hasGetRating(){
        assertEquals(5, tobaccoStall.getRating());
    }

    @Test
    public void hasGetName(){
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasSecurity(){
        assertEquals(false, tobaccoStall.isAllowedTo(visitor1));
        assertEquals(false, tobaccoStall.isAllowedTo(visitor2));
        assertEquals(true, tobaccoStall.isAllowedTo(visitor3));

    }
}
