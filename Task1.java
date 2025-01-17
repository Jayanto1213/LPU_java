package LPU_java;

import java.util.*;
class Task1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to check the number is in range was weird or not wierd : ");
        int input=sc.nextInt();
        if(input%2!=0){
            System.out.println("wierd");
        }
        else{
            if(input>=2&&input<=5){
                System.out.println("Are you serious");
            }
            else if(input>=6&&input<=20) {
                System.out.println("Wierd");
            }
            else if(input>20) {
                System.out.println("Not Wierd");
            }

        }
    }
}
