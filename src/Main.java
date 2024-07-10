import room.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lion");
        Lion lion = new Lion("Lion", 8, 190.5, "Savannah");
        lion.print();
        System.out.println("-------------------");

        System.out.println("Elephant");
        Elephant elephant = new Elephant("Elephant", 25, 5400, 2.1);
        elephant.print();
        System.out.println("-------------------");

        System.out.println("Eagle");
        Eagle eagle = new Eagle("Eagle", 5, 6.5, 2.3);
        eagle.print();
        System.out.println("-------------------");

        System.out.println("Dolphin");
        Dolphin dolphin = new Dolphin("Dolphin", 12, 300, 95);
        dolphin.print();
        System.out.println("-------------------");

        System.out.println("Penguin");
        Penguin penguin = new Penguin("Penguin", 3, 30, "Emperor");
        penguin.print();
    }
}
