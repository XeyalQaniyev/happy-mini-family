package org.example.version5.people;

import org.example.version5.enums.Day_Of_Week;
import org.example.version5.enums.Human_Activity;
import org.example.version5.objects.Human;

import java.util.Map;

public final class Man extends Human {

    public Man(String name, String surname, int year, int iq, Map<Day_Of_Week, Human_Activity> schedule) {
        super(name, surname, year, iq, schedule);
    }

    public Man(String maleName, String surname, int year) {
    }

    public void repairCar() {
        System.out.println("Man is repairing the car");
    }

    @Override
    public void greetPet() {
        System.out.println("Hello pet!");
    }
}
