package LPU_java;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number one : ");
        double n =sc.nextDouble();
        System.out.println("Enter the second Number : ");
        double n1 =sc.nextDouble();
        double sum;
        int result=sc.nextInt();
        switch(result){
            case 1:
                sum=n+n1;
                System.out.println(sum);
                break;


            case 2:
                sum=n*n1;
                System.out.println(sum);
                break;


            case 3:
                sum=n/n1;
                System.out.println(sum);
                break;



            case 4:
                sum=n-n1;
                System.out.println(sum);
                break;


        }

    }
}
