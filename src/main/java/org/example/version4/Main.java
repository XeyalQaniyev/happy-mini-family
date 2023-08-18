package org.example.version4;

import org.example.version4.animals.*;
import org.example.version4.enums.DayOfWeek;
import org.example.version4.enums.HumanActivity;
import org.example.version4.people.Human;
import org.example.version4.people.Man;
import org.example.version4.people.Woman;

import java.util.*;
import java.util.stream.Collectors;

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
        Map<DayOfWeek, HumanActivity> fatherSchedule = new HashMap<>();
        fatherSchedule.put(DayOfWeek.MONDAY, HumanActivity.WORKING);
        fatherSchedule.put(DayOfWeek.THURSDAY, HumanActivity.WORKING);
        father.setSchedule(fatherSchedule);

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
        Map<DayOfWeek, HumanActivity> motherSchedule = new HashMap<>();
        motherSchedule.put(DayOfWeek.MONDAY, HumanActivity.WORKING);
        motherSchedule.put(DayOfWeek.THURSDAY, HumanActivity.WORKING);
        mother.setSchedule(motherSchedule);

        Man father2 = new Man("Apple", "iPhone", 1889, 135, fatherSchedule);
        Woman mother2 = new Woman("Samsung", "Galaxy", 1912, 100, motherSchedule);

        Man man = new Man("Asus", "Rog", 1985, 120, Collections.singletonMap(DayOfWeek.MONDAY, HumanActivity.WORKING));
        Woman woman = new Woman("Asus", "Tuf", 1990, 130, Collections.singletonMap(DayOfWeek.MONDAY, HumanActivity.WORKING));

        Pet dog = new Dog("Xiaomi", 3, 75, new HashSet<>(Arrays.asList("eat", "drink", "sleep")).toArray(new String[0]));
        dog.foul();

        Pet domesticCat = new DomesticCat("PocoPhone", 3, 60, new HashSet<>(Arrays.asList("eat", "drink", "sleep")).toArray(new String[0]));
        domesticCat.foul();

        Pet roboCat = new RoboCat("Meizu", 5, 45, new HashSet<>(Arrays.asList("eat", "drink", "sleep")).toArray(new String[0]));
        roboCat.foul();

        Pet fish = new Fish("Razer", 8, 90, new HashSet<>(Arrays.asList("eat", "drink", "sleep")).toArray(new String[0]));
        fish.foul();

        List<Human> children = new ArrayList<>();
        children.add(new Human("OnePlus", "iGalaxy", 1998, 100, Collections.singletonMap(DayOfWeek.MONDAY, HumanActivity.WALKING)) {
            @Override
            public void greetPet() {
                System.out.println("Hello pet");
            }
        });
        children.add(new Human("Pixel", "iGalaxy", 2008, 75, Collections.singletonMap(DayOfWeek.MONDAY, HumanActivity.SCHOOL)) {
            @Override
            public void greetPet() {
                System.out.println("Hello pet");
            }
        });
        children.add(new Human("Asus", "iPixel", 2009, 112, Collections.singletonMap(DayOfWeek.MONDAY, HumanActivity.SCHOOL)) {
            @Override
            public void greetPet() {
                System.out.println("Hello pet");
            }
        });

        List<Human> childrenNames = new ArrayList<>();
        children.forEach(child -> childrenNames.add(child));

        System.out.println(childrenNames);

        Set<Pet> pets = new HashSet<>(Arrays.asList(dog, domesticCat, roboCat, fish));

//        List<String> childrenNames = children.stream().map(Human::getName).collect(Collectors.toList());

        Family family = new Family(father, mother, pets, childrenNames);

        family.deleteChild(children.get(2));
        System.out.println(family.countFamily());
        System.out.println(family);
        System.out.println(" ");

        man.greetPet();
        woman.greetPet();
        father.greetPet();
        mother.greetPet();
        father2.greetPet();
        mother2.greetPet();
        children.get(0).greetPet();
        children.get(1).greetPet();
        children.get(2).greetPet();
        man.repairCar();
        woman.makeup();

        System.out.println(father);
        System.out.println(mother);
        System.out.println(children);
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

        /*
        Day_Of_Week nextDay = Day_Of_Week.SUNDAY;
        System.out.println("Tomorrow is: " + nextDay.name());
        for (int i = 0; i < 1000000000; i++) {
            father.finalize();
        }
        */
    }
}
