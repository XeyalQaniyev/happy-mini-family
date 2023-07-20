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

        family.addChild(child1);
        family.addChild(child2);

        Pet pet = new Pet("Max", 3, "Roll over");
        family.setPet(pet);

        System.out.println(family.toString());

        family.deleteChild(child1);
        System.out.println(family.toString());
    }
}
