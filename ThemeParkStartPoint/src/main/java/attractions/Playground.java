package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);
    }
    
    @Override
    public boolean isAllowedTo(Visitor visitor) {
        int age = visitor.getAge();
        if(age <= 15){
            return true;
        }
        else {
            return false;
        }
    }

}
