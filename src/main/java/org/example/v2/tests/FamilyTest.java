package org.example.v2.tests;

import org.example.v2.Family;
import org.example.v2.Human;
import org.example.v2.Pet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FamilyTest {
    private Family family;
    private Human father;
    private Human mother;
    private Pet pet;
    private Human child1;
    private Human child2;

    @BeforeEach
    public void setUp() {
        father = new Human("John", "Smith", 1980);
        mother = new Human("Mary", "Smith", 1985);
        pet = new Pet("Dog", "Buddy", 3, 70, new String[]{"sit", "roll over"});
        child1 = new Human("Alice", "Smith", 2005);
        child2 = new Human("Bob", "Smith", 2008);
        family = new Family(father, mother, pet);
    }

    @Test
    public void testAddChild() {
        family.addChild(child1);
        family.addChild(child2);
        assertEquals(2, family.countFamily());
        assertArrayEquals(new Human[]{child1, child2}, family.getChildren());
    }

    @Test
    public void testDeleteChildByIndex_PositiveScenario() {
        family.addChild(child1);
        family.addChild(child2);
        assertEquals(2, family.countFamily());
        family.deleteChildByIndex(1);
        assertEquals(1, family.countFamily());
        assertArrayEquals(new Human[]{child1}, family.getChildren());
    }

    @Test
    public void testDeleteChildByIndex_IndexOutOfRange() {
        family.addChild(child1);
        family.addChild(child2);
        assertEquals(2, family.countFamily());
        assertDoesNotThrow(() -> family.deleteChildByIndex(2));
        assertEquals(2, family.countFamily());
        assertDoesNotThrow(() -> family.deleteChildByIndex(-1));
        assertEquals(2, family.countFamily());
    }

    @Test
    public void testDeleteChild_ObjectPresent() {
        family.addChild(child1);
        family.addChild(child2);
        assertEquals(2, family.countFamily());
        assertTrue(family.deleteChild(child1));
        assertEquals(1, family.countFamily());
        assertArrayEquals(new Human[]{child2}, family.getChildren());
    }

    @Test
    public void testDeleteChild_ObjectNotPresent() {
        family.addChild(child1);
        assertEquals(1, family.countFamily());
        assertFalse(family.deleteChild(child2));
        assertEquals(1, family.countFamily());
        assertArrayEquals(new Human[]{child1}, family.getChildren());
        assertEquals(1, family.countFamily()); // This is the correct position for the last assertion.
    }

    @Test
    public void testCountFamily() {
        assertEquals(2, family.countFamily());
        family.addChild(child1);
        family.addChild(child2);
        assertEquals(4, family.countFamily()); // 2 parents + 2 children
    }

    @Test
    public void testGreetPet() {
        family.greetPet();
    }

    @Test
    public void testDescribePet_HighTrickLevel() {
        family.describePet();
    }

    @Test
    public void testDescribePet_LowTrickLevel() {
        pet.setTrickLevel(20);
        family.describePet();
    }

    @Test
    public void testFeedPet_IsFeed() {
        family.feedPet(true);
    }

    @Test
    public void testFeedPet_IsNotFeed() {
        family.feedPet(false);
    }
}