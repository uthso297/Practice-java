/*
 * Write a Java program to create a class called Classroom with instance variables className and students (an array of strings). Implement a parameterized constructor that initializes these variables. Print the values of the variables.
 */


class Classroom{
    String className;
    String[] students;

    public Classroom(String className,String[] students){

        this.className = className;
        this.students = students;

    }

    public void printInfo(){
        System.out.println("Class Name: " + className);
        System.out.print("Students: ");
        for (String student : students) {
            System.out.print(student + " ");
        }
    }
}


public class Practice9{
    public static void main(String[] args){

   

    String className = "SWE DIU";
    String[] students = {"Uthso","Sihab"};

    Classroom obj1 = new Classroom(className,students);
    obj1.printInfo();
    }
}