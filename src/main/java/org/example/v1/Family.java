package org.example.v1;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Family {
    private final Human father;
    private final Human mother;
    private Pet pet;
    private Human[] children;

    public Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;
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
//            System.out.println("the owner feeds the pet ");
            System.out.printf("I feeds %s", pet.getNickname());
        } else if (!isfeed) {
            Random r = new Random();
            int rValue = r.nextInt(101);
            if (pet.getTrickLevel() < rValue) System.out.println("I think Jack is not hungry.");
            else if (pet.getTrickLevel() > rValue)
//                System.out.println("Hm... I will feed Jack's "+pet.getNickname());
                System.out.printf("Hm... I will feed %s", pet.getNickname());
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

    @Override
    public String toString() {
        return "Family{" + "father=" + father + ", mother=" + mother + ", pet=" + pet + ", children=" + Arrays.toString(children) + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return Objects.equals(getFather(), family.getFather()) && Objects.equals(getMother(), family.getMother()) && Objects.equals(getPet(), family.getPet()) && Arrays.equals(getChildren(), family.getChildren());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getFather(), getMother(), getPet());
        result = 31 * result + Arrays.hashCode(getChildren());
        return result;
    }
}
