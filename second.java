import java.util.*;
class second {
    public static void main(String[] args) {
        //Swap a two intiger variable without using third variable
//         int a=2;
//         int b=3;
//         System.out.println("a : "+a+"b : "+b);
//         a=a+b;
//         b=a-b;
//         a=a-b;
//         System.out.println("after swap : "+a+"  "+b);

//         //Find the ASCII value of a character
//         char a='A';
//         int b=(int)a;
//         System.out.println(a);
//         System.out.println(b );

        //sum of digit of integer
        //Scanner sc = new Scanner(System.in);
//
//         System.out.print("Enter an integer: ");
//         int number = scanner.nextInt();
//         int sum = 0;
//
//
//         while (number != 0) {
//             sum += number % 10;
//             number /= 10;
//         }

//         System.out.println("The sum of the digits is: " + sum);
//         System.out.println("Enter the no:");
//         int no =scanner.nextInt();
//         if((no & 1)==0){
//             System.out.println("even");
//         }
//         else{
//             System.out.println("odd");
//         }

        //explain the memory usage with the help of variable

        //WAP to calculate a factorial of even number

//                 System.out.print("Enter an even number: ");
//                 int number = scanner.nextInt();
//
//                 if (number % 2 == 0) {
//                     long factorial = 1;
//                     for (int i = 1; i <= number; i++) {
//                         factorial *= i;
//                     }
//                     System.out.println("Factorial of " + number + " is " + factorial);
//                 } else {
//                     System.out.println("Please enter an even number.");
//                 }


        //question 1
//         System.out.println("enter the pricple amount :");
//         double princple =sc.nextDouble();
//         if(princple<0 || princple>100000){
//             System.out.println("Invalid input!!!!");
//         }
//         System.out.println("intrest rate");
//         double rate=sc.nextDouble();
//         if(rate<0||rate>100){
//             System.out.println("invalid rate!!");
//         }
//
//         System.out.println("intrest Time");
//         double Time=sc.nextDouble();
//         if(Time<0||Time>30){
//             System.out.println("invalid rate!!");
//         }
//
//         double simpleInterest = (princple * rate * Time) / 100;
//         System.out.printf("Simple Interest : %.2f%n",simpleInterest );
//


        //Question 2
//         System.out.println("enter the temp in fehrenheit :");
//         double temp =sc.nextDouble();
//         if(temp<=-100 || temp>=300) {
//             System.out.println("Invalid input!!!!");
//         }
//         double celcius=(5.0/9)*(temp-32);
//         System.out.printf("temp in celcius : %.2f%n",celcius);

        // write a program to print the table of any number.
//         Scanner sc=new Scanner(System.in);
//         int a= sc.nextInt();
//         for(int i=0;a>10;i++){
//             System.out.println("");
//         }
        //
        // wap a program to print the prime number using loop
        Scanner sc = new Scanner(System.in);
        // int a= sc.nextInt();

//                 int n = 10;
//                 for (int i = 2; i <= n; i++) {
//                     boolean isPrime = true;
//
//                     for (int j = 2; j <= i;j++) {
//                         if (i % j == 0) {
//                             isPrime = false;
//                             break;
//                         }
//                     }
//
//                     if (isPrime) {
//                         System.out.print(i + " ");
//                     }
//                 }

//         System.out.println("enter the no : ");
//                    int r=sc.nextInt();
//                     for (int i = 1; i <= r; i++) {
//                       for (int j = 1; j <= i; j++) {
//                         System.out.print("*");
//                     }
//                     System.out.println();
//                 }
//         System.out.println("enter the value (true/false) : ");
//         boolean b1=sc.nextBoolean();
//         System.out.println("enter the value (True/False) : ");
//         boolean b2=sc.nextBoolean();
//
//         boolean andR =b1&&b2;
//         boolean orR =b1||b2;
//         boolean notb1 =!b1;
//         boolean notb2 =!b2;

//         System.out.println("AND : "+andR);
//         System.out.println("OR : "+orR);
//         System.out.println("not AND : "+notb1);
//         System.out.println("not OR : "+notb2);
//
//
//         System.out.println("Enter the student's score (0-100): ");
//         int score = sc.nextInt();
//         char grade;
//         if (score >= 90) {
//             grade = 'A';
//         } else if (score >= 80) {
//             grade = 'B';
//         } else if (score >= 70) {
//             grade = 'C';
//         } else if (score >= 60) {
//             grade = 'D';
//         } else {
//             grade = 'F';
//         }
//         System.out.println("The grade is: " + grade);
//
//
//
//         System.out.println("Enter numbers (enter 0 to stop):");
//             while (true) {
//             int number = sc.nextInt();
//             if (number == 0) {
//                 break;
//             }
//             System.out.println("You entered: " + number);
//         }
//             System.out.println("Program ended.");

//
//         System.out.println("inter the no of column.");
//             int rows= sc.nextInt();
//
//         for (int i = 1; i <= rows; i++) {
//             if (i % 2 != 0) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= 4; j++) {
//                 System.out.print("+");
//             }
//             System.out.println();
//         }

        //ternary operator

//         int a = 5, b = 10, c = 15;
//
//         // Finding the largest of three numbers
//         int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
//
//         System.out.println("The largest number is: " + largest);

        //wap to print a pyramid using loop

        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Fibonacci Series using  for loop

        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();
        int first = 0, second = 1;
        System.out.println("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        //Fibonacci Series using  while loop

        

    }
}
