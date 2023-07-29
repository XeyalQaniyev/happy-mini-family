package org.example.version3.classes;

import org.example.version3.enums.Species;

import java.util.Arrays;
import java.util.Objects;

public abstract class Pet {
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet() {
    }

    public Pet(String nickname, int age, int trickLevel, String[] habits) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
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

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public void eat() {
        System.out.println("Get out from here, I'm eating");
    }


    public void describePet() {
        if (getTrickLevel() >= 50)
            System.out.printf("I have a %s, he is %s years old, he is very sly\n", getSpecies(), getAge());
        else
            System.out.printf("I have a %s, he is %s years old, he is almost not sly\n", getSpecies(), getAge());
    }

    public abstract void respond();

    public abstract Species getSpecies();

    @Override
    public String toString() {
        return "Pet{" + "nickname='" + nickname + '\'' + ", age=" + age + ", species=" + getSpecies() + ", trickLevel=" + getTrickLevel() + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return getAge() == pet.getAge() && getTrickLevel() == pet.getTrickLevel() && Objects.equals(getNickname(), pet.getNickname()) && Arrays.equals(getHabits(), pet.getHabits());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getNickname(), getAge(), getTrickLevel());
        result = 31 * result + Arrays.hashCode(getHabits());
        return result;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("GC is running in Pet class");
    }

    public abstract void foul();
}
