import interfaces.Icingable;

public class Cupcake extends Cake implements Icingable {

    private String icing;

    public Cupcake(String name, String baseFlavour, String icing){
        super(name, baseFlavour);
        this.icing = null; // starts off with no icing
    }

    @Override
    public String addIcing (String flavour){
        this.icing = flavour;
        return flavour;
    }

    public String getIcing(){
        return icing;
    }

    @Override
    public String getIcing(){
        return "Cupcake: " +getName()
                + "Base flavour: " + getBaseFlavour()
                + "Icing: " + getIcing();
    }



}
