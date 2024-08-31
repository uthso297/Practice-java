// Write a Java program to create a class called Dog with instance variables name and color. Implement a parameterized constructor that takes name and color as parameters and initializes the instance variables. Print the values of the variables.

class Dog {
    private String name;
    private String color;


    public Dog(String name,String color){
        this.name = name;
        this.color = color;
    }

    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
}

public class Practice5 {
    public static void main(String[] args) {
    Dog obj1 = new Dog("Husky","Black");
    System.out.println(obj1.getName());
    System.out.print(obj1.getColor());
    }
}