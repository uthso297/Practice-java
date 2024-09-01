/*
 * 
Constructor with Validation
Write a Java program to create a class called Account with instance variables accountNumber and balance. Implement a parameterized constructor that initializes these variables with validation:

accountNumber should be non-null and non-empty.
balance should be non-negative.
Print an error message if the validation fails.
 */
import java.util.Scanner;

 class Account{

    int accountNumber;
    double balance;


    public Account(int accountNumber,double balance){

    if(accountNumber<0){
        System.out.println("Invalid account number");
        this.accountNumber = -1;
    }
    else{
        this.accountNumber = accountNumber;
    }
    if(balance<0){
        System.out.println("Invalid balance");
        this.balance = -1;
    }
    else{
        this.balance = balance;
    }

    }
 }

public class Practice8{

    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter your account Number: ");
    int accountNumber = scan.nextInt();

    System.out.println("Enter your balance: ");

    double balance = scan.nextDouble();

    Account obj1 = new Account(accountNumber,balance);

    
    if(obj1.accountNumber>=0){
        System.out.println("Your account Number is: " + obj1.accountNumber);
    }

    if(obj1.balance>=0){
        System.out.println("Your balance is: " + obj1.balance);
    }

    scan.close();

    }
}
