package food;

public class Seaweed extends Grass {
    public Seaweed(){
        super(2);
    }
    private String food = "seaweed";

    @Override
    public String toString() {
        return food;
    }

}
