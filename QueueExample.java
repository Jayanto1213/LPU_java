package LPU_java;

import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        // Create a bounded queue with a capacity limit
        Queue<Integer> queue = new LinkedList<>();

        // Add elements to the queue
        System.out.println("Adding 1: " + queue.add(1)); // Returns true
        System.out.println("Adding 2: " + queue.add(2)); // Returns true

        // Simulate a bounded queue scenario by limiting its size manually
        if (queue.size() >= 2) {
            try {
                System.out.println("Attempting to add 3: ");
                throw new IllegalStateException("Queue is full!");
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        }

        // Print the queue
        System.out.println("Queue elements: " + queue);
    }
}
