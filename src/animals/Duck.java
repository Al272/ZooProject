package animals;

import food.Food;
import food.Grass;

public class Duck extends Herbivore implements Fly, Run, Swim, Voice {
    public Duck(String name, int satiety) {
        super(name, satiety);
    }
    public Duck() {
        this("Duck",1);
    }
    public boolean fly() {
        if (getSatiety()>0) {
            setSatiety(-3);
            System.out.println("Duck is flying");
            return true;
        }else
            return wantEat();
    }

    public boolean run() {
        if (getSatiety()>0) {
            setSatiety(-2);
            System.out.println("Duck is running");
            return true;
        }else
            return wantEat();
    }

    public boolean swim() {
        if (getSatiety()>0) {
            setSatiety(-3);
            System.out.println("Duck is swimming");
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
        return getName()+" say - Krja-Krja!";
    }
    @Override
    public boolean eat(Food food) {
        if (food instanceof Grass) {
            System.out.print(" Duck eat " + food.toString() + "\n");
            setSatiety(food.getSATIETY());
            return true;
        } else{
            System.out.println(" Duck eat only GRASS!!!");
            return false;//wantEat();
        }
    }
}
