package org.example.version3;

import org.example.version3.animals.*;
import org.example.version3.people.*;
import org.example.version3.enums.DayOfWeek;
import org.example.version3.enums.HumanActivity;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Throwable {

        Human father = new Human() {
            @Override
            public void greetPet() {
                System.out.println("Hello my pet");
            }
        };
        father.setName("Apple");
        father.setSurname("iPhone");
        father.setIq(135);
        father.setYear(1889);
        father.setSchedule(new String[][]{{DayOfWeek.MONDAY.toString(), HumanActivity.WORKING.toString()}, {DayOfWeek.THURSDAY.toString(), HumanActivity.WORKING.toString()}});

        Human mother = new Human() {
            @Override
            public void greetPet() {
                System.out.println("Hello my pet");
            }
        };
        mother.setName("Samsung");
        mother.setSurname("Galaxy");
        mother.setYear(1912);
        mother.setIq(100);
        mother.setSchedule(new String[][]{{DayOfWeek.MONDAY.toString(), HumanActivity.WORKING.toString()}, {DayOfWeek.THURSDAY.toString(), HumanActivity.WORKING.toString()}});


        Man father2 = new Man("Apple", "iPhone", 1889, 135, new String[][]{{DayOfWeek.MONDAY.toString(), HumanActivity.WORKING.toString()}, {DayOfWeek.THURSDAY.toString(), HumanActivity.WORKING.toString()}});
        Woman mother2 = new Woman("Samsung", "Galaxy", 1912, 100, new String[][]{{DayOfWeek.MONDAY.toString(), HumanActivity.WORKING.toString()}, {DayOfWeek.THURSDAY.toString(), HumanActivity.WORKING.toString()}});

        Man man = new Man("Asus", "Rog", 1985, 120, new String[][]{{DayOfWeek.MONDAY.toString(), HumanActivity.WORKING.toString()}});
        Woman woman = new Woman("Asus", "Tuf", 1990, 130, new String[][]{{DayOfWeek.MONDAY.toString(), HumanActivity.WORKING.toString()}});

        Pet dog = new Dog("Xiaomi", 3, 75, new String[]{"eat", "drink", "sleep"});
        dog.foul();

        Pet domesticCat = new DomesticCat("PocoPhone", 3, 60, new String[]{"eat", "drink", "sleep"});
        domesticCat.foul();

        Pet roboCat = new RoboCat("Meizu", 5, 45, new String[]{"eat", "drink", "sleep"});
        roboCat.foul();

        Pet fish = new Fish("Razer", 8, 90, new String[]{"eat", "drink", "sleep"});
        fish.foul();


        Human[] children = new Human[3];
        children[0] = new Human("OnePlus", "iGalaxy", 1998, 100, new String[][]{{DayOfWeek.MONDAY.toString(), HumanActivity.WALKING.toString()}, {DayOfWeek.FRIDAY.toString(), HumanActivity.GAMEPLAY.toString()}}) {
            @Override
            public void greetPet() {
                System.out.println("Hello pet");
            }
        };
        children[1] = new Human("Pixel", "iGalaxy", 2008, 75, new String[][]{{DayOfWeek.MONDAY.toString(), HumanActivity.SCHOOL.toString()}, {DayOfWeek.FRIDAY.toString(), HumanActivity.GYM.toString()}}) {
            @Override
            public void greetPet() {
                System.out.println("Hello pet");
            }
        };
        children[2] = new Human("Asus", "iPixel", 2009, 112, new String[][]{{DayOfWeek.MONDAY.toString(), HumanActivity.SCHOOL.toString()}, {DayOfWeek.FRIDAY.toString(), HumanActivity.GYM.toString()}}) {
            @Override
            public void greetPet() {
                System.out.println("Hello pet");
            }
        };

        Family family = new Family(father, mother, new Pet[]{dog, domesticCat, roboCat, fish}, children);

        family.deleteChild(children[2]);
        System.out.println(family.countFamily());
        System.out.println(family);
        System.out.println(" ");

        man.greetPet();
        woman.greetPet();
        father.greetPet();
        mother.greetPet();
        father2.greetPet();
        mother2.greetPet();
        children[0].greetPet();
        children[1].greetPet();
        children[2].greetPet();
        man.repairCar();
        woman.makeup();

        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(Arrays.toString(children));
        System.out.println(" ");

        dog.eat();
        dog.respond();
        dog.foul();
        dog.describePet();
        System.out.println(" ");

        domesticCat.eat();
        domesticCat.respond();
        domesticCat.foul();
        domesticCat.describePet();
        System.out.println(" ");

        fish.eat();
        fish.respond();
        fish.foul();
        fish.describePet();
        System.out.println(" ");

        roboCat.eat();
        roboCat.respond();
        roboCat.foul();
        roboCat.describePet();


//        Day_Of_Week nextDay = Day_Of_Week.SUNDAY;
//        System.out.println("Tomorrow is: " + nextDay.name());

//        for (int i = 0; i < 1000000000; i++) {
//            father.finalize();
//        }

    }
}
