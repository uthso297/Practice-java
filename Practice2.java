// Write a Java program to print the sum of two numbers.

import java.util.Scanner;

public class Practice2{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int num1;
        System.out.println("Enter your first number: ");
        num1 = input.nextInt();
        int num2;
        System.out.println("Enter your second number: ");
        num2 = input.nextInt();
    
        int num3 = num1+num2;
        System.out.println("Result: " + num3);
        input.close();
    }

   
    
     
}