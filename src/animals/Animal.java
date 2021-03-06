package animals;

import food.Food;

public abstract class Animal {
   private String name;
   private int satiety;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getSatiety() {
      return satiety;
   }

   public Animal(String name, int satiety) {
      this.name = name;
      this.satiety = satiety;
   }

   public void setSatiety(int satiety) {
      this.satiety +=satiety;
   }

   public boolean wantEat(){
      System.out.println("I want eat!!!");
      return false;
   }
   public abstract boolean eat(Food food);
   public abstract boolean play();
}
