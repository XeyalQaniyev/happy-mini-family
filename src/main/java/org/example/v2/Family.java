package org.example.v2;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Family {
    static {
        System.out.println("Family class is being loaded");
    }

    private Human father;
    private Human mother;
    private Pet pet;
    private Human [] children = new Human[0];

    {
        System.out.println("Family object is created");
    }


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

    public Family(Human father, Human mother, Pet pet) {
        this.father = father;
        this.mother = mother;
        this.pet = pet;
    }

//    public void addChild(Human child) {
//        Human[] newChildren = Arrays.copyOf(children, children.length + 1);
//        newChildren[children.length] = child;
//        children = newChildren;
//    }
    public void addChild(Human child) {
        Human[] newChildren;
//        if (children==null){
//            newChildren=new Human[]{child};
//        }else{
             newChildren = new Human[children.length + 1];
            System.arraycopy(children, 0, newChildren, 0, children.length);
            newChildren[children.length] = child;
//        }

        children = newChildren;
    }

    public void deleteChildByIndex(int childIndex) {
        if (children.length-1<childIndex) return;

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
            if (pet.getTrickLevel() < rValue) System.out.printf("I think %s is not hungry.", pet.getNickname());
            else if (pet.getTrickLevel() > rValue)
//                System.out.println("Hm... I will feed Jack's "+pet.getNickname());
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

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Family{" + "father=" + father + ", mother=" + mother + ", pet=" + pet + ", children=" + Arrays.deepToString(children) + '}';
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
