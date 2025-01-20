package LPU_java;

import java.util.Scanner;

public class Empluyee1 {
    Scanner sc=new Scanner(System.in);
    String make;
    String model;
    int year;
    //no argument constructor
    public Empluyee1(){
        this.make=sc.nextLine();
        this.model=sc.nextLine();
        this.year=sc.nextInt();
    }
    //parameterized constructer
    public Empluyee1(String make,String model,int year){
        this.make=make;
        this.model=model;
        this.year=year;

    }
    public void body(){
        System.out.println("the  model is "+make+" "+year+" "+model+" is not found");
    }

    public static void main(String[] args) {


        Empluyee1 emp=new Empluyee1();
        System.out.println((emp.year)+" "+(emp.model));
        emp.body();
    }

}
