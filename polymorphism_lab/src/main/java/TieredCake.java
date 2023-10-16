public class TieredCake extends Cake {

    private int tiers;

    public TieredCake(String name, String baseFlavour, int tiers){
        super(name, baseFlavour);
        this.tiers = tiers;
    }

    public void addDecoration(String decorationType) {
        decoration = decorationType;
        System.out.println("Decoration added " + decorationType);
    }

}
