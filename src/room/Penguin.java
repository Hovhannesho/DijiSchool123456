package room;

public class Penguin extends Animal {
    private String species;

    public Penguin(String name, int age, double weight, String species) {
        super(name, age, weight);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Species: " + species);
    }
}
