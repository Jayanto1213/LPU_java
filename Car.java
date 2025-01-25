package LPU_java;

import java.util.Scanner;

public class Car {
    private String name;
    private String model;

//make a constructor to hold the parameters
public Car(String name, String model){
    super();
    this.name=name;
    this.model=model;

}
public void Display(){
    System.out.println("name of the car : "+name);
    System.out.println("Model of the car : "+model);
}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the car name : ");
    String name=sc.nextLine();
    System.out.println("Enter th ecar model : ");
    String model=sc.nextLine();
    //create a constructor and pass the parameter which was taken in the constructor method
    Car car=new Car(name,model);

    //Display the display method by calling object;
    car.Display();

}
}
