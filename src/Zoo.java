import animals.*;
import food.*;
import zooKeeper.Worker;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {
    public List<Animal> animals;
    public List<Swim> swimable;
    public List<Food> foods;
    public Worker worker;

    public Zoo() {
        animals = new ArrayList<>(Arrays.asList(new Bull(), new Duck(), new Hawk(), new Shark(), new Tiger(), new Whale()));
        swimable = new ArrayList<>();
        foods = new ArrayList<>(Arrays.asList(new Seaweed(), new Bacon(), new Chicken(), new Sausage(), new Leaves(), new Grains()));
        worker = new Worker();
    }

    public static void main(String[] args) {
        Zoo app = new Zoo();
       /* for (Animal animal : app.animals) {
            if (animal instanceof Swim)
                app.swimable.add((Swim) animal);
            try {
                app.worker.getVoice((Voice) animal);
            } catch (ClassCastException e) {
                System.out.println(animal.getName() + " - do not have voice!");
            }
            for (Food food : app.foods)
                app.worker.feed(animal, food);
            System.out.println();
        }
        for (Swim animal : app.swimable)
            animal.swim();*/

        for (Animal animal : app.animals) {
            animal.play();
            try {
                while (!((Fly) animal).fly()) {
                    app.worker.feed(animal, app.foodGenerantor());
                }
            } catch (ClassCastException e) {
                System.out.println(animal.getName() + " - cannot fly!");
            }
            try {
                while (!((Run) animal).run()) {
                    app.worker.feed(animal, app.foodGenerantor());
                }
            } catch (ClassCastException e) {
                System.out.println(animal.getName() + " - cannot run!");
            }
            try {
                while (!((Swim) animal).swim()) {
                    app.worker.feed(animal, app.foodGenerantor());
                }
            } catch (ClassCastException e) {
                System.out.println(animal.getName() + " - cannot swim!");
            }
            System.out.println("---------------------------------------------------------");
        }

    }
     Food foodGenerantor(){
        return foods.get((int)(Math.random()*6));
    }
}
