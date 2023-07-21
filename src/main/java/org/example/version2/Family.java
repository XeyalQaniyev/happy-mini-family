package org.example.version2;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human father;
    private Human mother;
    private Pet pet;
    private Human[] children;

    public Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;
        this.children = new Human[0];
    }

    public Family(Human father, Human mother, Pet pet, Human[] children) {
        this.father = father;
        this.mother = mother;
        this.pet = pet;
        this.children = children;
    }

    public void greetPet() {
        System.out.printf("Hello, %s\n", pet.getNickname());
    }

    public void describePet() {
        if (pet.getTrickLevel() >= 50)
            System.out.printf("I have a %s, he is %s years old, he is very sly \n", pet.getSpecies(), pet.getAge());
        else
            System.out.printf("I have a %s, he is %s years old, he is almost not sly \n", pet.getSpecies(), pet.getAge());
    }

    public void feedPet(boolean isfeed) {
        if (isfeed) {
            System.out.printf("I feed %s\n", pet.getNickname());
        } else {
            int rValue = (int) (Math.random() * 101);
            if (pet.getTrickLevel() < rValue)
                System.out.println("I think " + pet.getNickname() + " is not hungry.");
            else
                System.out.printf("Hm... I will feed %s\n", pet.getNickname());
        }
    }

    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public void addChild(Human child) {
        Human[] updatedChildren = Arrays.copyOf(children, children.length + 1);
        updatedChildren[children.length] = child;
        children = updatedChildren;
        child.setFamily(this);
    }

    public void deleteChild(int index) {
        if (index < 0 || index >= children.length - 1) {
            return;
        }

        Human[] updatedChildren = new Human[children.length - 1];
        System.arraycopy(children, 0, updatedChildren, 0, index);
        System.arraycopy(children, index + 1, updatedChildren, index, children.length - index - 1);
        children = updatedChildren;
    }


//    public void deleteChild(int index) {
//        if (index < 0 || index >= children.length) {
//            return;
//        }
//
//        Human[] updatedChildren = new Human[children.length - 1];
//        int currentIndex = 0;
//        for (int i = 0; i < children.length; i++) {
//            if (i != index) {
//                updatedChildren[currentIndex] = children[i];
//                currentIndex++;
//            }
//        }
//        children = updatedChildren;
//    }

    public int countFamily() {
        return children.length + 2;
    }

    @Override
    public String toString() {
        return "Family{" +
                "father=" + father +
                ", mother=" + mother +
                ", pet=" + pet +
                ", children=" + Arrays.toString(children) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return Objects.equals(father, family.father) && Objects.equals(mother, family.mother) && Objects.equals(pet, family.pet) && Arrays.equals(children, family.children);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(father, mother, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collector is working for Family class");
    }
}
