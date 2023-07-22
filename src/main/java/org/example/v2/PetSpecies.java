package org.example.v2;
public enum PetSpecies {
    CAT("Cat", false, 4, true),
    DOG("Dog", false, 4, true);
    private final String species;
    private final boolean canFly;
    private final int numberOfLeg;
    private final boolean hasFur;
    PetSpecies(String species, boolean canFly, int numberOfLeg, boolean hasFur) {
        this.species = species;
        this.canFly = canFly;
        this.numberOfLeg = numberOfLeg;
        this.hasFur = hasFur;
    }
    public String getSpecies() {
        return species;
    }
    public boolean canFly() {
        return canFly;
    }
    public int getNumberOfLegs() {
        return numberOfLeg;
    }
    public boolean hasFur() {
        return hasFur;
    }
}

