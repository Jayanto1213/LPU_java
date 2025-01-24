package LPU_java;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the year");
        int n= sc.nextInt();
        if(n%4==0){
            if (n%100==0){
                if (n % 400 == 0) {
                    System.out.println("Leap yaer");


                }
            }

        }
        else {
            System.out.println("not leap year");
        }

    }
}
