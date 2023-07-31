package org.example.v4.bean;

import org.example.v4.inter.HumanCreator;

import java.util.List;
import java.util.Random;

public class FamilyManager implements HumanCreator {

    private Family currentFamily;

    public FamilyManager(Family currentFamily) {
        this.currentFamily = currentFamily;
    }

    @Override
    public Human bornChild(Family family, String fatherName, List<String> names, double fatherIQ, double motherIQ) {
        Random random = new Random();

        boolean isMale = random.nextBoolean();
        String childName = names.get(random.nextInt(names.size()));
        double averageIQ = (fatherIQ + motherIQ) / 2.0;

        if (isMale) {
            return new Man(family, fatherName, childName, averageIQ);
        } else {
            return new Woman(family, fatherName, childName, averageIQ);
        }
    }
}
