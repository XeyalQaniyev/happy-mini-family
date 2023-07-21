package org.example.v2;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;

    private DayOfWeek[][] schedule;

    public Human() {
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq, DayOfWeek[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    public Human(String name, String surname, int i, int i1) {
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

    public DayOfWeek[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(DayOfWeek[][] schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Human{" + "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year + ", iq=" + iq
                + ", schedule=" + Arrays.deepToString(schedule) + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return getYear() == human.getYear() && getIq() == human.getIq() && Objects.equals(getName(), human.getName()) && Objects.equals(getSurname(), human.getSurname()) && Arrays.equals(getSchedule(), human.getSchedule());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName(), getSurname(), getYear(), getIq());
        result = 31 * result + Arrays.hashCode(getSchedule());
        return result;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collector running in Human ");
    }
}