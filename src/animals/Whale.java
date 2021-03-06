package animals;

import food.Food;
import food.Grass;

public class Whale extends Animal implements Swim {

    public Whale(String name, int satiety) {
        super(name,satiety);
    }
    public Whale() {
        this("Whale",1);
    }

    public boolean swim() {
        if (getSatiety()>0) {
            setSatiety(-3);
            System.out.println("Whale is swimming");
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
    @Override
    public boolean eat(Food food) {
        if (food instanceof Grass) {
            System.out.print(" Whale eat " + food.toString() + "\n");
            setSatiety(food.getSATIETY());
            return true;
        }
        else {
            System.out.println(" Whale eat only GRASS!!!");
            return false;//wantEat();
        }
    }
}
