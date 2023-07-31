package org.example.v4.animal;

public class DomesticCat extends Pet {

    @Override
    public void eat() {
        System.out.println("DomestCat eating..");
    }

    @Override
    public void foul() {
        System.out.println("DomesticCat foil");
    }

    @Override
    public void respond() {
        System.out.println("DomesticCat respond..");
    }
}
