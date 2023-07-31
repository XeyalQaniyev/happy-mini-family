package org.example.v4.inter;

import org.example.v4.bean.Family;
import org.example.v4.bean.Human;

import java.util.List;

public interface HumanCreator {
    Human bornChild(Family family, String fatherName, List<String> names, double fatherIQ, double motherIQ);
}