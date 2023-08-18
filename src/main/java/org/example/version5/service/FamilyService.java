package org.example.version5.service;

import org.example.version5.objects.Family;
import org.example.version5.objects.Human;
import org.example.version5.objects.Pet;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface FamilyService {

    List<Family> getAllFamilies();

    Optional<Family> getFamilyByIndex(int index);
    boolean deleteFamily(int index);

    boolean deleteFamily(Family family);

    void saveFamily(Family family);

    int countFamiliesWithMemberNumber(int number);

    List<Family> getFamiliesBiggerThan(int number);

    List<Family> getFamiliesLessThan(int number);

    Family createNewFamily(Human father, Human mother);

    Family bornChild(Family family, String maleName, String femaleName);

    Family adoptChild(Family family, Human child);

    Family deleteAllChildrenOlderThen(int age);

    int count();

    Optional<Family> getFamilyById(int index);

    Set<Pet> getPets(int index);

    void addPet(int index, Pet pet);

    void deletePet(int index);
}
