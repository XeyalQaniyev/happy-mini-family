package org.example.v3.bean;

import org.example.v3.animal.Pet;
import org.example.v3.bean.Family;
import org.example.v3.bean.Human;

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



