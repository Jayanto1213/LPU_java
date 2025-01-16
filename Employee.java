package LPU;
import java.util.*;
class Employee {
    private int id;
    private String name;
    private String dob;
    private double salary;
    public void setDetails(int id, String name, String dob, double salary) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.salary = salary;
    }
        public void display() {
        System.out.println("Employee Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Salary: $" + salary);
    }
}

 class EmployeeDetails {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter Employee ID: ");
         int id = sc.nextInt();
         sc.nextLine();
         System.out.print("Enter Employee Name: ");
         String name = sc.nextLine();
         System.out.print("Enter Employee Date of Birth : ");
         String dob = sc.nextLine();
         System.out.print("Enter Employee Salary: ");
         double salary = sc.nextDouble();
Employee emp =new Employee();
         emp.setDetails(id, name, dob, salary);
         emp.display();


     }
 }


