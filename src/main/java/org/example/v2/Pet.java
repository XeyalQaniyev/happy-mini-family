package org.example.v2;

import java.util.Arrays;
import java.util.Objects;

public class Pet {
    private PetSpecies species;
    private String nickname;
    private int age;

    public Pet(PetSpecies species, String nickname, int age, int trickLevel, ExtracurricularActivities[][] schedule) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.schedule = schedule;
    }
    @Override
    public String toString() {
        return "Pet{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", species=" + species.getSpecies() +
                ", canFly=" + species.canFly() +
                ", numberOfLegs=" + species.getNumberOfLegs() +
                ", hasFur=" + species.hasFur() +
                '}';
    }
    private int trickLevel;
    private ExtracurricularActivities[][] schedule;
    public Pet(String fluffy, int i, PetSpecies cat) {
    }
    public Pet(String dog, String species, int age, int trickLevel, String[] strings) {
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
    public ExtracurricularActivities[][] getSchedule() {
        return schedule;
    }
    public void setSchedule(ExtracurricularActivities[][] schedule) {
        this.schedule = schedule;
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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return getAge() == pet.getAge() && getTrickLevel() == pet.getTrickLevel() && Objects.equals(getSpecies(),
                pet.getSpecies()) && Objects.equals(getNickname(), pet.getNickname()) &&
                Arrays.equals(getSchedule(), pet.getSchedule());
    }
    @Override
    public int hashCode() {
        int result = Objects.hash(getSpecies(), getNickname(), getAge(), getTrickLevel());
        result = 31 * result + Arrays.hashCode(getSchedule());
        return result;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collector running in Pet");
    }
}