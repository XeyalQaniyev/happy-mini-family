package org.example.version2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyFirstTest {

    @Test
    public void testPet() {
        Species species = Species.CAT;
        String nickname = "Barsik";
        int age = 5;
        int trickLevel = 75;
        String[] habits = new String[]{"eat", "drink", "sleep", "poop"};
        Pet pet = new Pet(species, nickname, age, trickLevel, habits);

        assertEquals(species, pet.getSpecies());
        assertEquals(nickname, pet.getNickname());
        assertEquals(age, pet.getAge());
        assertEquals(trickLevel, pet.getTrickLevel());
        assertArrayEquals(habits, pet.getHabits());
    }

    @Test
    public void testFamily() {
        Human father = new Human("John", "Doe", 1980);
        Human mother = new Human("Jane", "Doe", 1982);
        Pet pet = new Pet(Species.CAT, "Barsik", 5, 75, new String[]{"eat", "drink", "sleep", "poop"});
        Human[] children = new Human[2];
        children[0] = new Human("Mary", "Doe", 2000);
        children[1] = new Human("Peter", "Doe", 2002);

        Family family = new Family(father, mother, pet, children);

        assertEquals(father, family.getFather());
        assertEquals(mother, family.getMother());
        assertEquals(pet, family.getPet());
        assertArrayEquals(children, family.getChildren());
    }

    @Test
    public void testSpecies() {
        assertEquals("CAT", Species.CAT.getValue());
        assertEquals("DOG", Species.DOG.getValue());
        assertEquals("BIRD", Species.BIRD.getValue());
        assertEquals("FISH", Species.FISH.getValue());
        assertEquals("FOX", Species.FOX.getValue());
    }
}
