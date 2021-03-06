package food;

public class Sausage extends Meat{
  public  Sausage(){
        super(1);
    }
        private String food = "sausage";
        @Override
        public String toString(){
            return food;
        }
}
