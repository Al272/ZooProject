package food;

public class Leaves extends Grass{
    public Leaves(){
        super(1);
    }
        private String food = "leaves";
        @Override
        public String toString(){
            return food;
        }
}
