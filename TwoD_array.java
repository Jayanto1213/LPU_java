package LPU_java;

import java.util.Scanner;

class TwoD_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the element "+(i+1)+" : ");
            arr[i]=sc.nextInt();
        }
        int min= arr[0];
        int max= arr[0];
        for (int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("maximum : "+max);
        System.out.println("minimum : "+min);

    }
}
