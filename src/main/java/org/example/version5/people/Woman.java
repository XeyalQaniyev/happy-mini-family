package org.example.version5.people;

import org.example.version5.enums.Day_Of_Week;
import org.example.version5.enums.Human_Activity;
import org.example.version5.objects.Human;

import java.util.Map;

public final class Woman extends Human {

    public Woman(String name, String surname, int year, int iq, Map<Day_Of_Week, Human_Activity> schedule){
        super(name, surname, year, iq, schedule);
    }

    public Woman(String femaleName, String surname, int year) {
    }

    public void makeup() {
        System.out.println("Woman is doing makeup");
    }

    @Override
    public void greetPet() {
        System.out.println("Hello my pet");
    }
}
