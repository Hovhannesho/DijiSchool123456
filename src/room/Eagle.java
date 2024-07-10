package room;

public class Eagle extends Animal {
    private double wingspan;

    public Eagle(String name, int age, double weight, double wingspan) {
        super(name, age, weight);
        this.wingspan = wingspan;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Wingspan: " + wingspan + " meters");
    }
}
