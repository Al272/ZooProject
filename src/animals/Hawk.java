package animals;

import food.Food;
import food.Meat;

public class Hawk extends Carnivorous implements Voice,Run,Fly{
    public Hawk(String name, int satiety) {
        super(name, satiety);
    }
    public Hawk() {
        this("Hawk",1);
    }
    public boolean fly(){
        if (getSatiety()>0) {
            setSatiety(-3);
            System.out.println("Hawk is flying");
            return true;
        }else
            return wantEat();
    }
    public boolean run(){
        if (getSatiety()>0) {
            setSatiety(-2);
            System.out.println("Hawk is flying");
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
    public String voice(){
        return getName()+" say - Kar-Kar!";
    }
    @Override
    public boolean eat(Food food) {
        if (food instanceof Meat) {
            System.out.print(" Hawk eat " + food.toString() + "\n");
            setSatiety(food.getSATIETY());
            return true;
        }
        else {
            System.out.println(" Hawk eat only Meat!!!");
            return false;//wantEat();
        }
    }
}
