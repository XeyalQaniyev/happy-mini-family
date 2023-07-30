package org.example.version4.people;

public final class Man extends Human {

    public Man(String name, String surname, int year, int iq, String[][] schedule) {
        super(name, surname, year, iq, schedule);
    }

    public void repairCar() {
        System.out.println("Man is repairing the car");
    }

    @Override
    public void greetPet() {
        System.out.println("Hello pet!");
    }
}
