package org.example.v3.animal;


import org.example.v2.PetSpecies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

public abstract class Pet {
    private PetSpecies species;
    private String nickname;
    private int age;
    private int trickLevel;
    private Set habits;

    public Pet() {
    }

    public Pet(PetSpecies species, String nickname, int age, int trickLevel,Set habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public PetSpecies getSpecies() {
        return species;
    }

    public void setSpecies(PetSpecies species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public Set getHabits() {
        return habits;
    }

    public void setHabits(Set habits) {
        this.habits = habits;
    }

    public abstract void eat();
    public abstract void foul();
    public abstract void respond();
}