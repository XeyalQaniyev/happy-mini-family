package org.example.v3.animal;

public class Fish extends Pet {
    @Override
    public void eat() {
        System.out.println("fish eat..");
    }

    @Override
    public void foul() {
        System.out.println("Fish foul");
    }

    @Override
    public void respond() {
        System.out.println("Fish respond");
    }
}
