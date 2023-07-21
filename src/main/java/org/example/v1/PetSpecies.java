package org.example.v1;

public enum PetSpecies {
    CAT("Cat"),
    DOG("Dog");

    private final String species;

    PetSpecies(String species){
        this.species=species;
    }
    public String getSpecies(){
        return species;
    }
}
