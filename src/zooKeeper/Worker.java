package zooKeeper;

import animals.Animal;
import animals.Voice;
import food.Food;

public class Worker {
    public void feed(Animal animal, Food food){
        System.out.print("Worker gives '" + food.toString() + "' -> ");
        animal.eat(food);
    }
    public void getVoice(Voice animal){
            System.out.println(((Voice) animal).voice());
    }
}
