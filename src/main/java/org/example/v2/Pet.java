package org.example.v2;


import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Pet {
    private PetSpecie species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet() {
    }

    public Pet(PetSpecie species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public PetSpecie getSpecies() {
        return species;
    }

    public void setSpecies(PetSpecie species) {
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

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public void eat() {
        System.out.println("eating");
    }

    public void respond() {
        System.out.printf("Hello, owner. I am - %s. I miss you! \n", nickname);
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    public void describePet() {
        if (getTrickLevel() >= 50)
            System.out.printf("I have a %s, he is %s years old, he is very sly \n", getSpecies(), getAge());
        else System.out.printf("I have a %s, he is %s years old, he is almost not sly \n", getSpecies(), getAge());

    }

    public void feedPet(boolean isfeed) {
        if (isfeed) {
            System.out.printf("I feeds %s", getNickname());
        } else if (!isfeed) {
            Random r = new Random();
            int rValue = r.nextInt(101);
            if (getTrickLevel() < rValue) System.out.printf("I think %s is not hungry.", getNickname());
            else if (getTrickLevel() > rValue) System.out.printf("Hm... I will feed %s", getNickname());
        }
    }

    public void greetPet() {
        System.out.printf("Hello, %s\n", getNickname());
    }

    @Override
    public String toString() {
        return "Pet{" + "nickname= '" + nickname + '\'' + ", age= " + age + ", species= " + species + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return getAge() == pet.getAge() && getTrickLevel() == pet.getTrickLevel() && Objects.equals(getSpecies(), pet.getSpecies()) && Objects.equals(getNickname(), pet.getNickname()) && Arrays.equals(getHabits(), pet.getHabits());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getSpecies(), getNickname(), getAge(), getTrickLevel());
        result = 31 * result + Arrays.hashCode(getHabits());
        return result;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("GC is running in Pet class");
    }

}