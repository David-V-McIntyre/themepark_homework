package stalls;

import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, int rating, ParkingSpot parkingSpot) {
        super(name, ownerName, rating, parkingSpot);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        int age = visitor.getAge();
        if(age >= 18){
            return true;
        }
        else {
            return false;
        }
    }
}
