package org.example.v2;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Family {
    private Human father;
    private Human mother;
    private Pet pet;
    private Human[] children;

    public Family(Human father, Human mother, Pet pet, Human[] children) {
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
    public Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;
        this.children = new Human[0];
    }
    public Family() {

    }
    public void addChild(Human child) {
        if (children == null) {
            children = new Human[1];
            children[0] = child;
        } else {
            Human[] newChildren = new Human[children.length + 1];
            System.arraycopy(children, 0, newChildren, 0, children.length);
            newChildren[children.length] = child;
            children = newChildren;
        }
    }
    public void deleteChildByIndex(int childIndex) {
        Human[] newChildren = new Human[children.length - 1];
        int count = 0;
        for (int i = 0; i < children.length; i++) {
            if (i != childIndex) {
                newChildren[count] = children[i];
                count++;
            }
        }
        children = newChildren;
    }
    public boolean deleteChild(Human child) {
        int i = 0;
        for (Human human : children) {
            if (human.equals(child) || human.hashCode() == child.hashCode()) {
                deleteChildByIndex(i);
                return true;
            }
            i++;
        }
        return false;
    }
    public int countFamily() {
        return 2 + children.length;
    }
    public void greetPet() {
        System.out.printf("Hello, %s\n", pet.getNickname());
    }
    public void describePet() {
        if (pet.getTrickLevel() >= 50)
            System.out.printf("I have a %s, he is %s years old, he is very sly\n", pet.getSpecies(), pet.getAge());
        else
            System.out.printf("I have a %s, he is %s years old, he is almost not sly\n",
                    pet.getSpecies(), pet.getAge());
    }
    public void feedPet(boolean isfeed) {
        if (isfeed) {
            System.out.printf("I feed %s\n", pet.getNickname());
        } else if (!isfeed) {
            Random r = new Random();
            int rValue = r.nextInt(101);
            if (pet.getTrickLevel() < rValue) {
                System.out.printf("I think %s is not hungry.\n", pet.getNickname());
            } else if (pet.getTrickLevel() > rValue) {
                System.out.printf("Hm... I will feed %s\n", pet.getNickname());
            }
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
    public Human[] getChildren() {
        return children;
    }
    public void setChildren(Human[] children) {
        this.children = (children != null) ? children : new Human[0];
    }
    @Override
    public String toString() {
        return "Family{" +
                "father=" + father +
                ", mother=" + mother +
                ", pet=" + pet +
                ", children=" + Arrays.deepToString(children) +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return Objects.equals(getFather(), family.getFather()) &&
                Objects.equals(getMother(), family.getMother()) &&
                Objects.equals(getPet(), family.getPet()) &&
                Arrays.equals(getChildren(), family.getChildren());
    }
    @Override
    public int hashCode() {
        int result = Objects.hash(getFather(), getMother(), getPet());
        result = 31 * result + Arrays.hashCode(getChildren());
        return result;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector running in Family");
    }
}
