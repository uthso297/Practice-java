// Write a Java program to create a class called "Cat" with instance variables name and age. Implement a default constructor that initializes the name to "Unknown" and the age to 0. Print the values of the variables.

class Cat {
    public String name;
    public int age;

    public Cat() {
        this.name = "Unknown";
        this.age = 0;
    }
}

public class Practice4 {
    public static void main(String[] args) {
        Cat obj1 = new Cat();
        System.out.println(obj1.name);
        System.out.print(obj1.age);
    }
}