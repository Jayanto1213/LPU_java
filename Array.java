package LPU_java;
import java.util.Scanner;

class Array {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the size of the array");
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        System.out.println("enter the numbers");
//        for (int i = 0; i < n; i++) {
//
//            arr[i] = sc.nextInt();
//
//
//        }
//        for (int i = 0; i < n; i++) {
//
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//}

        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[3][3];

        System.out.println("Enter 9 numbers for a 3x3 matrix:");

        // Take user input for the 3x3 matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter value for element [" + (i + 1) + "][" + (j + 1) + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        // Display the 3x3 array
        System.out.println("The 3x3 matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
