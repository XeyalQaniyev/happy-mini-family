package org.example.version2;

public enum Species {
    CAT,
    DOG,
    BIRD,
    FISH,
    FOX;
    public String getValue() {
        return this.name();
    }
}
