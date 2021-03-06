package food;

public abstract class Food {
    private final int SATIETY;
    public Food(int value){
        this.SATIETY = value;
    }
    public int getSATIETY(){
        return SATIETY;
    }
}
