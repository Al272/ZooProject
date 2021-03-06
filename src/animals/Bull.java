package animals;

import food.Food;
import food.Grass;

public class Bull extends Herbivore implements Run, Voice {

    public Bull(String name, int satiety) {
        super(name, satiety);
    }

    public Bull() {
        this("Bull", 1);
    }

    public boolean run() {
        if (getSatiety() > 0) {
            setSatiety(-3);
            System.out.println(getName() + " is running");
            return true;
        } else
            return wantEat();
    }

    public String voice() {
        return getName() + " say - 'Muuu!'";
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
            System.out.print(getName() + " eat " + food.toString() + "\n");
            setSatiety(food.getSATIETY());
            return true;
        } else
            System.out.println(getName() + " eat only GRASS!!!");
        return false;//wantEat();
    }
}
