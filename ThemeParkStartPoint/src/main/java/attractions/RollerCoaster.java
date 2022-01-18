package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    private final double ticketPrice;

    public RollerCoaster(String name, int rating, double ticketPrice) {
        super(name, rating);
        this.ticketPrice = ticketPrice;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        int age = visitor.getAge();
        double height = visitor.getHeight();
        if(age >= 12 && height >= 142){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public double defaultPrice() {
        return ticketPrice;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getHeight() >= 200) {
            return (defaultPrice() * 2);
        }
        else{
            return defaultPrice();
        }
    }


}
