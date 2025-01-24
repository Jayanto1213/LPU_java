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
//        int[][] array = new int[3][3];
//
//        System.out.println("Enter 9 numbers for a 3x3 matrix:");
//
//        // Take user input for the 3x3 matrix
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print("Enter value for element [" + (i + 1) + "][" + (j + 1) + "]: ");
//                array[i][j] = scanner.nextInt();
//            }
//        }
//
//        // Display the 3x3 array
//        System.out.println("The 3x3 matrix is:");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(array[i][j] + " find a   largest element of  unshorted array");
//            }
//            System.out.println();
//        }
//        scanner.close();


//                int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5}; // Example array
//                int largest = findLargestElement(arr);
//                System.out.println("find The second largest element in the array is: " + largest);
//            }
//
//            public static int findLargestElement(int[] arr) {
//                int max = arr[0];
//                for (int i = 1; i < arr.length; i++) {
//                    if (arr[i] > max) {
//                        max = arr[i];
//                    }
//                }
//
//                return max;


                System.out.print("Enter the number of elements in the array: ");
                int n = scanner.nextInt();

                if (n < 2) {
                    System.out.println("Array must have at least 2 elements.");
                    return;
                }

                int[] arr = new int[n];
                System.out.println("Enter the elements of the array:");
                for (int i = 0; i < n; i++) {
                    arr[i] = scanner.nextInt();
                }
                int largest = Integer.MIN_VALUE;
                int secondLargest = Integer.MIN_VALUE;

                for (int num : arr) {
                    if (num > largest) {
                        secondLargest = largest;
                        largest = num;
                    } else if (num > secondLargest && num != largest) {
                        secondLargest = num;
                    }
                }
                if (secondLargest == Integer.MIN_VALUE) {
                    System.out.println("No second largest element found.");
                } else {
                    System.out.println("The second largest element is: " + secondLargest);
                }


            }
}