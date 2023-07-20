package org.example.v1;

import java.util.Arrays;
import java.util.Objects;

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
