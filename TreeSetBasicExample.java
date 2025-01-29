package LPU_java;

import java.util.TreeSet;

public class TreeSetBasicExample {
    public static void main(String[] args) {
        // Create a TreeSet to store numbers
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add some numbers to the TreeSet
        numbers.add(8);
        numbers.add(3);
        numbers.add(10);
        numbers.add(1);

        // Print the TreeSet (it will automatically sort the numbers)
        System.out.println("TreeSet: " + numbers);

        // Try adding a duplicate number
        numbers.add(3); // TreeSet does not allow duplicates
        System.out.println("After trying to add duplicate (3): " + numbers);

        // Check if a number exists in the TreeSet
        System.out.println("Does TreeSet contain 10? " + numbers.contains(10)); // true

        // Remove a number
        numbers.remove(8);
        System.out.println("After removing 8: " + numbers);

        // Print the smallest and largest numbers
        System.out.println("Smallest number: " + numbers.first());  // 1
        System.out.println("Largest number: " + numbers.last());    // 10
    }
}
