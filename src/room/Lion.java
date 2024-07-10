package room;

public class Lion extends Animal {
    private String habitat;

    public Lion(String name, int age, double weight, String habitat) {
        super(name, age, weight);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Habitat: " + habitat);
    }
}
