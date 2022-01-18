package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    private final double ticketPrice;

    public Dodgems(String name, int rating, double ticketPrice) {
        super(name, rating);
        this.ticketPrice = ticketPrice;
    }

    @Override
    public double defaultPrice() {
        return ticketPrice;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getAge() <= 12) {
            return (defaultPrice() / 2);
        }
        else{
            return defaultPrice();
        }
    }
}
