package food;

public class Chicken extends Meat {
   public Chicken(){
        super(2);
    }
    private String food = "chicken";

    @Override
    public String toString() {
        return food;
    }
}
