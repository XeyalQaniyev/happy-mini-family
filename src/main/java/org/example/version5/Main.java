package org.example.version5;

import org.example.version5.animals.*;
import org.example.version5.enums.Day_Of_Week;
import org.example.version5.enums.Human_Activity;
import org.example.version5.objects.Family;
import org.example.version5.objects.Human;
import org.example.version5.objects.Pet;
import org.example.version5.people.Man;
import org.example.version5.people.Woman;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws Throwable {

        Human father = new Human() {
            @Override
            public void greetPet() {
                out.println("Hello my pet");
            }
        };
        father.setName("Apple");
        father.setSurname("iPhone");
        father.setIq(135);
        father.setYear(1889);
        HashMap<Day_Of_Week, Human_Activity> fatherSchedule = new HashMap<>();
        fatherSchedule.put(Day_Of_Week.MONDAY, Human_Activity.WORKING);
        fatherSchedule.put(Day_Of_Week.THURSDAY, Human_Activity.WORKING);
        father.setSchedule(fatherSchedule);

        Human mother = new Human() {
            @Override
            public void greetPet() {
                out.println("Hello my pet");
            }
        };
        mother.setName("Samsung");
        mother.setSurname("Galaxy");
        mother.setYear(1912);
        mother.setIq(100);
        HashMap<Day_Of_Week, Human_Activity> motherSchedule = new HashMap<>();
        motherSchedule.put(Day_Of_Week.MONDAY, Human_Activity.WORKING);
        motherSchedule.put(Day_Of_Week.THURSDAY, Human_Activity.WORKING);
        mother.setSchedule(motherSchedule);

        Man father2 = new Man("Apple", "iPhone", 1889, 135, fatherSchedule);
        Woman mother2 = new Woman("Samsung", "Galaxy", 1912, 100, motherSchedule);

        Man man = new Man("Asus", "Rog", 1985, 120, Collections.singletonMap(Day_Of_Week.MONDAY, Human_Activity.WORKING));
        Woman woman = new Woman("Asus", "Tuf", 1990, 130, Collections.singletonMap(Day_Of_Week.MONDAY, Human_Activity.WORKING));

        Pet dog = new Dog("Xiaomi", 3, 75, new HashSet<>(Arrays.asList("eat", "drink", "sleep")).toArray(new String[0]));
        dog.foul();

        Pet domesticCat = new Domestic_Cat("PocoPhone", 3, 60, new HashSet<>(Arrays.asList("eat", "drink", "sleep")).toArray(new String[0]));
        domesticCat.foul();

        Pet roboCat = new Robo_Cat("Meizu", 5, 45, new HashSet<>(Arrays.asList("eat", "drink", "sleep")).toArray(new String[0]));
        roboCat.foul();

        Pet fish = new Fish("Razer", 8, 90, new HashSet<>(Arrays.asList("eat", "drink", "sleep")).toArray(new String[0]));
        fish.foul();

        ArrayList<Human> children = new ArrayList<>();
        children.add(new Human("OnePlus", "iGalaxy", 1998, 100, Collections.singletonMap(Day_Of_Week.MONDAY, Human_Activity.WALKING)) {
            @Override
            public void greetPet() {
                out.println("Hello pet");
            }
        });
        for (int i = 0; i < 2; i++) {
            children.add(new Human("Pixel", "iGalaxy", 2008, 75, Collections.singletonMap(Day_Of_Week.MONDAY, Human_Activity.SCHOOL)) {
                @Override
                public void greetPet() {
                    out.println("Hello pet");
                }
            });
        }

        ArrayList<String> childrenNames = children.stream().map(Human::getName).collect(Collectors.toCollection(ArrayList::new));

        out.println(childrenNames);

        ArrayList<Human> childrenList = new ArrayList<>();
        childrenNames.forEach(childName -> {
            Human child = new Human() {
                @Override
                public void greetPet() {
                    out.println("Hello pet");
                }
            };
            child.setName(childName);
            childrenList.add(child);
        });

        Set<Pet> pets = new HashSet<>(Arrays.asList(dog, domesticCat, roboCat, fish));

        Family family = new Family(father, mother, pets, childrenList);

        family.deleteChild(childrenList.get(2));
        out.println(family.countFamily());
        out.println(family);
        out.println(" ");

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

        out.println(father);
        out.println(mother);
        out.println(children);
        out.println(" ");

        dog.eat();
        dog.respond();
        dog.foul();
        dog.describePet();
        out.println(" ");

        domesticCat.eat();
        domesticCat.respond();
        domesticCat.foul();
        domesticCat.describePet();
        out.println(" ");

        fish.eat();
        fish.respond();
        fish.foul();
        fish.describePet();
        out.println(" ");

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
