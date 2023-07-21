package org.example.version2;

public class Main {
    public static void main(String[] args) {

        WeekDays[][] schedule = {
                {WeekDays.MONDAY, WeekDays.WORK},
                {WeekDays.TUESDAY, WeekDays.DEVELOP}
        };

        WeekDays[][] scheduleChild = {
                {WeekDays.THURSDAY, WeekDays.SCHOOL},
                {WeekDays.FRIDAY, WeekDays.SPORT}
        };

        Human father = new Human("Samsung", "Galaxy", 1969, 130, schedule);
        Human mother = new Human("Apple", "iPhone", 1976, 110, schedule);
        Pet pet = new Pet(Species.CAT, "OnePlus", 5, 75, new String[]{"eat", "drink", "sleep", "poop"});
        Human[] children = new Human[2];
        children[0] = new Human("Google", "Pixel", 1998, 100, scheduleChild);
        children[1] = new Human("Xiaomi", "Mi", 2008, 75, scheduleChild);

        Family family = new Family(father, mother, pet, children);

        System.out.println(family.toString());

        family.getPet().respond();
        family.describePet();
        family.feedPet(true);
        int countBefore = family.countFamily();
        family.deleteChild(0);
        int countAfter = family.countFamily();
        System.out.println("The number of family members before the child was deleted is " + countBefore);
        System.out.println("The number of family members after the child was deleted is " + countAfter);

        System.out.println(family.toString());

//        for (int i= 10_000; i < 10_000_000; i++) {
//            new Human();
//        }
    }
}
