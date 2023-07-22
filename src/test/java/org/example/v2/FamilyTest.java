package org.example.v2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class FamilyTest {
    private Family family;
    private Human father;
    private Human mother;
    private Human child;
    private Human child2;
    private Human child3;
    private Human child4;
    private Human child5;

    @BeforeEach
    void setUp() {
        father = new Human("John", "Smith", 1970);
        mother = new Human("Jane", "Smith", 1970);
        family = new Family(father, mother);

        child = new Human("John", "Smith", 2000);
        child2 = new Human("Jane", "Smith", 2000);
        child3 = new Human("John", "Smith", 2000);
        child4 = new Human("Jane", "Smith", 2000);
        child5 = new Human("John", "Smith", 2000);

        family.addChild(child);
        family.addChild(child2);
        family.addChild(child3);
        family.addChild(child4);
        family.addChild(child5);

    }


    @Test
    void describePetWhenTrickLevelIsGreaterOrEqualTo50() {
        Pet pet = new Pet(PetSpecies.Cat, "Fluffy", 5, 60, new String[]{"sleeping", "playing"});

        family.setPet(pet);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        family.describePet();

        String expectedOutput = "I have a Cat, he is 5 years old, he is very sly \n";
        String actualOutput = outputStream.toString();

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void describePetWhenTrickLevelIsLessThan50() {
        Pet pet = new Pet(PetSpecies.Cat, "Fluffy", 3, 40, new String[]{"sleeping", "playing"});

        family.setPet(pet);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        family.describePet();

        String expectedOutput = "I have a Cat, he is 3 years old, he is almost not sly \n";
        String actualOutput = outputStream.toString();

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void greetPetByItsNickname() {
        Pet pet = new Pet(PetSpecies.Dog, "Buddy", 5, 80, new String[]{"Fetch", "Roll over"});

        family.setPet(pet);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        family.greetPet();

        String expectedOutput = "Hello, Buddy\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void feedPetWhenIsfeedIsTrue() {
        Pet pet = new Pet(PetSpecies.Dog, "Buddy", 5, 80, new String[]{"Fetch", "Roll over"});

        family.setPet(pet);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        family.feedPet(true);

        String expectedOutput = "I feeds Buddy";
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    void countFamilyWhenNoChildren() {
        Family family = new Family(father, mother);
        int expectedCount = 2;

        int actualCount = family.countFamily();

        assertEquals(expectedCount, actualCount);
    }

    @Test
    void countFamilyAfterAddingChild() {
        int expectedCount = 7;
        int actualCount = family.countFamily();
        assertEquals(expectedCount, actualCount);
    }

    @Test
    void countFamilyWhenChildrenExist() {
        int expectedCount = 7;
        int actualCount = family.countFamily();
        assertEquals(expectedCount, actualCount);
    }

    @Test
    void countFamilyAfterDeletingChild() {
        family.deleteChild(2);
        int expectedCount = 7 - 1;
        int actualCount = family.countFamily();
        assertEquals(expectedCount, actualCount);
    }

    @Test
    void deleteChildWhenChildIsPresent() {
        boolean result = family.deleteChild(child);
        assertTrue(result);
        assertEquals(4, family.getChildren().length);
    }

    @Test
    void deleteChildWhenChildIsNotPresent() {
        boolean result = family.deleteChild(new Human("Alice", "Smith", 2005));
        assertFalse(result);
        assertEquals(5, family.getChildren().length);
    }

    @Test
    void deleteChildWhenIndexIsInvalid() {
        int initialFamilySize = family.countFamily();
        int invalidIndex = -1;

        boolean result = family.deleteChild(invalidIndex);

        assertEquals(initialFamilySize, family.countFamily());
        assertFalse(result);
    }

    @Test
    void deleteChildWhenIndexIsValid() {
        int initialFamilySize = family.countFamily();
        int indexToDelete = 2;

        boolean result = family.deleteChild(indexToDelete);

        assertEquals(initialFamilySize - 1, family.countFamily());
        assertTrue(result);
    }

    @Test
    void deleteChildByIndexWhenIndexOutOfBounds() {
        int initialChildrenCount = family.getChildren().length;
        int invalidIndex = family.getChildren().length + 1;

        family.deleteChildByIndex(invalidIndex);

        assertEquals(initialChildrenCount, family.getChildren().length);
    }

    @Test
    void deleteChildByIndex() {
        int initialCount = family.countFamily();
        int indexToDelete = 2;

        family.deleteChildByIndex(indexToDelete);

        assertEquals(initialCount - 1, family.countFamily());
        assertEquals(child, family.getChildren()[0]);
        assertEquals(child2, family.getChildren()[1]);
        assertEquals(child4, family.getChildren()[2]);
        assertEquals(child5, family.getChildren()[3]);
    }

    @Test
    void addChildToFamily() {
        family.addChild(new Human("Alex", "Smith", 2005));

        assertEquals(6, family.getChildren().length);
        assertEquals("Alex", family.getChildren()[5].getName());
        assertEquals("Smith", family.getChildren()[5].getSurname());
        assertEquals(2005, family.getChildren()[5].getYear());
    }

    @Test
    void childrenArraySizeIncreaseAfterAddingChild() {
        int initialSize = family.getChildren().length;
        Human newChild = new Human("Alex", "Smith", 2005);
        family.addChild(newChild);
        int newSize = family.getChildren().length;

        assertEquals(initialSize + 1, newSize);
    }

    @Test
    void childAddedAtEndOfChildrenArray() {
        int initialChildrenCount = family.getChildren().length;

        Human newChild = new Human("Alex", "Smith", 2005);
        family.addChild(newChild);

        Human[] children = family.getChildren();
        int updatedChildrenCount = children.length;

        assertEquals(initialChildrenCount + 1, updatedChildrenCount);
        assertEquals(newChild, children[updatedChildrenCount - 1]);
    }
}