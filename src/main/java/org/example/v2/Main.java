package org.example.v2;

public class Main {
    static {
        System.out.println("Family class is being loaded");
    }

    {
        System.out.println("A new object is created (type: " + getClass().getSimpleName() + ")");
    }

    public static void main(String[] args) {
        Family family = new Family(new Human("Oppenheimer", "Doe", 30), new Human("Barbie", "Doe", 28));

       String [][] activitiesAndDay ={
               {"Workout",DayOfWeek.MONDAY.toString()},
               {"Sleep time",DayOfWeek.TUESDAY.toString()},
               {"Study",DayOfWeek.WEDNESDAY.toString()},
               {"Vacation",DayOfWeek.THURSDAY.toString()},
               {"Cinema",DayOfWeek.FRIDAY.toString()},
               {"Traveling",DayOfWeek.SATURDAY.toString()},
               {"Working",DayOfWeek.SUNDAY.toString()}
        };
       for(String [] activitiyAndDay :activitiesAndDay ){
           String activity =activitiyAndDay[0];
           String dayOfWeek = activitiyAndDay[1];
           System.out.println("Day: " + dayOfWeek +" "+", Activity: " + activity );
       }

//   TESTING HUMAN GARBAGE COLLECTOR
//        for (int i = 10_000; i <10_000_000 ; i++) {
//          new Human();
//        }
    }
}
