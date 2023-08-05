package org.example.v4.bean;

import org.example.v4.animal.Pet;
import org.example.v4.enums.DayOfWeek;
import org.example.v4.enums.HumanActivity;

import java.util.*;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Family family;
    private String fatherName;
    private Map<DayOfWeek, List<HumanActivity>> schedule;

    public Human(String name) {
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }


    public Human(String name, String surname, int year, int iq, Family family, String fatherName, Map<DayOfWeek, List<HumanActivity>> schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.family = family;
        this.fatherName = fatherName;
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public Human(Family family, String fatherName, String name, double iq) {
        this.family = family;
        this.fatherName = fatherName;
        this.name = name;
        this.iq = (int) iq;
    }

    public void greetPet(Pet pet) {
        String nickname = pet.getNickname();
        System.out.println("The pet's nickname is: " + nickname);

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

    public Map<DayOfWeek, List<HumanActivity>> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<DayOfWeek, List<HumanActivity>> schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", family=" + family +
                ", fatherName='" + fatherName + '\'' +
                ", schedule=" + schedule +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return getYear() == human.getYear() && getIq() == human.getIq() && getName().equals(human.getName()) &&
                getSurname().equals(human.getSurname()) && getFamily().equals(human.getFamily()) &&
                getFatherName().equals(human.getFatherName()) && getSchedule().equals(human.getSchedule());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getYear(), getIq(), getFamily(), getFatherName(), getSchedule());
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collector running in Human ");
    }
}