package org.example.version0;

public class Main {
    public static void main(String[] args) {
        String[] habits = {"eat", "drink", "sleep"};
        Pet cat = new Pet("Cat", "Xiaomi", 5, 30, habits);

        String[][] schedule = {
                {"Monday", "VideoGames"},
                {"Tuesday", "Gym"},
                {"Wednesday", "WaterPolo"},
        };

        Human mother = new Human("Samsung", "Galaxy", 1969, 130, schedule);
        Human father = new Human("Apple", "Iphone", 1976, 110, schedule);
        Human child = new Human("Google", "Pixel", 1998, father, mother, cat, 100);

        cat.eat();
        cat.respond();
        cat.foul();

        child.greetPet();
        child.describePet();

        System.out.println(cat);
        System.out.println(child);
        System.out.println(mother);
        System.out.println(father);
    }
}
