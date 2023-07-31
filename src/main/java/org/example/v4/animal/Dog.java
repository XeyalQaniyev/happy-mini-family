package org.example.v4.animal;

public class Dog extends Pet {

    @Override
    public void eat() {
        System.out.println("Dog eating");
    }

    @Override
    public void foul() {
        System.out.println("Dog foul..");
    }

    @Override
    public void respond() {
        System.out.println("Dog respond....");
    }
}
