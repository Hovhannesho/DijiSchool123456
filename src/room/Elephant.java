package room;

public class Elephant extends Animal {
    private double trunkLength;

    public Elephant(String name, int age, double weight, double trunkLength) {
        super(name, age, weight);
        this.trunkLength = trunkLength;
    }

    public double getTrunkLength() {
        return trunkLength;
    }

    public void setTrunkLength(double trunkLength) {
        this.trunkLength = trunkLength;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Trunk Length: " + trunkLength + " meters");
    }
}
