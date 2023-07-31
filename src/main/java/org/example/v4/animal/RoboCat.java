package org.example.v4.animal;

public class RoboCat extends Pet {
    @Override
    public void eat() {
        System.out.println("RoboCat Eating");
    }
    @Override
    public void foul() {
        System.out.println("RoboCat foul..");
    }
    @Override
    public void respond() {
        System.out.println("RoboCat respond...");
    }
}
