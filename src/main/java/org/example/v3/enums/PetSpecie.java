package org.example.v3.enums;

public enum PetSpecie {
    DOG(true, 4, true),
    CAT(false, 4, true),
    BIRD(true, 2, false),
    FISH(false, 0, false),
    UNKNOWN(false, 0, false);

    private final boolean canFly;
    private final int numberOfLegs;
    private final boolean hasFur;

    PetSpecie(boolean canFly, int numberOfLegs, boolean hasFur) {
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
    }
    PetSpecie() {
        this.canFly = false;
        this.numberOfLegs = 0;
        this.hasFur = false;
    }

    public boolean canFly() {
        return canFly;
    }
    public int getNumberOfLegs() {
        return numberOfLegs;
    }
    public boolean hasFur() {
        return hasFur;
    }
}