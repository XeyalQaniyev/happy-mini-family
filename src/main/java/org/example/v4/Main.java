package org.example.v4;

import org.example.v4.bean.Family;
import org.example.v4.bean.FamilyManager;
import org.example.v4.bean.Human;
import org.example.v4.bean.Man;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static {
        System.out.println("Family class is being loaded");
    }

    {
        System.out.println("A new object is created (type: " + getClass().getSimpleName() + ")");
    }

    public static void main(String[] args) {

        Family family = new Family();

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Emma");
        names.add("Michael");
        names.add("Sophia");

        double fatherIQ = 120.0;
        double motherIQ = 115.0;

        FamilyManager familyManager = new FamilyManager(family);
        Human child = familyManager.bornChild(family, "Father's Name", names, fatherIQ, motherIQ);

        System.out.println("Child's Name: " + child.getName());
        System.out.println("Child's Father: " + child.getFatherName());
        System.out.println("Child's IQ: " + child.getIq());
        System.out.println("Child's Sex: " + (child instanceof Man ? "Male" : "Female"));


    }
}



