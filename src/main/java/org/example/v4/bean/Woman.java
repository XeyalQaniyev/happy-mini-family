package org.example.v4.bean;

import org.example.v4.animal.Pet;

public final class Woman extends Human {
    public Woman(Family family, String fatherName, String name, double iq) {
        super(family, fatherName, name, iq);
    }

    public void makeUp() {
        System.out.println("makeUp");
    }

    @Override
    public void greetPet(Pet pet) {
        super.greetPet(pet);
    }


}
