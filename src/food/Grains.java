package food;

public class Grains extends Grass {
   public Grains(){
        super(3);
    }
    private String food = "grains";

    @Override
    public String toString() {
        return food;
    }
}
