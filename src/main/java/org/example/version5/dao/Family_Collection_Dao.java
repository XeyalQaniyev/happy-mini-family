package org.example.version5.dao;

import org.example.version5.objects.Family;
import org.example.version5.objects.Human;
import org.example.version5.objects.Pet;
import org.example.version5.people.Man;
import org.example.version5.people.Woman;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Family_Collection_Dao implements Family_Dao {

    private List<Family> families = new ArrayList<>();

    @Override
    public List<Family> getAllFamilies() {
        return families;
    }

    @Override
    public Optional<Family> getFamilyByIndex(int index) {
        if (index >= 0 && index < families.size()) {
            return Optional.of(families.get(index));
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteFamily(int index) {
        if (index >= 0 && index < families.size()) {
            families.remove(index);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteFamily(Family family) {
        return families.remove(family);
    }

    @Override
    public void saveFamily(Family family) {
        families.add(family);
    }

    @Override
    public int countFamiliesWithMemberNumber(int number) {
        return (int) families.stream().filter(family -> family.countFamily() == number).count();
    }

    @Override
    public List<Family> getFamiliesBiggerThan(int number) {
        List<Family> result = new ArrayList<>();
        for (Family family : families) {
            if (family.countFamily() > number) {
                result.add(family);
            }
        }
        return result;
    }

    @Override
    public List<Family> getFamiliesLessThan(int number) {
        List<Family> result = new ArrayList<>();
        for (Family family : families) {
            if (family.countFamily() < number) {
                result.add(family);
            }
        }
        return result;
    }

    @Override
    public Family createNewFamily(Human father, Human mother) {
        Family family = new Family(father, mother);
        families.add(family);
        return family;
    }

    @Override
    public Family bornChild(Family family, String maleName, String femaleName) {
        Human child;
        if (Math.random() < 0.5) {
            child = new Man(maleName, family.getFather().getSurname(), 0);
        } else {
            child = new Woman(femaleName, family.getMother().getSurname(), 0);
        }
        family.addChild(child);
        return family;
    }

    @Override
    public Family adoptChild(Family family, Human child) {
        if (child instanceof Man) {
            child.setSurname(family.getFather().getSurname());
        } else if (child instanceof Woman) {
            child.setSurname(family.getMother().getSurname());
        }
        family.addChild(child);
        return family;
    }

    @Override
    public Family deleteAllChildrenOlderThen(int age) {
        families.forEach(family -> family.getChildren().removeIf(child -> child.getAge() > age));
        return null;
    }

    @Override
    public int count() {
        return families.size();
    }

    @Override
    public Optional<Family> getFamilyById(int index) {
        if (index >= 0 && index < families.size()) {
            return Optional.of(families.get(index));
        }
        return Optional.empty();
    }


    @Override
    public List<Pet> getPets(int index) {
        if (index >= 0 && index < families.size()) {
            return new ArrayList<>(families.get(index).getPets());
        }
        return null;
    }

    @Override
    public void addPet(int index, Pet pet) {
        if (index >= 0 && index < families.size()) {
            families.get(index).getPets().add(pet);
        }
    }

    @Override
    public void deletePet(int index) {
        if (index >= 0 && index < families.size()) {
            families.get(index).getPets().clear();
        }
    }
}
