package org.example.v4.bean;

import org.example.v4.animal.Pet;

import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Family {
    static {
        System.out.println("Family class is being loaded");
    }

    private Human father;
    private Human mother;
    private Pet pet;
    private List<Human> children;

    static {
        System.out.println("Family object is created");
    }

    public Family(Human father, Human mother, Pet pet, List<Human> children) {
        this.father = father;
        this.mother = mother;
        this.pet = pet;
        this.children = children;
    }

    public Family(Human father, Human mother, Pet pet) {
        this.father = father;
        this.mother = mother;
        this.pet = pet;
    }

    public Family() {

    }

    public void addChild(Human child) {

    }

    public void deleteChild(int index) {
        children.remove(index);
        System.out.println("Child deleted");
    }


    public int countFamily() {
        return 2 + children.size();
    }

    public void describePet() {
        if (pet.getTrickLevel() >= 50)
            System.out.printf("I have a %s, he is %s years old, he is very sly \n", pet.getSpecies(), pet.getAge());
        else
            System.out.printf("I have a %s, he is %s years old, he is almost not sly \n",
                    pet.getSpecies(), pet.getAge());
    }

    public void feedPet(boolean isfeed) {
        if (isfeed) {
            System.out.printf("I feeds %s", pet.getNickname());
        } else if (!isfeed) {
            Random r = new Random();
            int rValue = r.nextInt(101);
            if (pet.getTrickLevel() < rValue) System.out.printf("I think %s is not hungry.", pet.getNickname());
            else if (pet.getTrickLevel() > rValue)
                System.out.printf("Hm... I will feed %s", pet.getNickname());
        }
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Family{" +
                "father=" + father +
                ", mother=" + mother +
                ", pet=" + pet +
                ", children=" + children +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return getFather().equals(family.getFather()) && getMother().equals(family.getMother()) && getPet().equals(family.getPet()) && getChildren().equals(family.getChildren());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFather(), getMother(), getPet(), getChildren());
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("GC is running in Family class");
    }

}