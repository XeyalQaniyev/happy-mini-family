package org.example.version4.animals;

import org.example.version4.enums.Species;

public class RoboCat extends Pet {

    public RoboCat(String nickname, int age, int trickLevel, String[] habits){
        super(nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("Bleep Bloop, You're such a Failure!!!");
    }

    @Override
    public Species getSpecies() {
        return Species.ROBO_CAT;
    }

    @Override
    public void foul() {
        System.out.println("Robo_Cat has fouled, I need to cover it up!");
    }
}
