package LPU_java;
// Define an Enum
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class EnumExample {
    public static void main(String[] args) {
        // Using Enum
        Day today = Day.THURSDAY;
        System.out.println("Today is: " + today);
    }
}

