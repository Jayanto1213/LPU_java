package LPU_java;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    public String getName(){
        return name;

    }
    public void setName(String name){
        this.name=name;

    }
    public int getAge(){
        return age;

    }
    public void setAge(int age){
        if(age>=0){
            this.age=age;

        }
        else{
            System.out.println("not valid input please reenter : ");
        }
    }
    public void Display(){
        System.out.println("name of the candidate is : "+name);
        System.out.println("age of the candidate is : "+age);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the candidate : ");
        String name=sc.nextLine();
        System.out.println("Enter the age of the candidate : ");
        int age=sc.nextInt();
        Person person=new Person();
        person.setName(name);
        person.setAge(age);
        person.Display();
    }
}
