import java.util.Scanner;

class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void printInfo() {
        System.out.println("Name: " + name + " Age: " + age);
    }
}

public class ConstructorPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scan.nextLine();

        System.out.print("Enter age: ");
        int age = scan.nextInt();
        Person info = new Person(name, age);
        info.printInfo();
        scan.close();

        System.out.print("*\n**\n***\n****\n*****");
    }
}
