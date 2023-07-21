package org.example.v2;

public enum ExtracurricularActivities {
    EAT("Eating"),
    RESPOND("What are you doing"),
    SLEEP("Sleep"),
    WALK("Walk");


    private final String activity;
    ExtracurricularActivities(String activity) {
        this.activity=activity;
    }
    public String getActivity(){
        return activity;
    }
}
