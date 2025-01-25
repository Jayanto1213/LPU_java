package LPU_java;

import java.util.Scanner;

public class NewArray {
    public static void main(String[] args) {
//        float arr[]={1,3,4,5,6};
//        double sum=0;
//
//        for(int i=0;i< arr.length;i++){
//            sum=sum+arr[i];
//
//        }
//        System.out.println("sum of all array is : "+sum);

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n= sc.nextInt();
        int arr[]=new int[n];


        System.out.println("Enter the elements : ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("Enterr the number to check the number is present or not");
        int input=sc.nextInt();

        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==input){
                count=1;
            }
        }
        if (count == 1) {

            System.out.println("present");
        }
        else {
            System.out.println("not present");
        }
    }
}
