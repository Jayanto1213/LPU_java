package LPU_java;

import java.util.Scanner;

public class butterfly_pattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter the number : ");
        int n= sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-1);j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
