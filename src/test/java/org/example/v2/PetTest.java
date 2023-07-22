package org.example.v2;

import org.junit.jupiter.api.Test;

public final class PetTest {
    @Test
    public void testEat_PrintStreamPrintln() {
        Pet pet = new Pet();

        pet.eat();
    }

    @Test
    public void testFoul_PrintStreamPrintln() {
        Pet pet = new Pet();

        pet.foul();
    }

    @Test
    public void testRespond_PrintStreamPrintf() {
        Pet pet = new Pet(null, null, 0, 0, null);

        pet.respond();
    }
}
