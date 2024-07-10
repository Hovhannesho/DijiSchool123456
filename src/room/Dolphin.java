package room;

public class Dolphin extends Animal {
    private int intelligenceLevel;

    public Dolphin(String name, int age, double weight, int intelligenceLevel) {
        super(name, age, weight);
        this.intelligenceLevel = intelligenceLevel;
    }

    public int getIntelligenceLevel() {
        return intelligenceLevel;
    }

    public void setIntelligenceLevel(int intelligenceLevel) {
        this.intelligenceLevel = intelligenceLevel;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Intelligence Level: " + intelligenceLevel);
    }
}
