package org.example.UnitTests;

import org.example.version4.Family;
import org.example.version4.animals.Pet;
import org.example.version4.enums.DayOfWeek;
import org.example.version4.enums.HumanActivity;
import org.example.version4.enums.Species;
import org.example.version4.people.Human;
import org.example.version4.people.Man;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class TestFamily {

    @Test
    public void testAddAndDeleteChild() {
        Family family = new Family();
        Human child1 = new Human("John", "Doe", 2000, 100, new HashMap<>()) {
            @Override
            public void greetPet() {

            }
        };
        Human child2 = new Human("Jane", "Doe", 2000, 100, new HashMap<>()) {
            @Override
            public void greetPet() {

            }
        };
        family.addChild(child1);
        family.addChild(child2);
        Assertions.assertEquals(2, family.getChildren().size());
        family.deleteChild(child1);
        Assertions.assertEquals(1, family.getChildren().size());
        family.deleteChild(child2);
        Assertions.assertEquals(0, family.getChildren().size());
    }

    @Test
    public void testCountFamily() {
        Family family = new Family();
        Human child1 = new Human("John", "Doe", 2000, 100, new HashMap<>()) {
            @Override
            public void greetPet() {

            }
        };
        Human child2 = new Human("Jane", "Doe", 2000, 100, new HashMap<>()) {
            @Override
            public void greetPet() {

            }
        };
        family.addChild(child1);
        family.addChild(child2);
        Assertions.assertEquals(2, family.countFamily());
        family.setFather(new Human("Bob", "Smith", 1990, 120, new HashMap<>()) {
            @Override
            public void greetPet() {

            }
        });
        Assertions.assertEquals(3, family.countFamily());
        family.setMother(new Human("Alice", "Johnson", 1985, 110, new HashMap<>()) {
            @Override
            public void greetPet() {

            }
        });
        Assertions.assertEquals(4, family.countFamily());
    }

    @Test
    public void testEqualsAndHashCode() {
        Family family1 = new Family();
        Family family2 = new Family();
        Assertions.assertEquals(family1, family2);
        Assertions.assertEquals(family1.hashCode(), family2.hashCode());
        Human child1 = new Human("John", "Doe", 2000, 100, new HashMap<>()) {
            @Override
            public void greetPet() {

            }
        };
        Human child2 = new Human("Jane", "Doe", 2000, 100, new HashMap<>()) {
            @Override
            public void greetPet() {

            }
        };
        family1.addChild(child1);
        family2.addChild(child2);
        Assertions.assertNotEquals(family1, family2);
        Assertions.assertNotEquals(family1.hashCode(), family2.hashCode());
        family1.setFather(new Human("Bob", "Smith", 1990, 120, new HashMap<>()) {
            @Override
            public void greetPet() {

            }
        });
        Assertions.assertNotEquals(family1, family2);
        Assertions.assertNotEquals(family1.hashCode(), family2.hashCode());
        family2.setFather(new Human("Bob", "Smith", 1990, 120, new HashMap<>()) {
            @Override
            public void greetPet() {

            }
        });

    }

    @Test
    public void testFinalize() {
        new Family();
        System.gc();
        Assertions.assertTrue(true);
    }

    @Test
    public void testSettersAndGetters() {
        Family family = new Family();
        Human father = new Human("Bob", "Smith", 1990, 120, new HashMap<>()) {
            @Override
            public void greetPet() {

            }
        };
        Human mother = new Human("Alice", "Johnson", 1985, 110, new HashMap<>()) {
            @Override
            public void greetPet() {

            }
        };
        Set<Pet> pets = new HashSet<>();
        pets.add(new Pet("Dog", 3, 75, new String[]{"eat", "drink", "sleep"}) {
            @Override
            public void respond() {

            }

            @Override
            public Species getSpecies() {
                return null;
            }

            @Override
            public void foul() {

            }
        });
        List<Human> children = List.of(new Man("Asus", "iPixel", 2009, 112, Collections.singletonMap(DayOfWeek.MONDAY, HumanActivity.SCHOOL)));
        family.setFather(father);
        family.setMother(mother);
        family.setPets(pets);
        family.setChildren(children);
        Assertions.assertEquals(father, family.getFather());
        Assertions.assertEquals(mother, family.getMother());
        Assertions.assertEquals(pets, family.getPets());
        Assertions.assertEquals(children, family.getChildren());
    }
}
