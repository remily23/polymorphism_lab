public class Cupcake extends Cake {

    protected String toppings;

    public Cupcake(String name, String baseFlavour, String toppings){
        super(name, baseFlavour);
        this.toppings = toppings;
    }

    public void addIcing (String icingType){
        System.out.println("Icing added: " + icingType);
    }

    public String AddIcing() {
        return "Pink icing";
    }
}
