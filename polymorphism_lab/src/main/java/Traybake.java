public class Traybake extends Cake {

    private boolean healthier;
    protected String decoration;

    public Traybake(String name, String baseFlavour, boolean healthier) {
        super(name, baseFlavour);
        this.healthier = healthier;
    }

    public void addDecoration(String decorationType){
        decoration = decorationType;
        System.out.println("Decoration added: " + decorationType);
    }

}
