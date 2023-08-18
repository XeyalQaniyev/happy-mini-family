package org.example.version5.objects;

import java.util.*;

public class Family {

    private Human father;
    private Human mother;
    private Set<Pet> pets;
    private List<Human> children;

    public Family() {
        children = new ArrayList<>();
    }

    public Family(Human father, Human mother, Set<Pet> pets, List<Human> children) {
        this.father = father;
        this.mother = mother;
        this.pets = pets;
        this.children = children;
    }

    public Family(Human father, Human mother) {
    }

    public void addChild(Human child) {
        children.add(child);
    }

    public boolean deleteChildByIndex(int childIndex) {
        if (childIndex >= 0 && childIndex < children.size()) {
            children.remove(childIndex);
            return true;
        } else {
            return false;
        }
    }

    public boolean deleteChild(Human child) {
        return children.remove(child);
    }

    public int countFamily() {
        int familyCount = 0;

        if (father != null) {
            familyCount++;
        }

        if (mother != null) {
            familyCount++;
        }

        familyCount += children.size();

        return familyCount;
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

    public Set<Pet> getPets() {
        return pets;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Family{" + "father=" + father + ", mother=" + mother + ", pets=" + pets + ", children=" + children + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return Objects.equals(father, family.father) && Objects.equals(mother, family.mother) && Objects.equals(pets, family.pets) && Objects.equals(children, family.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(father, mother, pets, children);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("GC is running in Family class");
    }
}
