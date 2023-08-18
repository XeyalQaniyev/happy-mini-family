package org.example.version5.controller;

import org.example.version5.objects.Family;
import org.example.version5.objects.Human;
import org.example.version5.objects.Pet;
import org.example.version5.service.FamilyService;

import java.util.List;
import java.util.Optional;

public class FamilyController {

    private final FamilyService familyMethods;

    public FamilyController(FamilyService familyMethods) {
        this.familyMethods = familyMethods;
    }

    public List<Family> getAllFamilies() {
        return familyMethods.getAllFamilies();
    }

    public Optional<Family> getFamilyByIndex(int index) {
        return familyMethods.getFamilyByIndex(index);
    }

    public boolean deleteFamily(int index) {
        return familyMethods.deleteFamily(index);
    }

    public boolean deleteFamily(Family family) {
        return familyMethods.deleteFamily(family);
    }

    public void saveFamily(Family family) {
        familyMethods.saveFamily(family);
    }

    public int countFamiliesWithMemberNumber(int number) {
        return familyMethods.countFamiliesWithMemberNumber(number);
    }

    public List<Family> getFamiliesBiggerThan(int number) {
        return familyMethods.getFamiliesBiggerThan(number);
    }

    public List<Family> getFamiliesLessThan(int number) {
        return familyMethods.getFamiliesLessThan(number);
    }

    public Family createNewFamily(Human father, Human mother) {
        return familyMethods.createNewFamily(father, mother);
    }

    public Family bornChild(Family family, String maleName, String femaleName) {
        return familyMethods.bornChild(family, maleName, femaleName);
    }

    public Family adoptChild(Family family, Human child) {
        return familyMethods.adoptChild(family, child);
    }

    public Family deleteAllChildrenOlderThen(int age) {
        return familyMethods.deleteAllChildrenOlderThen(age);
    }

    public int count() {
        return familyMethods.count();
    }

    public Optional<Family> getFamilyById(int index) {
        return familyMethods.getFamilyById(index);
    }

    public List<Pet> getPets(int index) {
        return (List<Pet>) familyMethods.getPets(index);
    }

    public void addPet(int index, Pet pet) {
        familyMethods.addPet(index, pet);
    }

    public void deletePet(int index) {
        familyMethods.deletePet(index);
    }
}
