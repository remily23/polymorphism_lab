
public abstract class Cake {

    private String name;
    private String baseFlavour;

    public Cake(String name, String baseFlavour){
        this.name = name;
        this.baseFlavour = baseFlavour;
    }

// Getter
        public String getName(){
        return this.name;
        }

// Setter
        public void setName(String name){
        this.name = name;
        }

// Getter for flavour
        public String getBaseFlavour(){
        return this.baseFlavour;
        }

// Setter for flavour
        public void setBaseFlavour(String baseFlavour){
        this.baseFlavour = baseFlavour;
        }
}
