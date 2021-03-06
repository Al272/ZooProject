package animals;

import food.Food;
import food.Grass;
import food.Meat;

public class Tiger extends Carnivorous implements Run, Voice {
    public Tiger(String name, int satiety) {
        super(name, satiety);
    }

    public Tiger() {
        this("Tiger",1);
    }

    public boolean run() {
        if (getSatiety()>0) {
            setSatiety(-3);
            System.out.println("Tiger is running");
            return true;
        }else
            return wantEat();
    }
    public boolean play() {
        if (getSatiety() > 0) {
            setSatiety(-2);
            System.out.println(getName() + " is playing");
            return true;
        } else
            return wantEat();
    }
    public String voice() {
        return getName()+" say - Rrrr!";
    }

    @Override
    public boolean eat(Food food) {
        if (food instanceof Meat) {
            System.out.print(" Tiger eat " + food.toString() + "\n");
            setSatiety(food.getSATIETY());
            return true;
        }
        else {
            System.out.println(" Tiger eat only Meat!!!");
            return false;//wantEat();
        }
    }
}
