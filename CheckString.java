package LPU_java;

import java.util.Scanner;

public class CheckString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Sting : ");
        String input = sc.nextLine();
        String uppercase = input.toUpperCase();
        System.out.println("UpperCase : "+uppercase);
        String lowercase=input.toLowerCase();
        System.out.println("LowerCase :"+lowercase);
        String reverse= new StringBuilder(input).reverse().toString();
        System.out.println("Reversed : "+reverse);
        if (input.equalsIgnoreCase(reverse)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
