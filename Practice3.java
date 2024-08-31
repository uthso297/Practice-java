// Write a Java program to print the area of a circle.

import java.util.Scanner;

class Circle{
    float radius;
    float area;

    void calculateArea(){
        this.area = 3.1416f * radius * radius;
    }
}

public class Practice3{

    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);

        Circle getArea = new Circle();

        System.out.println("Enter radius: ");
        getArea.radius = input.nextFloat();
        getArea.calculateArea();

        System.out.println("Are: " + getArea.area);

        input.close();

    }
}