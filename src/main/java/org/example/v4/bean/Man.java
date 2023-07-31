package org.example.v4.bean;

import org.example.v4.animal.Pet;

public final class Man extends Human {
    public void repairCar() {
        System.out.println("I am repairing my car.");
    }

    @Override
    public void greetPet(Pet pet) {
        super.greetPet(pet);
    }

    public Man(Family family, String fatherName, String name, double iq) {
        super(family, fatherName, name, iq);
    }

}



