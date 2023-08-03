package org.example.version4.people;

import org.example.version4.enums.DayOfWeek;
import org.example.version4.enums.HumanActivity;

import java.util.Map;
import java.util.Objects;

public abstract class Human {

    private String name;
    private String surname;
    private int year;
    private int iq;
    private Map<DayOfWeek, HumanActivity> schedule;

    public Human() {
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq, Map<DayOfWeek, HumanActivity> schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Map<DayOfWeek, HumanActivity> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<DayOfWeek, HumanActivity> schedule) {
        this.schedule = schedule;
    }

    public abstract void greetPet();

    @Override
    public String toString() {
        return "Human{" + "name='" + name + '\'' + ", surname='" + surname + '\'' +
                ", year=" + year + ", iq=" + iq + ", schedule=" + schedule + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return year == human.year && Objects.equals(name, human.name) && Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, year, iq);
        result = 31 * result + schedule.hashCode();
        return result;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("GC is running in Human class");
    }
}
