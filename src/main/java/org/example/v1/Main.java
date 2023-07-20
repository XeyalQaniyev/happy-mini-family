package org.example.v1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Human father = new Human();
        father.setName("Akif");
        father.setIq(135);
        father.setYear(1985);
        father.setSurname("Akifzade");
        father.setSchedule(new String[][]{{"Monday", "Word"}, {"Tuesday", "work"}});

        Human mother = new Human();
        mother.setName("Name");
        mother.setSurname("namezade");
        mother.setIq(135);
        mother.setSchedule(new String[][]{{"Monday", "Word"}, {"Tuesday", "work"}});

        Pet pet = new Pet();
        pet.setNickname("Tiger");
        pet.setSpecies("Cat");
        pet.setAge(3);
        pet.setHabits(new String[]{"eat", "drink", "sleep"});
        pet.setTrickLevel(75);

        Human[] children = new Human[2];
        children[0] = new Human("Child1", "Akifzade", 1998, 100, new String[][]{{"Thursday", "School"}, {"Friday", "Sport Section"}});
        children[1] = new Human("Child2", "Akifzade", 2008, 75, new String[][]{{"Thursday", "School"}, {"Friday", "Sport Section"}});

        Family family = new Family(father, mother, pet, children);
        Human child3 = new Human("Child3", "Akifzade", 2009, 112, new String[][]{{"Thursday", "School"}, {"Friday", "Sport Section"}});

        family.adChild(child3);
        System.out.println(Arrays.deepToString(family.getChildren()));

        System.out.println(family.toString());

        family.getPet().respond();
        family.describePet();
        family.getPet().foul();
        family.feedPet(true);

    }
}
