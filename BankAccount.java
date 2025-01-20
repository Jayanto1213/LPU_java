package LPU_java;

import java.util.Scanner;

class BankAccount {
    private String  accountnumber;
    private double balance;
    public void Bankaccount(String accountnumber,double initialbalance){
        this.accountnumber=accountnumber;
        this.balance=initialbalance;

    }
    public void deposit(double amount){
        if(amount>0){
            balance +=amount;
            System.out.println("Deposit : "+amount);
        }
        else{
            System.out.println("Deposit money must be positve");
        }

    }
    public void withdraw( double amount ){
        if(amount>0&& amount<=balance){
            balance-=amount;
            System.out.println("withraw : "+amount);
        } else if(amount>balance)  {
            System.out.println("insufficiant amount");
        }
        else {
            System.out.println("invalid input or the amount is in negative");
        }
    }
    public double getBalance(){
        return balance;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        BankAccount account = new BankAccount();
        System.out.println("initial balance = "+account.getBalance());
        account.deposit(400);
        System.out.println("After deposit : "+account.getBalance());
        account.withdraw(300.0);
        System.out.println("Withraw amount : "+account.getBalance());
        account.withdraw(2000.0);
        account.deposit(-40.0);
        account.withdraw(-30.0);
        System.out.println("Available balance : "+account.getBalance());


    }
}
