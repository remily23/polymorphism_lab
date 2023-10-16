import java.util.ArrayList;

public class Bakery {

    private ArrayList<Cake> cakes = new ArrayList<>();

    public ArrayList<Cake> getCakes(){
        return cakes;
    }

    public void addCake(Cake cake){
        this.cakes.add(cake);
    }

}
