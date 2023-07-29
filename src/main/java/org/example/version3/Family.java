package org.example.version3;

import org.example.version3.animals.Pet;
import org.example.version3.people.Human;

import java.util.Arrays;
import java.util.Objects;

public class Family {

    static {
        System.out.println("Family class is being loaded");
    }

    private Human father;
    private Human mother;
    private Pet[] pets;
    private Human[] children = new Human[0];

    {
        System.out.println("Family object is created");
    }

    public Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;
    }



    public Family(Human father, Human mother, Pet cat) {
        this.father = father;
        this.mother = mother;
    }

    public Family(Human father, Human mother, Pet dog, Pet cat, Pet fish, Pet roboCat, Human[] children) {
        this.father = father;
        this.mother = mother;
    }

    public Family(Human father, Human mother, Pet[] pets, Human[] children) {
        this.father = father;
        this.mother = mother;
        this.pets = pets;
        this.children = children;
    }

    public void addChild(Human child) {
        Human[] newChildren;
        newChildren = new Human[children.length + 1];
        System.arraycopy(children, 0, newChildren, 0, children.length);
        newChildren[children.length] = child;
        children = newChildren;
    }

    public void deleteChildByIndex(int childIndex) {
        if (children.length - 1 < childIndex) return;

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

    public boolean deleteChild(int index) {
        if (index >= 0 && index < children.length) {
            deleteChildByIndex(index);
            return true;
        }
        return false;
    }

    public boolean deleteChild(Human child) {
        for (int i = 0; i < children.length; i++) {
            if (children[i].equals(child)) {
                deleteChildByIndex(i);
                return true;
            }
        }
        return false;
    }

    public int countFamily() {
        return 2 + children.length;
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

    public Pet[] getPet() {
        return pets;
    }

    public void setPet(Pet pet) {
        this.pets = pets;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Family{" + "father=" + father + ", mother=" + mother + ", pets=" + Arrays.toString(pets) + ", children=" + Arrays.toString(children) + '}';
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

    @Override
    protected void finalize() throws Throwable {
        System.out.println("GC is running in Family class");
    }
}
