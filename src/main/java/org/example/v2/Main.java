package org.example.v2;


public class Main {
    public static void main(String[] args) throws Throwable {

//        Human father = new Human();
//        father.setName("Akif");
//        father.setIq(135);
//        father.setYear(1985);
//        father.setSurname("Akifzade");
//        father.setSchedule(new String[][]{{DayOfWeek.MONDAY.toString(), "Word"}, {DayOfWeek.THURSDAY.toString(), "work"}});
//
//        Human mother = new Human();
//        mother.setName("Name");
//        mother.setSurname("namezade");
//        mother.setIq(135);
//        mother.setSchedule(new String[][]{{DayOfWeek.MONDAY.toString(), "Word"}, {DayOfWeek.THURSDAY.toString(), "work"}});
//
//        Pet pet = new Pet();
//        pet.setNickname("Tiger");
//        pet.setSpecies(PetSpecies.Cat);
//        pet.setAge(3);
//        pet.setHabits(new String[]{"eat", "drink", "sleep"});
//        pet.setTrickLevel(75);
//
//        Human[] children = new Human[2];
//        children[0] = new Human("Child1", "Akifzade", 1998, 100, new String[][]{{DayOfWeek.MONDAY.toString(), "School"}, {DayOfWeek.FRIDAY.toString(), "Sport Section"}});
//        children[1] = new Human("Child2", "Akifzade", 2008, 75, new String[][]{{DayOfWeek.MONDAY.toString(), "School"}, {DayOfWeek.FRIDAY.toString(), "Sport Section"}});
//
//        Family family = new Family(father, mother, pet, children);
//        Human child3 = new Human("Child3", "Akifzade", 2009, 112, new String[][]{{DayOfWeek.MONDAY.toString(), "School"}, {DayOfWeek.FRIDAY.toString(), "Sport Section"}});
//
//        family.addChild(child3);
//        System.out.println(family.countFamily());
//
//        DayOfWeek nextDay = DayOfWeek.SUNDAY;
//        System.out.println("Tomorrow is: " + nextDay.name());
//
//        for (int i = 0; i < 1000000000; i++) {
//            father.finalize();
//        }

        Human father = new Human("John", "Smith", 1970);
        Human mother = new Human("Jane", "Smith", 1970);
        Family family = new Family(father, mother);

        Human child = new Human("John", "Smith", 2000);
        Human child2 = new Human("Jane", "Smith", 2000);
        Human child3 = new Human("John", "Smith", 2000);
        Human child4 = new Human("Jane", "Smith", 2000);
        Human child5 = new Human("John", "Smith", 2000);

        family.addChild(child);
        family.addChild(child2);
        family.addChild(child3);
        family.addChild(child4);
        family.addChild(child5);

        System.out.println(family.getChildren().length);
    }
}
