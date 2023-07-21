package org.example.v1;

public class Main {
    static {
        System.out.println("Family class is being loaded");
    }

    {
        System.out.println("A new object is created (type: " + getClass().getSimpleName() + ")");
    }

    public static void main(String[] args) {
        Family family = new Family(new Human("Oppenheimer", "Doe", 30), new Human("Barbie", "Doe", 28));

        Human child1 = new Human("Max", "Doe", 5);
        Human child2 = new Human("Hamilton", "Doe", 3);

        System.out.println(family.toString());

        family.deleteChild(child1);
        System.out.println(family.toString());

        for (int i = 10_000; i <10_000_000 ; i++) {
          new Human();
        }
    }
}
