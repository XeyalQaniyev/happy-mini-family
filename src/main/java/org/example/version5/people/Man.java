package org.example.version5.people;

import org.example.version5.enums.DayOfWeek;
import org.example.version5.enums.HumanActivity;

import java.util.Map;

public final class Man extends Human {

    public Man(String name, String surname, int year, int iq, Map<DayOfWeek, HumanActivity> schedule) {
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
