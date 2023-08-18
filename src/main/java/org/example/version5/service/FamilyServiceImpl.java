package org.example.version5.service;

import org.example.version5.dao.Family_Dao;
import org.example.version5.objects.Family;
import org.example.version5.objects.Human;
import org.example.version5.objects.Pet;

import java.util.List;
import java.util.Optional;
import java.util.Set;


public class FamilyServiceImpl implements FamilyService {

    private final Family_Dao familyDao;

    public FamilyServiceImpl(Family_Dao familyDao) {
        this.familyDao = familyDao;
    }

    @Override
    public List<Family> getAllFamilies() {
        return familyDao.getAllFamilies();
    }

    @Override
    public Optional<Family> getFamilyByIndex(int index) {
        return familyDao.getFamilyByIndex(index);
    }
    @Override
    public boolean deleteFamily(int index) {
        return familyDao.deleteFamily(index);
    }

    @Override
    public boolean deleteFamily(Family family) {
        return familyDao.deleteFamily(family);
    }

    @Override
    public void saveFamily(Family family) {
        familyDao.saveFamily(family);
    }

    @Override
    public int countFamiliesWithMemberNumber(int number) {
        return familyDao.countFamiliesWithMemberNumber(number);
    }

    @Override
    public List<Family> getFamiliesBiggerThan(int number) {
        return familyDao.getFamiliesBiggerThan(number);
    }

    @Override
    public List<Family> getFamiliesLessThan(int number) {
        return familyDao.getFamiliesLessThan(number);
    }

    @Override
    public Family createNewFamily(Human father, Human mother) {
        return familyDao.createNewFamily(father, mother);
    }

    @Override
    public Family bornChild(Family family, String maleName, String femaleName) {
        return familyDao.bornChild(family, maleName, femaleName);
    }

    @Override
    public Family adoptChild(Family family, Human child) {
        return familyDao.adoptChild(family, child);
    }

    @Override
    public Family deleteAllChildrenOlderThen(int age) {
        return familyDao.deleteAllChildrenOlderThen(age);
    }

    @Override
    public int count() {
        return familyDao.count();
    }

    @Override
    public Optional<Family> getFamilyById(int index) {
        return familyDao.getFamilyById(index);
    }

    @Override
    public Set<Pet> getPets(int index) {
        return (Set<Pet>) familyDao.getPets(index);
    }

    @Override
    public void addPet(int index, Pet pet) {
        familyDao.addPet(index, pet);
    }

    @Override
    public void deletePet(int index) {
        familyDao.deletePet(index);
    }
}
