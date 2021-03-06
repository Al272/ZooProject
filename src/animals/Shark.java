package animals;

import food.Food;
import food.Grass;
import food.Meat;

public class Shark extends Carnivorous implements Swim{
    public Shark(String name, int satiety) {
        super(name, satiety);
    }

    public Shark() {
        this("Shark",1);
    }

    public boolean swim(){
        if (getSatiety()>0) {
            setSatiety(-3);
            System.out.println("Shark is swimming");
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
        if (food instanceof Meat) {
            System.out.print(" Shark eat " + food.toString() + "\n");
            setSatiety(food.getSATIETY());
            return true;
        }
        else {
            System.out.println(" Shark eat only Meat!!!");
            return false;//wantEat();
        }
    }
}
