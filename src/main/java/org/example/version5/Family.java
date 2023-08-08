package org.example.version5;

import org.example.version5.animals.Pet;
import org.example.version5.people.Human;

import java.util.*;

public class Family {

    private Human father;
    private Human mother;
    private Set<Pet> pets;
    private List<String> children;

    public Family() {
        children = new ArrayList<>();
    }

    public void addChild(String child) {
        children.add(child);
    }

    public void deleteChild(String child) {
        children.remove(child);
    }

    public Family(Human father, Human mother, Set<Pet> pets, List<String> childrenList) {
        this.father = father;
        this.mother = mother;
        this.pets = pets;
        this.children = childrenList;
    }

    public Family(Human father, Human mother) {
        this(father, mother, new HashSet<>(), new ArrayList<>());
    }

    public void addChild(Human child) {
        children.add(String.valueOf(child));
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

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public List<String> getChildren() {
        return children;
    }

    public void setChildren(List<String> children) {
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