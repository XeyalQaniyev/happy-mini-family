package org.example.version5.people;

import org.example.version5.enums.DayOfWeek;
import org.example.version5.enums.HumanActivity;

import java.util.Map;

public final class Woman extends Human {

    public Woman(String name, String surname, int year, int iq, Map<DayOfWeek, HumanActivity> schedule){
        super(name, surname, year, iq, schedule);
    }

    public void makeup() {
        System.out.println("Woman is doing makeup");
    }

    @Override
    public void greetPet() {
        System.out.println("Hello my pet");
    }
}
