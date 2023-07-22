package org.example.v2;

public enum PetSpecies {

    Cat("Cat"),
    Dog("Dog");

    private String species;

    PetSpecies(String species){
        this.species=species;
    }
    public String getSpecies(){
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
}
