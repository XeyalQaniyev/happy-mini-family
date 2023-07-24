package org.example.v2;

import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mockConstruction;
import static org.mockito.Mockito.when;

public final class PetTest {
    @Test
    public void testDescribePet_GetTrickLevelLessThan50() {
        Pet pet = new Pet(null, null, -255, 49, null);

        pet.describePet();
    }

    @Test
    public void testDescribePet_GetTrickLevelGreaterOrEqual50() {
        Pet pet = new Pet(null, null, 0, 50, null);

        pet.describePet();
    }

    @Test
    public void testEat_PrintStreamPrintln() {
        Pet pet = new Pet();

        pet.eat();
    }

    @Test
    public void testFeedPet_Isfeed() {
        Pet pet = new Pet(null, null, 0, 0, null);

        pet.feedPet(true);
    }

    @Test
    public void testFeedPet_GetTrickLevelLessOrEqualRValue() {
        org.mockito.MockedConstruction mockedConstruction = null;
        try {
            mockedConstruction = mockConstruction(java.util.Random.class, (java.util.Random randomMock, org.mockito.MockedConstruction.Context context) -> (when(randomMock.nextInt(anyInt()))).thenReturn(-48));
            Pet pet = new Pet(null, null, 0, -48, null);

            pet.feedPet(false);
        } finally {
            mockedConstruction.close();
        }
    }

    @Test
    public void testFeedPet_GetTrickLevelLessThanRValue() {
        org.mockito.MockedConstruction mockedConstruction = null;
        try {
            mockedConstruction = mockConstruction(java.util.Random.class, (java.util.Random randomMock, org.mockito.MockedConstruction.Context context) -> (when(randomMock.nextInt(anyInt()))).thenReturn(128));
            Pet pet = new Pet(null, null, 0, 127, null);

            pet.feedPet(false);
        } finally {
            mockedConstruction.close();
        }
    }

    @Test
    public void testFeedPet1() {
        org.mockito.MockedConstruction mockedConstruction = null;
        try {
            mockedConstruction = mockConstruction(java.util.Random.class, (java.util.Random randomMock, org.mockito.MockedConstruction.Context context) -> (when(randomMock.nextInt(anyInt()))).thenReturn(Integer.MIN_VALUE));
            Pet pet = new Pet(null, null, 0, 1, null);

            pet.feedPet(false);
        } finally {
            mockedConstruction.close();
        }
    }

    public void testFeedPet_errors() {
    }

    @Test
    public void testFoul_PrintStreamPrintln() {
        Pet pet = new Pet();

        pet.foul();
    }

    @Test
    public void testGreetPet_PrintStreamPrintf() {
        Pet pet = new Pet(null, null, 0, 0, null);

        pet.greetPet();
    }

    @Test
    public void testRespond_PrintStreamPrintf() {
        Pet pet = new Pet(null, null, 0, 0, null);

        pet.respond();
    }
}
