package org.example.version5.animals;

import org.example.version5.enums.Species;
import org.example.version5.objects.Pet;

public class Domestic_Cat extends Pet {

    public Domestic_Cat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("Double Failure!!");
    }

    @Override
    public Species getSpecies() {
        return Species.CAT;
    }

    @Override
    public void foul() {
        System.out.println("Cat has fouled, I need to cover it up!");
    }
}
