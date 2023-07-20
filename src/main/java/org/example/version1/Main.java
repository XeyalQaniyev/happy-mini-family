package org.example.version1;

public class Main {
    public static void main(String[] args) {
        Human father = new Human("Samsung", "Galaxy", 1969, 130, new String[][]{{"Monday", "Work"}, {"Tuesday", "Develop"}});
        Human mother = new Human("Apple", "iPhone", 1976, 110, new String[][]{{"Monday", "Word"}, {"Tuesday", "Cooking"}});
        Pet pet = new Pet("Dog", "OnePlus", 5, 75, new String[]{"eat", "drink", "sleep"});
        Human[] children = new Human[2];
        children[0] = new Human("Google", "Pixel", 1998, 100, new String[][]{{"Thursday", "School"}, {"Friday", "Sport Section"}});
        children[1] = new Human("Xiaomi", "Mi", 2008, 75, new String[][]{{"Thursday", "School"}, {"Friday", "Sport Section"}});

        Family family = new Family(father, mother, pet, children);

        System.out.println(family.toString());

        family.getPet().respond();
        family.describePet();
        family.feedPet(true);
        family.deleteChild(0);


        System.out.println(family.toString());
    }
}
