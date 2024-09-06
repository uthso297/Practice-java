/*
 * Write a Java program to create a class called Constants with a static final variable 'PI' initialized to 3.14159. Create a method to calculate the area of a circle given its radius, using the 'PI' constant. Demonstrate the method in the main method.
 */

class Constants{
    static final double PI = 3.14159;

    public static void Circle(double radius){
        double area = PI*radius*radius;
        System.out.println("Area of the circle is: " + area);
    }
}

public class Practice13{
    public static void main(String[] args){
    Constants.Circle(23);
    
    }
}