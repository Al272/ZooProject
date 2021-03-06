package food;

public class Bacon extends Meat {
  public Bacon(){
       super(3);
   }
    private String food = "bacon";

    @Override
    public String toString() {
        return food;
    }
}
